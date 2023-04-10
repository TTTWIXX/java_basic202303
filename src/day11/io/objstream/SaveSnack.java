package day11.io.objstream;

import day11.io.rw.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class SaveSnack implements Serializable{
    private static List<Snack> snackList = new ArrayList<>();
    // List는 직렬화가 되어있지만 <Snack>은 객체이므로 직렬화가 되어있지 않다.
    // 따라서 객체를 직렬화 해야 바이트스트림을 통과할수 있음.

    public static void main(String[] args) {

        snackList.add(new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD));
        snackList.add(new Snack("사브레", 1980, 2500, Snack.Taste.BAD));
        snackList.add(new Snack("오징어집", 1985, 1800, Snack.Taste.SOSO));
        saveFile();
    }
    // 객체를 통채로 파일에 저장
    private  static void saveFile(){

        try(FileOutputStream fos=new FileOutputStream(Path.ROOT_PATH+"/snack.sav")){

            // 객체 저장을 위한 보조 스트림
            ObjectOutput oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //serialization 직렬화
        // 객체를 보내려면 일렬로 세워야 한다.
    }


    // 텍스트파일로 리스트 데이터 저장
    private static void saveTextFile() {

        try (FileWriter fw = new FileWriter(Path.ROOT_PATH + "/snack.txt")) {

            for (Snack s : snackList) {
                fw.write(String.format("%s,%d,%d,%s\r\n",
                        s.getSnackName(), s.getYear()
                        ,s.getPrice(), s.getTaste()
                ));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

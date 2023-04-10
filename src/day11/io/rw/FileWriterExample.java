package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

    public static void main(String[] args) {

        try(FileWriter fw=new FileWriter("D:/exercise/메롱.txt")){
            String s="ㅋ";
            fw.write(s);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

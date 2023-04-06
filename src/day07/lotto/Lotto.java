package day07.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

    static Scanner sc;
    private static int[] temp = new int[6];
    static int[] lottoList = new int[6];

    private static int makeRandom() {
        int rd = (int) (Math.random() * 45 + 1);
        return rd;
    }

    public static int[] makeList() {

        for (int i = 0; i < lottoList.length; i++) {
            lottoList[i] = makeRandom();
        }
//        System.out.println(lottoList);
        return lottoList;
    }


    public static void information() {

        System.out.println(Arrays.toString(makeList()));

    }


    public static int[] inputNum() {

        for (int i = 0; i < 6; i++) {
            System.out.println("숫자를 입력하세요");
            sc = new Scanner(System.in);
            temp[i] = sc.nextInt();
            if (temp[i] > 45 || temp[i] < 0) {
                System.out.println("숫자를 다시입력하세요");
                System.exit(0);
            }
        }

        return temp;
    }

    public static boolean checkDouble(int[] temp) {

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    return false;
                }
            }
        }
        return true;

    }


    public static void checkLotto() {
        //1등 당첨 번호
        int[] b = inputNum();
        System.out.println(Arrays.toString(b));
        int count = 1;
        while (true) {
            int[] a = makeList();
            if (checkDouble(a)) {
                if (Arrays.equals(a, b)) {
                    System.out.println(count + "번만에 당첨!!");
                    break;
                } else {
                    count++;
                    System.out.println(count + "번째");
                }
            }
        }

    }

}

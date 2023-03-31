package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myName = new String("홍길동"); //이게 원래 구조
        String inputName = sc.nextLine();

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        // 기본타입은 == 으로 비교 가능
        // 객체 타입은 equals로 비교


        if (myName.equals(inputName)) {
            System.out.println("두 이름이 일치함!");
        } else {
            System.out.println("두 이름이 일치하지 않음!");
        }

    }
}
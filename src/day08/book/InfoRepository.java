package day08.book;

import day05.member.Gender;

import java.util.Scanner;

public class InfoRepository {
    Scanner sc;
    Gender gender;
    BookUser bookUser;

    public void insertInfo() {
        bookUser = new BookUser();
        sc = new Scanner(System.in);

        while (true) {
            System.out.println("# 회원 정보를 입력해주세요");
            System.out.println("이름 : ");
            String name = sc.next();
            bookUser.setName(name);

            System.out.println("나이 : ");
            int age = sc.nextInt();
            bookUser.setAge(age);

            System.out.println("성별 : [M/F]");

            String convertGender = sc.next();
            if (convertGender.toUpperCase().charAt(0) == 'M') {
                gender = Gender.MALE;
                bookUser.setGender(gender);
                break;
            } else if (convertGender.toUpperCase().charAt(0) == 'F') {
                gender = Gender.FEMALE;
                bookUser.setGender(gender);
                break;
            } else {
                System.out.println("성별을 다시 입력하세요");
            }

        }

    }



}

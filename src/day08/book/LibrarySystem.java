package day08.book;

import java.util.Scanner;

public class LibrarySystem {
    InfoRepository ifr=new InfoRepository();
    BookUser bookUser=new BookUser();
    public void showMenu() {

        ifr.insertInfo();
        System.out.println("============도서 메뉴============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료");
        System.out.println("- 메뉴 번호: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정확한 값을 입력하세요");
        }

        switch (num) {
            case 1: {

                System.out.println(bookUser.getName() + " " + bookUser.getAge() + " " + " " + bookUser.getGender() + " " + bookUser.getCouponCount());
                break;
            }
            case 2:{

            }
            default:
                System.out.println("default");

        }


    }


}

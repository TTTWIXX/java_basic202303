package testJava;

import day05.member.Member;

import java.util.Scanner;

public class TestMemberView {
    Scanner sc;
    TestMemberRepository tmr;

    public TestMemberView(Scanner sc, TestMemberRepository tmr) {
        this.sc = sc;
        this.tmr = tmr;
    }

    String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        mainView();
        String menuNum = input(">> ");

        switch (menuNum) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:


        }


    }

    // 회원 등록
    void signUp() {
        System.out.println("\n# 회원 등록을 시작합니다.!!");

        String email;
        while (true) {
            email = input("# 이메일 : ");
            if (!tmr.isDuplicateEmail(email)) {
                break;
            } else
                System.out.println("#중복된 이메일입니다.");
        }
        String name = input("# 이름: ");
        String password = input("# 비밀번호: ");
        Gender gender;
        checkGender:
        while (true) {
            String inputGender = input("# 성별[M/F] : ");
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = Gender.MALE;
                    break checkGender;
                case 'F':
                    gender = Gender.FEMALE;
                    break checkGender;
                default:
                    System.out.println("# 성별을 M/F로 정확히 입력하세요");

            }

        }

        int age = Integer.parseInt(input("# 나이: "));
        TestMember newMember = new TestMember(tmr.getLastMemberId() + 1, email,
                password, name, gender, age
        );

    }

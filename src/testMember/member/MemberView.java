package testMember.member;

import java.util.Scanner;

import static testMember.member.Gender.*;
import static testMember.member.Gender.FEMALE;
import static testMember.member.Gender.MALE;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
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
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    showDetailMember();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePasswordViewProcess();
                    break;
                case "5":
//                    if(mr.isEm)
                    removeMemberViewProcess();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    private void stop() {

        String inputEnter = input("======= 엔터를 눌러서 계속...======\n");
        sc.nextLine();

    }

    private void showDetailMember() {

        String email = input("# 이메일");
        if (mr.isDuplicate(email)) {
            Member user = mr.findUser(email);
            System.out.println("======조회 결과======");
            System.out.println("# 이름 : " + user.memberName);
            System.out.println("# 비밀번호 : " + user.password);
            System.out.println("# 성별 : " + user.gender);
            System.out.println("# 나이 : " + user.age + "세");
        } else {
            System.out.println("회원이 존재하지 않습니다.");
        }


    }

    void removeMemberViewProcess() {
        // 삭제대상 이메일 입력받기
        String deleteEmail = input("# 삭제할 email을 입력하세요\n>> ");
        // 존재하는지 확인 후 삭제 처리 위임
        if (mr.findIndex(deleteEmail) != -1) {

            String choice = input(mr.memberList[mr.findIndex(deleteEmail)].memberName + "님의 정보를 정말 삭제합니까?? [y/n]");

            switch (choice.toLowerCase().charAt(0)) {
                case 'y':
                    Member[] temp = new Member[mr.memberList.length - 1];

                    for (int i = mr.findIndex(deleteEmail); i < temp.length; i++) {
                        temp[i] = mr.memberList[i + 1];
                    }
                    mr.memberList = temp;
                    temp = null;
                case 'n':
                    break;
            }

        } else {
            System.out.println("해당 회원은 존재하지 않습니다.");
        }

        // -> 한번 더 y/n으로 삭제여부 묻기


    }


    //비밀번호 변경 입출력 처리
    void changePasswordViewProcess() {

        mr = new MemberRepository();
        //수정 진행
        String email = input("# 수정할 대상의 이메일 : ");
        String newPassword = input("# 수정할 비밀번호를 입력하세요\n>> ");
        mr.changePassword(email, newPassword);

        //기존 비밀번호와 같으면 변경 취소


    }

    String input(String message) {
        System.out.print(message);
        return sc.nextLine();

    }

    // 엔터를 누르기전까지 멈추는 기능


    // 회원 등록 입력 처리
    void signUp() {

        System.out.println("email 입력하세요");
        String email = input(">>");
        String name;
        while (true) {
            System.out.println("이름을 입력하세요: ");
            name = input(">>");

            if (mr.isDuplicate(name)) {
                System.out.println("중복입니다.");
            } else break;
        }
        String password = input("패스워드를 입력하세요 : ");

        Gender gender;
        outwhile:
        while (true) {
            System.out.println("성별을 입력하세요: [M/F]");
            String convertGender = input(">>");
            switch (convertGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = MALE;
                    break outwhile;
                case 'F':
                    gender = FEMALE;
                    break outwhile;
                default:
                    System.out.println("올바른 값을 입력하세요");
            }
        }
        System.out.println("나이를 입력하세요: ");
        int age = Integer.parseInt(input(">>"));

        Member member = new Member(mr.memberList.length + 1, email, password, name, gender, age);
        mr.addMemberList(member);


    }


    // 회원 개별조회를 위한 입출력처리


    // 이메일 입력하세요!

    // 찾은 회원의 정보 ~~~~~~


}

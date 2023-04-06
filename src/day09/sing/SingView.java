package day09.sing;

import java.util.Arrays;

import static day07.lotto.Lotto.makeList;
import static day07.newutli.Utility.input;
import static day07.newutli.Utility.makeLine;

public class SingView {
    static Sing sing;
    static SingRepository repository;

    static SingView view;

    static {
        view = new SingView();
        repository = new SingRepository();
    }


    static void singMenu() {
        while (true) {
            System.out.println("****음악 관리 프로그램****");
            System.out.println("# 현재 등록된 가수 : ");
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            String num = input(">> ");
            switch (num) {
                case "1":
                    System.out.println("#노래 등록을 시작합니다.");
                    String singerName=input("-가수명 : ");
                    String songName=input("-곡명 : ");
                    repository.saveList(singerName,songName);

                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("정확한 값을 입력해주세요");
                    break;
            }

        }


    }


}

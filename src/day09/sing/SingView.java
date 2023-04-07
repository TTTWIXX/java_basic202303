package day09.sing;


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
            System.out.printf("# 현재 등록된 가수 : %d\n", repository.indexNum());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            String num = input(">> ");
            switch (num) {
                case "1":
                    insertSong();
                    break;
                case "2":
                    findSong();
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("정확한 값을 입력해주세요");
                    break;
            }

        }


    }

    private static void findSong() {
        System.out.println("검색할 가수명을 입력하세요");
        String singer=input(">>");
        if(!repository.isDuplicate(singer)){
            System.out.println(repository.findSongList(singer));
        }else{
            System.out.println("해당 가수는 등록되지 않았습니다.");
        }



    }

    private static void insertSong() {
        System.out.println("#노래 등록을 시작합니다.");
        String singerName = input("-가수명 : ");
        String songName = input("-곡명 : ");
        if (repository.isDuplicate(singerName)) {
            repository.saveList(singerName, songName);
        }
        else{
            repository.saveSecond(singerName,songName);
            System.out.println("노래가 추가되었습니다.");
        }
    }


}

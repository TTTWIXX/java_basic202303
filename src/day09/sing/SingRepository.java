package day09.sing;

import day04.array.StringList;


public class SingRepository {
    Sing sing;
    static StringList songlist;
    static {
        songlist=new StringList();
    }


    // 가수명과 노래명을 입력받아 리스트로 저장하는 함수
    void saveList(String singerName, String songName){
        sing=new Sing();
        sing.setSingerName(singerName);
        // 배열을 만들어서 값을 넣는다.
        sing.setSongList(new StringList(songName));
        System.out.println(sing.getSingerName());
        System.out.println(sing.getSongList());




    }





}

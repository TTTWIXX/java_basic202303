package day09.sing;

import day04.array.StringList;
import day09.musicquiz.Artist;


public class SingRepository {
    static Artist[] repositoryList;
    Artist artist;

    static {
        repositoryList = new Artist[0];

    }


    // 가수명과 노래명을 입력받아 처음 리스트로 저장하는 함수
    void saveList(String singerName, String songName) {
        artist = new Artist();
        artist.setName(singerName);
        artist.setSongList(new StringList(songName));

        Artist[] temp = new Artist[repositoryList.length + 1];
        for (int i = 0; i < repositoryList.length; i++) {
            temp[i] = repositoryList[i];
        }
        temp[temp.length - 1] = artist;
        repositoryList = temp;
        temp = null;

    }



    public int indexNum() {


    return repositoryList.length;
    }

    // 입력한 가수가 중복인지 확인 하는 메소드
    boolean isDuplicate(String singer){
        for (Artist artist1 : repositoryList) {
            if(artist1.getName().equals(singer))
            return false;
        }
        return true;
    }


    public String findSongList(String singer) {
        for (Artist value : repositoryList) {
            if (value.getName().equals(singer)) {
                return value.getSongList().toString();
            }
        }

        return null;
    }

    public void saveSecond(String singer,String songName) {

        for (Artist artist1 : repositoryList) {
           artist1.getSongList().push(songName);

        }
        songListInfo(singer);
    }
    void songListInfo(String singer){
        System.out.println(artist.getSongList());
    }

}

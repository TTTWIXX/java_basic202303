package day10.collection.musicquiz;


import static day09.musicquiz.ArtistView.start;
import static day10.collection.musicquiz.ArtistRepository.*;

public class Main {
    public static void main(String[] args) {
        //세이브파일 자동로드
        loadFile();
        start();
    }
}

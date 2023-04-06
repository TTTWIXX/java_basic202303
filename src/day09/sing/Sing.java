package day09.sing;


import day04.array.StringList;

public class Sing {
    private String singerName;

    private StringList songList;

    public Sing() {
    }

    public Sing(String singerName, StringList songList) {
        this.singerName = singerName;
        this.songList = songList;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public StringList getSongList() {
        return songList;
    }

    public void setSongList(StringList songList) {
        this.songList = songList;
    }
}

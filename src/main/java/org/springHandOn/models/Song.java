package org.springHandOn.models;

public class Song {
    private String songName;
    private String singerName;

    public Song(String songName,String singerName){
        this.songName=songName;
        this.singerName=singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
    @Override
    public String toString(){
        return this.songName+'('+this.singerName+')';
    }
}

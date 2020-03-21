package ru.ratnikov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
//    private Music music;
    private String name;
    private int volume;

    // Inversion of Control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }

    }
}

package ru.ratnikov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<Music>();
    private RapMusic rapMusic;
    private RockMusic rockMusic;
    private Music music;
    private String name;
    private int volume;

    // Inversion of Control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    //    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

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

    public String playMusic() {
        return "Playing: " + rapMusic.getSong();
//        for (Music music : musicList) {
//            System.out.println("Playing: " + rapMusic.getSong());
//            System.out.println("Playing: " + rockMusic.getSong());
//        }

    }
}

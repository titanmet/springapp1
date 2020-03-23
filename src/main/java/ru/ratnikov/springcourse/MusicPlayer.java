package ru.ratnikov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    //    private List<Music> musicList = new ArrayList<Music>();
    private RapMusic rapMusic;
    private RockMusic rockMusic;
    //    @Autowired
//    @Qualifier("rockMusic")
    private Music music;
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    // Inversion of Control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
//        this.rapMusic = rapMusic;
//        this.rockMusic = rockMusic;
//    }

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
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//        for (Music music : musicList) {
//            System.out.println("Playing: " + rapMusic.getSong());
//            System.out.println("Playing: " + rockMusic.getSong());
//        }

    }
}

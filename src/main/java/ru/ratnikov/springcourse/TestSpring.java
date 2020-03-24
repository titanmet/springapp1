package ru.ratnikov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

//
//        Music music = context.getBean("rapMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        Music music1 = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

//        boolean comparison = secondMusicPlayer == musicPlayer;
//        System.out.println(comparison);
//        System.out.println(musicPlayer);
//        System.out.println(secondMusicPlayer);

//        musicPlayer.setVolume(10);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();
//
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        context.close();
    }
}

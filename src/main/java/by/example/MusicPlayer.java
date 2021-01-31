package by.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

//    public String play() {
//        return "Playing: " + music.getSong();
//    }
//
//    public void playSong(TypeOfMusic type) {
//        switch (type) {
//            case RAP:
//                System.out.println(music.getSong());
//                break;
//            case CLASSICAL:
//                System.out.println(music1.getSong());
//                break;
//        }
//    }

    public void play() {
        System.out.println("Playing: " + musicList.get((int) (Math.random() * musicList.size())).getSong());
    }
}

package by.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class RockMusic implements Music {

    @Value("${rockMusic.song}")
    private String song;

    @Override
    public String getSong() {
        return song;
    }
}

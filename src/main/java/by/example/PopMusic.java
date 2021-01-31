package by.example;

import org.springframework.beans.factory.annotation.Value;

public class PopMusic implements Music {
    @Value("${popMusic.song}")
    private String song;

    @Override
    public String getSong() {
        return song;
    }
}

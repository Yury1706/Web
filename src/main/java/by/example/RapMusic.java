package by.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    @Value("${rapMusic.song}")
    private String song;

    @Override
    public String getSong() {
        return song;
    }
}

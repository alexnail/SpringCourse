package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music rock;
    private Music classical;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rock,
                       @Qualifier("classicalMusic") Music classical) {
        this.rock = rock;
        this.classical = classical;
    }

    public String playMusic(MusicGenre genre) {
        switch (genre) {
            case CLASSICAL:
                return "Playing: " + classical.getSong();
            case ROCK:
            default:
                return "Playing: " + rock.getSong();
        }
    }
}

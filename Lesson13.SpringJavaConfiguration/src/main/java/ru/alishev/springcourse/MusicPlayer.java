package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int index = ThreadLocalRandom.current().nextInt(musicList.size());
        return "Playing: " + musicList.get(index).getSong();
    }
}

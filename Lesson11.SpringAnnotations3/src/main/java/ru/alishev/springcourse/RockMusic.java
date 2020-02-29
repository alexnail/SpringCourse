package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {

    private List<String> songs = Arrays.asList("Wind cries Mary", "Fortunate Son", "All along the Watchtower");

    @Override
    public String getSong() {
        int index = ThreadLocalRandom.current().nextInt(songs.size());
        return songs.get(index);
    }
}

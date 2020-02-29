package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {

    private List<String> songs = Arrays.asList("Hungarian Rhapsody", "Symphony No. 5", "Ride of the Valkyries");

    @Override
    public String getSong() {
        int index = ThreadLocalRandom.current().nextInt(songs.size());
        return songs.get(index);
    }
}

package ru.alishev.springcourse;

public class AmbientMusic implements Music {
    @Override
    public String getSong() {
        return "Quarantine";
    }
}

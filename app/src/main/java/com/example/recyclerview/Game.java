package com.example.recyclerview;

public class Game {
    private String name;
    private String platform;

    public Game(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

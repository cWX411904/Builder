package com.example.chengkai.builderdemo.build;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class Room {
    private String window;
    private String floor;

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}

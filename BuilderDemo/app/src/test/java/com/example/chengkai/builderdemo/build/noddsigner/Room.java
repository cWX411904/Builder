package com.example.chengkai.builderdemo.build.noddsigner;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class Room {
    private String window;
    private String floor;

    public void apply(WorkBuilder.RoomParams params) {
        window = params.window;
        floor = params.floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}

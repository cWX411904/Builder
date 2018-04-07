package com.example.chengkai.builderdemo.build.noddsigner;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class WorkBuilder {

    public RoomParams params;

    public WorkBuilder() {
        this.params = new RoomParams();
    }

    public WorkBuilder makeWindow(String window) {
        params.window = window;
        return this;
    }

    public WorkBuilder makeFloor(String floor) {
        params.floor = floor;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.apply(params);
        return room;
    }

    public class RoomParams{
        public String window;
        public String floor;
    }
}

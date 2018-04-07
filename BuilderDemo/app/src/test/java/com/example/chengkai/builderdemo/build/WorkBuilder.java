package com.example.chengkai.builderdemo.build;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class WorkBuilder implements Build {

    private Room room = new Room();

    @Override
    public void makeWindow() {
        room.setWindow("建造窗户");
    }

    @Override
    public void makeFloor() {
        room.setFloor("建造地板");
    }

    @Override
    public Room build() {
        return room;
    }
}

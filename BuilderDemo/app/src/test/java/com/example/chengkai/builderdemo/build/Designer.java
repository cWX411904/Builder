package com.example.chengkai.builderdemo.build;

/**
 * 设计者
 * 他知道房子怎么设计
 * 他会指挥工人去建造
 */

public class Designer {

    public Room build(Build build) {
        build.makeWindow();
        build.makeFloor();
        return build.build();
    }
}

package com.example.chengkai.builderdemo.build;

/**
 * 抽象建造者（图纸）
 * 工人接口，定义了各个工人所需要进行的工作
 * 并不负责具体的建造
 */

public interface Build {

    public void makeWindow();
    public void makeFloor();

    //需要返回一个房子的对象
    public Room build();
}

package com.example.chengkai.builderdemo.build;


import org.junit.Test;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class Client {

    @Test
    public void test() {

        Build worker = new WorkBuilder();
        Designer designer = new Designer();

        Room room = designer.build(worker);
        System.out.print(room);
    }
}

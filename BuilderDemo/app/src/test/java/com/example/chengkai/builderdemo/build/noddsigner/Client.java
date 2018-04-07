package com.example.chengkai.builderdemo.build.noddsigner;

import org.junit.Test;

/**
 * Created by wangsujuan on 2018/4/7.
 */

public class Client {

    @Test
    public void test() {

        Room room = new WorkBuilder()
                .makeWindow("fashi").makeFloor("oushi").build();
        System.out.print(room);
    }
}

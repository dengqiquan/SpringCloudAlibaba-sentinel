package com.study;

import com.study.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StudyApplicationTests {

    @Resource
    private TestController testController;

    @Test
    void contextLoads() {
    }


//    @Test
//    void redisLock() {
//        for (int i = 0; i < 50; i++) {
//            new Thread(){
//                @Override
//                public void run() {
//                    testController.redisLock("9527");
//                }
//            }.start();
//        }
//    }

}

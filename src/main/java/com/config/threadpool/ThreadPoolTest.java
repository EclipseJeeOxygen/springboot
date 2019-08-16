package com.config.threadpool;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author lujiaming
 * @Date 2019/8/16
 * @Description 用于测试线程池配置是否成功的线程类
 **/
@Slf4j
public class ThreadPoolTest implements Runnable {

    String threadName;

    public ThreadPoolTest(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        log.info(threadName + "开始执行");
        try {
            Thread.sleep(1000);
            log.info(threadName + "结束执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

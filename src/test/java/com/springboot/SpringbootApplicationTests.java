package com.springboot;

import com.config.threadpool.ThreadPoolTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
//    @Autowired
//    private TaskExecutor taskExecutor;
//
//    @Async
//    @Test
//    public void threadPoolTest(){
//        taskExecutor.execute(new ThreadPoolTest("线程1"));
//        taskExecutor.execute(new ThreadPoolTest("线程2"));
//        taskExecutor.execute(new ThreadPoolTest("线程3"));
//        taskExecutor.execute(new ThreadPoolTest("线程4"));
//        taskExecutor.execute(new ThreadPoolTest("线程5"));
//        taskExecutor.execute(new ThreadPoolTest("线程6"));
//    }

}

package com.demo.mc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lenovo on 2018/12/10.
 */
@SpringBootApplication
@Slf4j
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
        log.info("update from local_111111");
        log.info("update from local_222222");
        log.info("update form git_1111111");
        log.info("update form local_333333");
        log.info("update form local_444444");
        log.info("update form local_555555");
    }
}

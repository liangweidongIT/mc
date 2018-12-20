package com.demo.mc.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/12/10.
 */
@RestController
@Slf4j
public class IndexControler {

    @RequestMapping(value="index")
    public String index() {
        log.info("index_111");
        log.info("index_222");
        log.info("update from local");
        log.info("update from github");
        log.info("update from test_b1");
       return "jenkins 终于整好了22222222222222222222222";
    }
}

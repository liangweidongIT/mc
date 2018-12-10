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
       return "hello index";
    }
}

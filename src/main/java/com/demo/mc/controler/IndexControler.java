package com.demo.mc.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/12/10.
 */
@RestController
public class IndexControler {

    @RequestMapping(value="index")
    public String index() {
       return "hello index";
    }
}

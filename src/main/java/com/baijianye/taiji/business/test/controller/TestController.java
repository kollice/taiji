package com.baijianye.taiji.business.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kollice on 2017/5/6.
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "Hello world";
    }
}

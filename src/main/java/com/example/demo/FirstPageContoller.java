package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangbaoxian on 2018/3/16.
 */


@RestController
public class FirstPageContoller {

    @RequestMapping("hello")
    @ResponseBody
    public String printHello(){
        return "hellworld";
    }


}

package com.qp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Url {

    @RequestMapping("/{path1}/{path2}/{path3}")
    public String show3(@PathVariable("path1") String path1,@PathVariable("path2") String path2,@PathVariable("path3") String path3){
        return path1+"/"+path2+"/"+path3;
    }

    @RequestMapping("/{path1}/{path2}")
    public String show3(@PathVariable("path1") String path1,@PathVariable("path2") String path2){
        return path1+"/"+path2;
    }

    @RequestMapping("/{url}")
    public String show(@PathVariable("url") String url){
        return url;
    }

}

package com.gubinjie.yuanyuan.controller;


import com.gubinjie.yuanyuan.entity.Info;
import com.gubinjie.yuanyuan.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService service;

    @PostMapping("/base")
    public int save(Info info) {
        return service.save(info);
    }
}

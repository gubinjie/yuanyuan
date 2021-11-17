package com.gubinjie.yuanyuan.info;

import com.gubinjie.yuanyuan.BaseTests;
import com.gubinjie.yuanyuan.entity.Info;
import com.gubinjie.yuanyuan.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class InfoServiceTest extends BaseTests {

    @Autowired
    private InfoService service;

    @Test
    public void save() {
        Info info = new Info();
        int save = service.save(info);
        log.info("修改返回值:{}", save);
    }
}

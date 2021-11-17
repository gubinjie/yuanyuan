package com.gubinjie.yuanyuan.service.impl;

import com.gubinjie.yuanyuan.entity.Info;
import com.gubinjie.yuanyuan.mapper.InfoMapper;
import com.gubinjie.yuanyuan.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public int save(Info entity) {
        return infoMapper.insert(entity);
    }
}

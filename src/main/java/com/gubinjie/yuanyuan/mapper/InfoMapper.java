package com.gubinjie.yuanyuan.mapper;

import com.gubinjie.yuanyuan.entity.Info;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoMapper {

    /**
     * 插入信息
     *
     * @param entity
     * @return
     */
    int insert(Info entity);
}

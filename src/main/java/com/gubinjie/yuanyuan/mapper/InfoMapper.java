package com.gubinjie.yuanyuan.mapper;

import com.gubinjie.yuanyuan.entity.Info;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper {

    /**
     * 插入信息
     *
     * @param entity
     * @return
     */
    int insert(Info entity);
}

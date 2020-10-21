package com.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自定义通用mapper
 *
 * @param <T> 实体
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

package com.example.dao;

import com.common.mapper.MyMapper;
import com.example.entity.JpaUser;
import org.springframework.stereotype.Component;

@Component
public interface JpaUserMapper extends MyMapper<JpaUser> {

}
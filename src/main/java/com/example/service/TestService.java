package com.example.service;

import com.example.dao.JpaUserMapper;
import com.example.entity.JpaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private JpaUserMapper jpaUserMapper;

    public Long insertUser() {
        JpaUser jpaUser = new JpaUser();
        jpaUser.setUserMobile("17610789675");
        jpaUser.setUserName("testTkMybatis");
        int i = jpaUserMapper.insertSelective(jpaUser);
        return i == 1 ? jpaUser.getId() : 0;
    }
}

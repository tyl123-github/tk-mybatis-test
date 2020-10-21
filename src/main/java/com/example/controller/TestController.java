package com.example.controller;

import com.common.response.ApiResponse;
import com.common.response.Response;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试接口类
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("insert")
    public Response insert(){
        Long aLong = testService.insertUser();
        return ApiResponse.success(aLong);
    }
}

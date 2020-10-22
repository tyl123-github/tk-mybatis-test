package com.example.controller;

import com.common.response.ApiResponse;
import com.common.response.Response;
import com.example.entity.JpaUser;
import com.example.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口类
 */
@Api(tags = "tk-mybatis测试类")
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation("tk-测试-添加")
    @PostMapping("insert")
    public Response insert() {
        Long aLong = testService.insertUser();
        return ApiResponse.success(aLong);
    }

    @ApiOperation("根据用户id查询用户信息")
    @PostMapping("getUserById")
    @ApiImplicitParam(name = "id",value ="用户id",paramType = "query")
    public Response<JpaUser> getUserById(@RequestParam(required = false) Long id){
        if (id == null){
            return ApiResponse.error();
        }
        return ApiResponse.success(testService.getUserById(id));
    }
}

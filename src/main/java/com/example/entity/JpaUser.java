package com.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "jpa_user")
@Data
@ApiModel(value = "用户信息")
public class JpaUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "id", value = "用户id")
    private Long id;

    @ApiModelProperty(name = "userMobile", value = "用户手号")
    @Column(name = "user_mobile")
    private String userMobile;

    @ApiModelProperty(name = "userName", value = "用户名")
    @Column(name = "user_name")
    private String userName;

    @ApiModelProperty(name = "createTime", value = "创建时间")
    @Column(name = "create_time")
    private String createTime;

}
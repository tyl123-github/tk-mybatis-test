package com.common.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 自定义controller返回实体
 */
@Setter
@Getter
public class Response implements Serializable {

    private String code;

    private Object date;

    private String msg;

    private Integer count;

    public Response(String code, Object date, String msg, Integer count) {
        this.code = code;
        this.date = date;
        this.msg = msg;
        this.count = count;
    }

    public Response() {
    }
}

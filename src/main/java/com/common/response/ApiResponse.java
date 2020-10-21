package com.common.response;

public class ApiResponse {

    public static final String SUCCESS = "200";
    public static final String SUCCESS_MSG = "成功";
    public static final String DEFAULT_MSG = "";
    public static final String PARAM_ERROR = "400";
    public static final String PARAM_ERROR_MSG = "参数错误";
    public static final Integer COUNT = 0;

    public static Response success(Object data) {
        return success(data, COUNT);
    }

    public static Response success(Object data, Integer count) {
        return response(SUCCESS, data, SUCCESS_MSG, count);
    }

    public static Response success(String code, Object data) {
        return response(code, data, SUCCESS_MSG, COUNT);
    }

    public static Response response(String code, Object data, String msg, Integer count) {
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        response.setDate(data);
        response.setCount(count);
        return response;
    }

    public static Response response(String code, Object data, String msg) {
        return response(code, data, msg, COUNT);
    }

    public static Response response(String code, Object data) {
        return response(code, data, DEFAULT_MSG, COUNT);
    }

    public static Response error() {
        return error(PARAM_ERROR, PARAM_ERROR_MSG);
    }

    public static Response error(String code, String msg) {
        return response(code, null, msg, COUNT);
    }

    public static Response error(String code) {
        return error(code, DEFAULT_MSG);
    }
}

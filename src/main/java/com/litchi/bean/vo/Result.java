package com.litchi.bean.vo;

import com.litchi.common.constant.ResultCode;

/**
 * @author gehuadong
 * @create 2018-05-23 16:06
 **/
public class Result<T> {

    private String code;

    private String message;

    private T data;

    public static Result success(){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static<S> Result success(S s){
        Result<S> result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        result.setData(s);
        return result;
    }

    public static Result error(String code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return  result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

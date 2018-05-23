package com.litchi.common.exception;

/**
 * @author gehuadong
 * @create 2018-05-23 15:38
 **/
public class CheckException extends RuntimeException{

    private Integer code;

    public CheckException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

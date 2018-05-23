package com.litchi.common.exception;

/**
 * @author gehuadong
 * @create 2018-05-23 15:38
 **/
public class CheckException extends RuntimeException{

    private String code;

    public CheckException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

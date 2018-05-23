package com.litchi.common.constant;

/**
 * 全局返回码
 * @author gehuadong
 * @create 2018-05-23 15:50
 **/
public enum ResultCode {

    SUCCESS("200","success"),

    SYS_ERROR("500","sys error"),

    PARAMETER_ERROR("400","请求参数错误");

    private String code;

    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
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
}

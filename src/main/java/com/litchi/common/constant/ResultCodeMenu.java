package com.litchi.common.constant;

public enum ResultCodeMenu {

    LOGIN_ERROR("L0001","登录失败"),

    NKNOW_ERROR("L0002", "未知错误");

    private String code;

    private String message;

    ResultCodeMenu(String code, String message) {
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

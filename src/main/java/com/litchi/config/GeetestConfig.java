package com.litchi.config;

/**
 * GeetestWeb配置文件
 */
public class GeetestConfig {

	// 填入自己的captcha_id和private_key
    private static final String geetest_id = "e2febabf33c14d81bc704eb02dba6cf4";

	private static final String geetest_key = "99571dc57c2caf1a035fdf1c6f92b475";

	private static final boolean newfailback = true;

	public static final String getGeetest_id() {
		return geetest_id;
	}

	public static final String getGeetest_key() {
		return geetest_key;
	}

	public static final boolean isnewfailback() {
		return newfailback;
	}
}
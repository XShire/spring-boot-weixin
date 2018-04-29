package com.liucz.weixin.Constants;

/**
 * 系统常量
 */
public class ApiConstant {

    //获取access_token
    public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    //发送模板消息
    public static final String TEMPLATE_SEND_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
}

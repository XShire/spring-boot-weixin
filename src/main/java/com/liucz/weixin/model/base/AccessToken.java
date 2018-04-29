package com.liucz.weixin.model.base;

public class AccessToken {

    //对应的微信公众奥APPID
    private String appId;
    //获取到的凭证
    private String access_token;
    //凭证有效时间，单位：秒
    private Integer expires_in;
    //凭证创建时间戳，单位：毫秒
    private Long create_time;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "appId='" + appId + '\'' +
                ", access_token='" + access_token + '\'' +
                ", expires_in=" + expires_in +
                ", create_time=" + create_time +
                '}';
    }
}

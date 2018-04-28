package com.liucz.weixin.model.base;

/**
 * 消息父类
 *
 * @author Stephen
 */
public class BaseModel {

    //接收方微信号
    private String ToUserName;
    //发送方微信号
    private String FromUserName;
    //创建时间
    private Long CreateTime;
    //消息类型
    private String MsgType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

}

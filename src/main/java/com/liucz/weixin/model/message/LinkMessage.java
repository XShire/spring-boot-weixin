package com.liucz.weixin.model.message;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 链接消息，MsgType 为 link
 */
public class LinkMessage extends BaseModel {

    //消息标题
    private String Title;
    //消息描述
    private String Description;
    //消息链接
    private String Url;
    //消息id，64位整型
    private Long MsgID;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

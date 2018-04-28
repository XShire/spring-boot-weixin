package com.liucz.weixin.model.message;


import com.liucz.weixin.model.base.BaseModel;

/**
 * 文本消息，MsgType 为 text
 */
public class TextMessage extends BaseModel {

    //文本消息内容
    private String Content;
    //消息id，64位整型
    private Long MsgID;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

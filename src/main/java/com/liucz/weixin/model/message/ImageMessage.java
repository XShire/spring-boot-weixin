package com.liucz.weixin.model.message;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 图片消息，MsgType 为 image
 */
public class ImageMessage extends BaseModel {

    //图片链接（由系统生成）
    private String PicUrl;
    //图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //消息id，64位整型
    private Long MsgID;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

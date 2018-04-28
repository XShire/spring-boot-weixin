package com.liucz.weixin.model.message;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 视频消息，MsgType 为 video
 */
public class VideoMessage extends BaseModel {

    //视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String ThumbMediaId;
    //消息id，64位整型
    private Long MsgID;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

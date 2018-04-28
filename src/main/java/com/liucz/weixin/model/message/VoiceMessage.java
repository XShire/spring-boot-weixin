package com.liucz.weixin.model.message;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 语音消息，MsgType 为 voice
 */
public class VoiceMessage extends BaseModel {

    //语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //语音格式，如amr，speex等
    private String Format;
    //语音识别结果，UTF8编码，开通语音识别后生效
    private String Recognition;
    //消息id，64位整型
    private Long MsgID;


    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

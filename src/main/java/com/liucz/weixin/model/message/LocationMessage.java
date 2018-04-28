package com.liucz.weixin.model.message;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 地理位置消息，MsgType 为 location
 */
public class LocationMessage extends BaseModel {

    //地理位置维度
    private Float Location_X;
    //地理位置经度
    private Float Location_Y;
    //地图缩放大小
    private String Scale;
    //地理位置信息
    private String Label;
    //消息id，64位整型
    private Long MsgID;

    public Float getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(Float location_X) {
        Location_X = location_X;
    }

    public Float getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(Float location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public Long getMsgID() {
        return MsgID;
    }

    public void setMsgID(Long msgID) {
        MsgID = msgID;
    }
}

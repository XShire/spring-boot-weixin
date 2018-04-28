package com.liucz.weixin.Constants;

/**
 * 消息和事件类型
 */
public class MessageConstant {

    //文本消息
    public static final String MESSAGE_TEXT = "text";
    //图片消息
    public static final String MESSAGE_IMAGE = "image";
    //语音消息
    public static final String MESSAGE_VOICE = "voice";
    //视频消息
    public static final String MESSAGE_VIDEO = "video";
    //小视频消息
    public static final String MESSAGE_SHORT_VIDEO = "shortvideo";
    //链接消息
    public static final String MESSAGE_LINK = "link";
    //地理位置消息
    public static final String MESSAGE_LOCATION = "location";
    //事件推送
    public static final String MESSAGE_EVENT = "event";

    //关注事件
    public static final String EVNET_SUBSCRIBE = "subscribe";
    //取消关注事件
    public static final String EVNET_UNSUBSCRIBE = "unsubscribe";
    //自定义菜单事件：点击菜单拉取消息时的事件推送
    public static final String EVNET_CLICK = "CLICK";
    //扫描带参数二维码事件：用户已关注时的事件推送，Event 为 SCAN
    public static final String EVNET_SCAN= "SCAN";
    //上报地理位置事件
    public static final String EVENT_LOCATION = "LOCATION";

}

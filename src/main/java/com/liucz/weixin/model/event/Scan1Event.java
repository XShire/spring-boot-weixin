package com.liucz.weixin.model.event;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 扫描带参数二维码事件：
 * 1、用户未关注时，进行关注后的事件推送，Event 为 subscribe
 */
public class Scan1Event extends BaseModel {

    //事件类型
    private String Event;
    //事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String EventKey;
    //二维码的ticket，可用来换取二维码图片
    private String Ticket;

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}

package com.liucz.weixin.model.event;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 扫描带参数二维码事件：
 * 2、用户已关注时的事件推送，Event 为 SCAN
 */
public class Scan2Event extends BaseModel {

    //事件类型
    private String Event;
    //事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
    private Long EventKey;
    //二维码的ticket，可用来换取二维码图片
    private String Ticket;

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public Long getEventKey() {
        return EventKey;
    }

    public void setEventKey(Long eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}

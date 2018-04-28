package com.liucz.weixin.model.event;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 自定义菜单事件：点击菜单拉取消息时的事件推送
 * 请注意，点击菜单弹出子菜单，不会产生上报。
 */
public class ClickEvent extends BaseModel {

    //事件类型，CLICK
    private String Event;
    //事件KEY值，与自定义菜单接口中KEY值对应
    private String EventKey;

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
}

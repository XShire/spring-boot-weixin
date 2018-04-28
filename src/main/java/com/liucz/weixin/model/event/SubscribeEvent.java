package com.liucz.weixin.model.event;

import com.liucz.weixin.model.base.BaseModel;

/**
 * 关注/取消关注事件，Event 为 subscribe(订阅)、unsubscribe(取消订阅)
 */
public class SubscribeEvent extends BaseModel {

    //事件类型，subscribe(订阅)、unsubscribe(取消订阅)
    private String Event;

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }
}

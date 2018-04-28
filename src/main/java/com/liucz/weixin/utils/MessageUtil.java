package com.liucz.weixin.utils;

import com.liucz.weixin.Constants.MessageConstant;
import com.liucz.weixin.model.message.TextMessage;
import java.util.Date;

/**
 * 消息封装类
 * @author Stephen
 *
 */
public class MessageUtil {
	
	/**
	 * 组装文本消息
	 * @param toUserName
	 * @param fromUserName
	 * @param content
	 * @return
	 */
	public static String initText(String toUserName,String fromUserName,String content){
		TextMessage text = new TextMessage();
		text.setFromUserName(toUserName);
		text.setToUserName(fromUserName);
		text.setMsgType(MessageConstant.MESSAGE_TEXT);
		text.setCreateTime(new Date().getTime());
		text.setContent(content);
		return XMLUtil.textToXml(text);
	}
	
}

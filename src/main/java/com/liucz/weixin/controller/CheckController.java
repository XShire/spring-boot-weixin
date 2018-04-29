package com.liucz.weixin.controller;

import com.liucz.weixin.Constants.MessageConstant;
import com.liucz.weixin.utils.CheckUtil;
import com.liucz.weixin.utils.MessageUtil;
import com.liucz.weixin.utils.XMLUtil;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("/check")
public class CheckController {

    /**
     * 微信接入验证
     */
    @GetMapping
    public void checkGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String signature = req.getParameter("signature");
        String timestamp = req.getParameter("timestamp");
        String nonce = req.getParameter("nonce");
        String echostr = req.getParameter("echostr");

        PrintWriter out = resp.getWriter();

        if(CheckUtil.checkSignature(signature, timestamp, nonce)){
            out.print(echostr);
        }

    }

    /**
     * 消息的接收与响应
     */
    @PostMapping
    public void checkPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, DocumentException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();

        Map<String, String> map = XMLUtil.xmlToMap(req);

        String fromUserName = map.get("FromUserName");
        String toUserName = map.get("ToUserName");
        String msgType = map.get("MsgType");

        //返回值设为“success”，否则公众号会返回错误信息“该公众号提供的服务出现故障，请稍后再试”
        String message = "success";

        //设置默认消息
        StringBuffer buffer = new StringBuffer();
        buffer.append("欢迎关注").append("\n");
        buffer.append("哈哈哈哈哈啊哈哈").append("\n\n");
        buffer.append("点击下方链接进入百度").append("\n");
        buffer.append("https://www.baidu.com");
        String msgContent = buffer.toString();

        if(MessageConstant.MESSAGE_TEXT.equals(msgType)){//收到文本消息

            String content = map.get("Content");

            //设置自动回复
            if("1".equals(content)){
                message = MessageUtil.initText(toUserName, fromUserName, msgContent);
            }

        }else if(MessageConstant.MESSAGE_EVENT.equals(msgType)){//收到事件推送

            String eventType = map.get("Event");
            //关注事件
            if(MessageConstant.EVNET_SUBSCRIBE.equals(eventType)){
                message = MessageUtil.initText(toUserName, fromUserName, msgContent);
            }

        }

        out.print(message);
    }

}

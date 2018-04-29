package com.liucz.weixin.service;

import com.liucz.weixin.Constants.CommonConstant;
import net.sf.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateServiceTest {

    @Autowired
    TemplateService templateService;

    @Test
    public void send() throws IOException {

        /*
        {{first.DATA}} 信息类型：{{keyword1.DATA}} 变更时间：{{keyword2.DATA}} {{remark.DATA}}
         */
        JSONObject body = new JSONObject();
        body.put("touser", "oRjaiju6hhexBjz7v_dKbP_BHrw8");
        body.put("template_id", CommonConstant.TEMPLATE_ID_1);
        body.put("url", "http://www.baidu.com");
        body.put("color", "#FF0000");

        JSONObject data = new JSONObject();

        JSONObject first = new JSONObject();
        first.put("value", "发送消息测试");
        first.put("color", "#173177");
        data.put("first", first);

        JSONObject keyword1 = new JSONObject();
        keyword1.put("value", "测试数据");
        keyword1.put("color", "#173177");
        data.put("keyword1", keyword1);

        JSONObject keyword2 = new JSONObject();
        keyword2.put("value", "2018-04-29 10:00:00");
        keyword2.put("color", "#173177");
        data.put("keyword2", keyword2);

        JSONObject remark = new JSONObject();
        remark.put("value", "测试成功，模板消息需要加入消息队列，异步发送");
        remark.put("color", "#173177");
        data.put("remark", remark);

        body.put("data", data);

        JSONObject result = templateService.send(body);

        System.out.println("result=="+result.toString());

        Assert.assertNotNull(result);
    }
}
package com.liucz.weixin.service;

import com.liucz.weixin.Constants.ApiConstant;
import com.liucz.weixin.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 模板消息业务
 */
@Service
public class TemplateService {

    @Autowired
    AccessTokenService accessTokenService;

    public JSONObject send(JSONObject body) throws IOException {

        //获取accessToken
        String accessToken = accessTokenService.getAccessTokenString();
        //组装URL
        String url = ApiConstant.TEMPLATE_SEND_URL.replace("ACCESS_TOKEN", accessToken);
        //发送并返回结果，正式使用时需要加入消息队列，进行异步操作
        JSONObject result = HttpUtil.doPost(url, body.toString());

        return result;

    }
}

package com.liucz.weixin.service;

import com.liucz.weixin.Constants.ApiConstant;
import com.liucz.weixin.Constants.CommonConstant;
import com.liucz.weixin.model.base.AccessToken;
import com.liucz.weixin.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;


@Service
public class AccessTokenService {

    @Resource
    private CacheManager cacheManager;

    /**
     * 刷新 AccessToken，直接从微信服务器获取
     * @return
     * @throws IOException
     */
    public AccessToken getAccessToken() throws IOException {

        AccessToken token = new AccessToken();
        String url = ApiConstant.ACCESS_TOKEN_URL.replace("APPID", CommonConstant.APPID).replace("APPSECRET", CommonConstant.APPSECRET);
        JSONObject jsonObject = HttpUtil.doGet(url);
        if(jsonObject != null){
            token.setAppId(CommonConstant.APPID);
            token.setAccess_token(jsonObject.getString("access_token"));
            token.setExpires_in(jsonObject.getInt("expires_in"));
            token.setCreate_time(System.currentTimeMillis());
        }

        //手动添加缓存
        Cache cache = cacheManager.getCache("AccessToken");
        cache.put(token.getAppId(), token);

        return token;

    }

    /**
     * 获取 AccessToken 的值，优先从缓存获取，没有的话从服务器获取
     * @return
     * @throws IOException
     */
    public String getAccessTokenString() throws IOException {

        //从缓存中获取
        Cache cache = cacheManager.getCache("AccessToken");
        AccessToken accessToken = cache.get(CommonConstant.APPID, AccessToken.class);

        //缓存中没有时，通过接口获取，并保存到缓存
        if(accessToken == null){
            accessToken = getAccessToken();
        }

        return accessToken.getAccess_token();
    }
}

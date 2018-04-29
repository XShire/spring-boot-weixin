package com.liucz.weixin.service;

import com.liucz.weixin.Constants.CommonConstant;
import com.liucz.weixin.model.base.AccessToken;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccessTokenServiceTest {

    @Resource
    private CacheManager cacheManager;
    @Autowired
    AccessTokenService accessTokenService;

    @Test
    public void getAccessToken() throws IOException {

        AccessToken accessToken = accessTokenService.getAccessToken();
        System.out.println(accessToken.toString());

        Cache cache = cacheManager.getCache("AccessToken");
        AccessToken res = cache.get(CommonConstant.APPID, AccessToken.class);
        System.out.println("缓存===="+res.toString());

        Assert.assertNotNull(accessToken);

    }

    @Test
    public void getAccessTokenString() {
    }
}
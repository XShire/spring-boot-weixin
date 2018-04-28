package com.liucz.weixin.Constants;

/**
 * 系统常量
 */
public class ApiConstant {

    //登录用户session名称
    public static final String SIGN_IN_USER = "admin";

    //阿里云OSS文件访问地址
    public static final String OSS_HOST = "https://build-oss.oss-cn-shenzhen.aliyuncs.com/";
    //阿里云OSS图片样式：400*400的缩略图
    public static final String THUMB_400_400 = "?x-oss-process=style/thumb_400_400";
    //阿里云OSS图片样式：宽度640，高度自适应的缩略图
    public static final String THUMB_WIDTH_640 = "?x-oss-process=style/thumb_width_640";
    //阿里云OSS图片样式：高度400，宽度自适应的缩略图
    public static final String THUMB_HEIGHT_400 = "?x-oss-process=style/thumb_height_400";
    //阿里云OSS图片样式：640*360的缩略图
    public static final String THUMB_640_360 = "?x-oss-process=style/thumb_640_360";


}

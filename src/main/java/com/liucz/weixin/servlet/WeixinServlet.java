package com.liucz.weixin.servlet;

import com.liucz.weixin.Constants.MessageConstant;
import com.liucz.weixin.utils.CheckUtil;
import com.liucz.weixin.utils.MessageUtil;
import com.liucz.weixin.utils.XMLUtil;
import org.dom4j.DocumentException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 微信接入验证
 */
@WebServlet(name="weixinServlet",urlPatterns="/servlet/weixinServlet")
public class WeixinServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        String signature = req.getParameter("signature");
//        String timestamp = req.getParameter("timestamp");
//        String nonce = req.getParameter("nonce");
//        String echostr = req.getParameter("echostr");
//
//        PrintWriter out = resp.getWriter();
//
//        if(CheckUtil.checkSignature(signature, timestamp, nonce)){
//            out.print(echostr);
//        }
    }


    /**
     * 消息的接收与响应
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//
    }

}

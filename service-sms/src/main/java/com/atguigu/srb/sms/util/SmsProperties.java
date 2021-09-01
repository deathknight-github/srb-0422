package com.atguigu.srb.sms.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "aliyun.sms")
public class SmsProperties implements InitializingBean {
    private String regionId;
    private String keyId;
    private String keySecret;
    private String templateCode;
    private String signName;
    /**
     * 参数介绍：null、你的key-id、你的keysecret、你的短信模板code、你的短信模板签名
     */
    public static String REGION_Id;
    public static String KEY_ID;
    public static String KEY_SECRET;
    public static String TEMPLATE_CODE;
    public static String SIGN_NAME;
    /**
     *  私有方法赋值后会自动调用这个方法，给常量赋值，也就是对常量进行初始化
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        REGION_Id=regionId;
        KEY_ID=keyId;
        KEY_SECRET=keySecret;
        TEMPLATE_CODE=templateCode;
        SIGN_NAME=signName;
    }
}

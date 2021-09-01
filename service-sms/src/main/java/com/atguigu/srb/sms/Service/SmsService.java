package com.atguigu.srb.sms.Service;

import java.util.Map;

/**
 * @author 30912
 * @date
 * @apiNote
 */
public interface SmsService {
    void send(String mobile, String templateCode, Map<String,Object> param);
}

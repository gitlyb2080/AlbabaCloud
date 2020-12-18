package com.zh.api.fallback;

import com.zh.api.feign.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @program: CloudDemo
 * @description: 消费降级处理
 * @author: zhaohe
 * @create: 2020-12-18 21:28
 **/
@Component
public class OrderFallBack implements OrderFeign {
    @Override
    public String hi(String message) {
        //todo: 记录降级日志，后续自动补偿
        System.out.println("业务处理失败，消费降级处理" + message);
        return "error";
    }
}

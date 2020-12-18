package com.zh.api.feign;

import com.zh.api.fallback.OrderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: CloudDemo
 * @description: 微服务接口通信
 * @author: zhaohe
 * @create: 2020-12-18 21:05
 **/
@FeignClient(name = "order", fallback = OrderFallBack.class)
public interface OrderFeign {
    @GetMapping(value = "/hi/{message}")
    String hi(@PathVariable("message") String message);
}

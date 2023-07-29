package com.weiran.gateway.fallback;

import com.weiran.gateway.common.ErrorCode;
import com.weiran.gateway.common.Msg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  熔断回调
 */
@RestController
public class FallbackController {

    final String RETRY_MSG = "系统更新中，请稍后再试";

    /**
     * 全局服务降级处理返回
     */
    @RequestMapping("/defaultFallback")
    public Msg<Integer> fallback() {
        Msg<Integer> msg = new Msg<>();
        msg.setCode(ErrorCode.MICRO_SERVICE_UNAVAILABLE);
        msg.setMsg(RETRY_MSG);
        return msg;
    }
}

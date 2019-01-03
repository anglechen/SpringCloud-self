package com.aubrey.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aubrey
 * @create 2019-01-02 15:10
 */
@FeignClient("provider")
public interface ConsumerFeign {

    @RequestMapping("/provider/test")
    public String test();

}

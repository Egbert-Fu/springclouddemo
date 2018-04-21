package com.example.common.province;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "provice-service")
public interface ProvinceFeign {

    /**
     * 根据省份编号获取信息
     * @param provinceID
     * @return
     */
    @RequestMapping(value = "/getProvinceInfoByID", method = RequestMethod.GET)
    Map<String, Object> getProvinceInfoByID(@RequestParam(value = "provinceID") Integer provinceID);
}

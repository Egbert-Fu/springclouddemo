package com.example.common.city;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "city-service",fallback = CityFeignHystric.class)
public interface CityFeign {

    /**
     * 根据省份编号获取城市列表
     * @param provinceID
     * @return
     */
    @RequestMapping(value = "/getCitysByProvinceID",method = RequestMethod.GET)
    Map<String, Object> getCitysByProvinceID(@RequestParam(value = "provinceID") Integer provinceID);
}

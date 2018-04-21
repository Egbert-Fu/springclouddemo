package com.example.common.city;

import com.example.common.util.MapServiceUtil;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: fujunliang
 * @create: 2018-04-20 19:21
 */
@Component
public class CityFeignHystric implements CityFeign {
    @Override
    public Map<String, Object> getCitysByProvinceID(Integer provinceID) {
        return MapServiceUtil.returnMap(false,"fail");
    }
}

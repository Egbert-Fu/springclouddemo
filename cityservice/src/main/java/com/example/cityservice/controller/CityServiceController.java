package com.example.cityservice.controller;

import com.example.cityservice.service.CityService;
import com.example.common.util.MapServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: fujunliang
 * @create: 2018-04-20 15:24
 */
@RestController
public class CityServiceController {

    private Logger LOGGER = LoggerFactory.getLogger(CityServiceController.class);

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/getCitysByProvinceID", method = RequestMethod.GET)
    public Map<String, Object> getCitysByProvinceID(@RequestParam(value = "provinceID") Integer provinceID){
        try{
            return MapServiceUtil.returnMap(true, cityService.getCitysByProvinceID(provinceID));
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("getCitysByProvinceID error! " + e.getMessage());
            return MapServiceUtil.returnMap(false, e.getMessage());
        }
    }
}

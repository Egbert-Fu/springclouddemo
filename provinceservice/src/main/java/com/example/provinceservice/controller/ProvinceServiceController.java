package com.example.provinceservice.controller;

import java.util.Map;

import com.example.common.util.MapServiceUtil;
import com.example.provinceservice.service.ProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fujunliang
 * @create: 2018-04-20 11:27
 */
@RestController
public class ProvinceServiceController {

    private Logger LOGGER = LoggerFactory.getLogger(ProvinceServiceController.class);

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/getProvinceInfoByID", method = RequestMethod.GET)
    public Map<String, Object> getProvinceInfoByID(@RequestParam(value = "provinceID") Integer provinceID){
        try{
            return MapServiceUtil.returnMap(true, provinceService.getProvinceInfoByID(provinceID));
        } catch(Exception e){
            e.printStackTrace();
            LOGGER.error("getProvinceInfoByID error！ " + e.getMessage());
            return MapServiceUtil.returnMap(false, e.getMessage());
        }
    }
}

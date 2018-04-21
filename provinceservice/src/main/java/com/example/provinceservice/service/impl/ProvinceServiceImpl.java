package com.example.provinceservice.service.impl;

import com.example.common.city.CityFeign;
import com.example.provinceservice.domain.tables.ProvinceInfo;
import com.example.provinceservice.service.ProvinceService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: fujunliang
 * @create: 2018-04-20 13:35
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private CityFeign cityFeign;

    @Autowired
    private DSLContext dslContext;

    @Override
    public Map<String, Object> getProvinceInfoByID(Integer provinceID) {
        List<com.example.provinceservice.domain.tables.pojos.ProvinceInfo> list = dslContext.select().from(ProvinceInfo.PROVINCE_INFO).where(ProvinceInfo.PROVINCE_INFO.PROVINCE_ID.eq(provinceID)).fetchInto(com.example.provinceservice.domain.tables.pojos.ProvinceInfo.class);
        Map<String, Object> map = new HashMap<String, Object>(3);
        if(list.size()>0) {
            com.example.provinceservice.domain.tables.pojos.ProvinceInfo record = list.get(0);
            map.put("provinceID", provinceID);
            map.put("provinceName", record.getProvinceName());
        }
        map.put("citys", cityFeign.getCitysByProvinceID(provinceID).get("message"));
        return map;
    }

}

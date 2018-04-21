package com.example.cityservice.service.impl;

import com.example.cityservice.domain.tables.pojos.CityInfo;
import com.example.cityservice.domain.tables.records.CityInfoRecord;
import com.example.cityservice.service.CityService;
import com.example.common.province.ProvinceFeign;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: fujunliang
 * @create: 2018-04-20 15:24
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private DSLContext dslContext;

    @Override
    public List<CityInfo> getCitysByProvinceID(Integer provinceID) {
        List<CityInfo> citys = dslContext.select().from(com.example.cityservice.domain.tables.CityInfo.CITY_INFO).where(com.example.cityservice.domain.tables.CityInfo.CITY_INFO.PROVINCE_ID.eq(provinceID)).fetchInto(CityInfo.class);
        return citys;
    }
}

package com.example.cityservice.service;

import com.example.cityservice.domain.tables.pojos.CityInfo;

import java.util.List;

public interface CityService {

    List<CityInfo> getCitysByProvinceID(Integer provinceID);
}

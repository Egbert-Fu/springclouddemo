/*
 * This file is generated by jOOQ.
*/
package com.example.provinceservice.domain.tables.daos;


import com.example.provinceservice.domain.tables.CityInfo;
import com.example.provinceservice.domain.tables.records.CityInfoRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityInfoDao extends DAOImpl<CityInfoRecord, com.example.provinceservice.domain.tables.pojos.CityInfo, Integer> {

    /**
     * Create a new CityInfoDao without any configuration
     */
    public CityInfoDao() {
        super(CityInfo.CITY_INFO, com.example.provinceservice.domain.tables.pojos.CityInfo.class);
    }

    /**
     * Create a new CityInfoDao with an attached configuration
     */
    public CityInfoDao(Configuration configuration) {
        super(CityInfo.CITY_INFO, com.example.provinceservice.domain.tables.pojos.CityInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.example.provinceservice.domain.tables.pojos.CityInfo object) {
        return object.getCityId();
    }

    /**
     * Fetch records that have <code>city_id IN (values)</code>
     */
    public List<com.example.provinceservice.domain.tables.pojos.CityInfo> fetchByCityId(Integer... values) {
        return fetch(CityInfo.CITY_INFO.CITY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public com.example.provinceservice.domain.tables.pojos.CityInfo fetchOneByCityId(Integer value) {
        return fetchOne(CityInfo.CITY_INFO.CITY_ID, value);
    }

    /**
     * Fetch records that have <code>city_name IN (values)</code>
     */
    public List<com.example.provinceservice.domain.tables.pojos.CityInfo> fetchByCityName(String... values) {
        return fetch(CityInfo.CITY_INFO.CITY_NAME, values);
    }

    /**
     * Fetch records that have <code>province_id IN (values)</code>
     */
    public List<com.example.provinceservice.domain.tables.pojos.CityInfo> fetchByProvinceId(Integer... values) {
        return fetch(CityInfo.CITY_INFO.PROVINCE_ID, values);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.example.cityservice.domain.tables.daos;


import com.example.cityservice.domain.tables.ProvinceInfo;
import com.example.cityservice.domain.tables.records.ProvinceInfoRecord;

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
public class ProvinceInfoDao extends DAOImpl<ProvinceInfoRecord, com.example.cityservice.domain.tables.pojos.ProvinceInfo, Integer> {

    /**
     * Create a new ProvinceInfoDao without any configuration
     */
    public ProvinceInfoDao() {
        super(ProvinceInfo.PROVINCE_INFO, com.example.cityservice.domain.tables.pojos.ProvinceInfo.class);
    }

    /**
     * Create a new ProvinceInfoDao with an attached configuration
     */
    public ProvinceInfoDao(Configuration configuration) {
        super(ProvinceInfo.PROVINCE_INFO, com.example.cityservice.domain.tables.pojos.ProvinceInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.example.cityservice.domain.tables.pojos.ProvinceInfo object) {
        return object.getProvinceId();
    }

    /**
     * Fetch records that have <code>province_id IN (values)</code>
     */
    public List<com.example.cityservice.domain.tables.pojos.ProvinceInfo> fetchByProvinceId(Integer... values) {
        return fetch(ProvinceInfo.PROVINCE_INFO.PROVINCE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>province_id = value</code>
     */
    public com.example.cityservice.domain.tables.pojos.ProvinceInfo fetchOneByProvinceId(Integer value) {
        return fetchOne(ProvinceInfo.PROVINCE_INFO.PROVINCE_ID, value);
    }

    /**
     * Fetch records that have <code>province_name IN (values)</code>
     */
    public List<com.example.cityservice.domain.tables.pojos.ProvinceInfo> fetchByProvinceName(String... values) {
        return fetch(ProvinceInfo.PROVINCE_INFO.PROVINCE_NAME, values);
    }
}
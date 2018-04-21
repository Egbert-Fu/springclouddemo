package com.example.common.util;

import java.util.Map;
import java.util.HashMap;

/**
 * @author: fujunliang
 * @create: 2018-04-20 11:37
 */
public class MapServiceUtil {

    /**
     * 封装返回map
     * @param flag
     * @param object
     * @return
     */
    public static Map<String, Object> returnMap(Boolean flag, Object object){
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put("ret", flag);
        map.put("message", object);
        return map;
    }
}

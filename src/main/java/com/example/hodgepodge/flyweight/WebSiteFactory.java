package com.example.hodgepodge.flyweight;

import java.util.HashMap;

/**
 * @author yangpeng
 * @Classname WebSiteFactory
 * @Description TODO
 * @Date 2020/12/8 9:17 下午
 */
public class WebSiteFactory {

    private HashMap<String, ConcreteWebsite> webSiteHashMap = new HashMap<>(16);

    public WebSite getWebSiteCategory(String type){
        if (!webSiteHashMap.containsKey(type)){
            webSiteHashMap.put(type, new ConcreteWebsite(type));
        }
        return webSiteHashMap.get(type);
    }

    public Integer getMapSize(){
        return webSiteHashMap.size();
    }

}

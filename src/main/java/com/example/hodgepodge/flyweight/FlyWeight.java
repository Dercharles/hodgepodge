package com.example.hodgepodge.flyweight;

/**
 * @author yangpeng
 * @Classname FlyWeight
 * @Description TODO
 * @Date 2020/12/8 9:23 下午
 */
public class FlyWeight {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite category = webSiteFactory.getWebSiteCategory("博客");
        category.use(new User("马力明"));

        WebSite category2 = webSiteFactory.getWebSiteCategory("网站");
        category2.use(new User("yangpeng"));

        WebSite category3 = webSiteFactory.getWebSiteCategory("笔记");
        category3.use(new User("fuqiang"));

        System.out.println(webSiteFactory.getMapSize());
    }
}

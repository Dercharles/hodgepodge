package com.example.hodgepodge.flyweight;

/**
 * @author yangpeng
 * @Classname ConcreteWebsite
 * @Description TODO
 * @Date 2020/12/8 9:15 下午
 */
public class ConcreteWebsite extends WebSite{
    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("用户："+user.getName()+"，正在使用："+type);
    }
}

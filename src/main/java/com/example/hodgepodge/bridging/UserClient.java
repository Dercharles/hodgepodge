package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname UserClient
 * @Description TODO
 * @Date 2020/11/30 8:49 下午
 */
public class UserClient {
    public static void main(String[] args) {
        FlipPhone flipPhone = new FlipPhone(new HuaWei());
        flipPhone.open();
        flipPhone.call();
        flipPhone.close();
    }
}

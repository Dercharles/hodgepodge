package com.example.hodgepodge.interviewer;

/**
 * @author yangpeng
 * @Classname IntterviewerClient
 * @Description TODO
 * @Date 2020/12/22 10:29 下午
 */
public class IntterviewerClient {

    public static void main(String[] args) {
        ObjectStucture objectStucture = new ObjectStucture();

        objectStucture.attch(new Man());
        objectStucture.attch(new Woman());
        System.out.println("-----------------------");

        Success success = new Success();
        objectStucture.display(success,"张三");
        System.out.println("-----------------------");

        Fail fail = new Fail();
        objectStucture.display(fail,"里斯");
        System.out.println("-----------------------");
        Wait wait = new Wait();
        objectStucture.display(wait,"杨fei");
    }
}

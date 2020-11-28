package com.example.hodgepodge.adapter;

import com.example.hodgepodge.adapter.Interfaceadapter.AbsOrder;
import com.example.hodgepodge.adapter.objectadapter.Computer;
import com.example.hodgepodge.adapter.objectadapter.Voltage220;
import com.example.hodgepodge.adapter.objectadapter.VoltageAdapterObject;
import com.example.hodgepodge.builder.Order;
import org.springframework.web.servlet.HandlerAdapter;

/**
 * @author yangpeng
 * @Classname adapterClient
 * @Description TODO
 * @Date 2020/11/28 2:34 下午
 */
public class adapterClient {

//    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.recharge(new VoltageAdapter());
//    }

    //    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.recharge(new VoltageAdapterObject(new Voltage220()));
//    }
    public static void main(String[] args) {
        AbsOrder absOrder = new AbsOrder() {
            @Override
            public void orderStatus4(Order order) {
                System.out.println("订单状态为4");
            }
        };

        absOrder.orderStatus4(new Order());
    }

    
}

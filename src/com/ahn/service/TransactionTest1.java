package com.ahn.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest1 {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        OrdersService ordersService=(OrdersService)applicationContext.getBean("ordersService");
        ordersService.transMoney();
    }
}

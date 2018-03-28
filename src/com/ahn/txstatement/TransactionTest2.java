package com.ahn.txstatement;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest2 {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");
        OrdersService2 ordersService=(OrdersService2)applicationContext.getBean("oService");
        ordersService.transMoney();
    }
}

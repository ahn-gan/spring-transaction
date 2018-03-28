package com.ahn.service;

import com.ahn.dao.OrdersDao;

public class OrdersService {
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    // 转账业务操作，此过程需要事务的控制
    public void transMoney(){
        ordersDao.transOutM();

        //手动设置异常,则整个事务会被回滚
        //int i=10/0;

        ordersDao.transInM();
    }
}

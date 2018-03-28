package com.ahn.txstatement;

import com.ahn.dao.OrdersDao;
import org.springframework.transaction.annotation.Transactional;

//声明式事务操作 第三步 在要使用事务操作的方法所在类上面添加注解@Transactional
//添加注解之后回对这个类里的所有方法都做事务操作

@Transactional
public class OrdersService2 {
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    // 转账业务操作，此过程需要事务的控制
    public void transMoney(){
        ordersDao.transOutM();

        //手动设置异常,则整个事务会被回滚
        int i=10/0;

        ordersDao.transInM();
    }
}

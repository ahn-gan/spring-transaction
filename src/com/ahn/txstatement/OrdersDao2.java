package com.ahn.txstatement;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrdersDao2 {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //在dao层中实现各种对数据库的操作

/*    1、转账业务的处理过程：
    一个账户的余额减少，一个账户的余额增加相应的操作；
    重点是，整个过程事作为一个原子过程，将其作为事务来处理*/
    //转出方法
    public void transOutM(){
        String sql="update t_account set totalaccount=totalaccount-? where username=?";
        jdbcTemplate.update(sql,1000,"小林");
    }

    //转入方法
    public void transInM(){
        String sql="update t_account set totalaccount=totalaccount+? where username=?";
        jdbcTemplate.update(sql,1000,"小甘");
    }
}

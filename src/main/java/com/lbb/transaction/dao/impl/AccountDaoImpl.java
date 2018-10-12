package com.lbb.transaction.dao.impl;

import com.lbb.transaction.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void in(String name, Double money) {
        String sql="update t_account set money = money+ ? where name = ?";
        this.jdbcTemplate.update(sql, money,name);
    }

    public void out(String name, Double money) {
        String sql="update t_account set money = money- ? where name = ?";
        this.jdbcTemplate.update(sql, money,name);
    }
}

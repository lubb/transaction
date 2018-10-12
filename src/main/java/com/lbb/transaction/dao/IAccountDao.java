package com.lbb.transaction.dao;

public interface IAccountDao {
    //转入
    public void in(String name,Double money);
    //转出
    public void out(String name,Double money);
}

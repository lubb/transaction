package com.lbb.transaction.service;

public interface IAccountService {

    //转账业务
    void transfer(String outName,String inName,Double money);

}

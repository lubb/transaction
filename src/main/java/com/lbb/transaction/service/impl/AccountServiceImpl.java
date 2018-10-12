package com.lbb.transaction.service.impl;

import com.lbb.transaction.dao.IAccountDao;
import com.lbb.transaction.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public void transfer(String outName, String inName, Double money) {

        accountDao.out(outName,money);

        int i =1/0;

        accountDao.in(inName,money);
    }

}

package com.lbb.transaction.test;

import com.lbb.transaction.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer("lbb", "ximi", 50d);
        System.out.println("转账成功！");
    }
}

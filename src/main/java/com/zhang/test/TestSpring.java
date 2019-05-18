package com.zhang.test;

import com.zhang.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yonghong Zhang
 * @create 2019-05-18 10:52
 */
public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService)ac.getBean("accountService");
        as.findAll();
    }
}

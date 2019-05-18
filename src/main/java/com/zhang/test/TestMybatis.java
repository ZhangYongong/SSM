package com.zhang.test;

import com.zhang.dao.AccountDao;
import com.zhang.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.List;

/**
 * @author Yonghong Zhang
 * @create 2019-05-18 12:29
 */
public class TestMybatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlmapConfig.xml");
        //创建sqlsessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建sqlSession 对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //查询所有的账户信息
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        sqlSession.close();
        is.close();
    }
    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(500D);
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlmapConfig.xml");
        //创建sqlsessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建sqlSession 对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
       accountDao.saveAccount(account);
       sqlSession.commit();
        sqlSession.close();
        is.close();
    }
}

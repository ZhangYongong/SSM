package com.zhang.dao;

import com.zhang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yonghong Zhang
 * @create 2019-05-18 10:36
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有的账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}

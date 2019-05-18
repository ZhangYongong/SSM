package com.zhang.service;

import com.zhang.domain.Account;

import java.util.List;

/**
 * @author Yonghong Zhang
 * @create 2019-05-18 10:40
 */
public interface AccountService {
    /**
     * 查询所有的账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);
}

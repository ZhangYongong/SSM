package com.zhang.controller;

import com.zhang.domain.Account;
import com.zhang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Yonghong Zhang
 * @create 2019-05-18 11:15
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public String save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception{
       accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAll");
       return "list";
    }
}

package com.launchcode.Menu.Controllers;

import com.launchcode.Menu.Models.Account;
import com.launchcode.Menu.Models.data.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

public class AccountController {
    @Autowired
    private AccountDao accountDao;
    //list the restaurants added to the database

    //
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("Categories", accountDao.findAll());
        return "account/index";
    }
    //form to register new account
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayNewAccountForm(Model model){
        model.addAttribute(new Account());
        model.addAttribute("Add Account");
        return "account/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processNewAccountForm(Model model, @ModelAttribute @Valid Account account, Errors errors){
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add account");
            return "account/add";
        }

        accountDao.save(account);
        return "redirect:";
    }
}


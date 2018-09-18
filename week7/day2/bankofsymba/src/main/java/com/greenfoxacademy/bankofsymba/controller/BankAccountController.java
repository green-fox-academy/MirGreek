package com.greenfoxacademy.bankofsymba.controller;

import com.greenfoxacademy.bankofsymba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {
  List<BankAccount> accountsList = new ArrayList<>();
  @GetMapping("/show")
  public String createBankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("bankaccount", bankAccount);

    return "bankaccount";
  }


  @GetMapping("/showall")
  public String createNewBankAccounts(Model model) {

    accountsList.add( new BankAccount("Simba", 2000, "Lion"));
    accountsList.add( new BankAccount("Timon",1000,"Meerkat"));
    accountsList.add( new BankAccount("Pumba",3000,"Varacskos pig"));
    accountsList.add( new BankAccount("Mufasa",5000,"Lion"));
    accountsList.add( new BankAccount("Kiara",9000,"Lion"));
    accountsList.add( new BankAccount("Nala",7000,"Lion"));
    model.addAttribute("accountslist", accountsList);
    return "allbankaccounts";
  }

}

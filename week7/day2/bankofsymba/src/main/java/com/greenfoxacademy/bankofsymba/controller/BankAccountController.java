package com.greenfoxacademy.bankofsymba.controller;

import com.greenfoxacademy.bankofsymba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {
  @RequestMapping(value = "/show")
  public String createBankAccount(Model model){
    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion","Zebra");
    model.addAttribute("bankaccount",bankAccount);

    return "bankaccount";
  }

}

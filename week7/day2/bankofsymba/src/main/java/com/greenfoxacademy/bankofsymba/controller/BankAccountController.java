package com.greenfoxacademy.bankofsymba.controller;

import com.greenfoxacademy.bankofsymba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class BankAccountController {

  List<BankAccount> accountsList = listOfBankAccounts();

  public List<BankAccount> listOfBankAccounts(){
    List<BankAccount> accountsList = new ArrayList<>();
    accountsList.add( new BankAccount("Simba", 2000, "Lion"));
    accountsList.add( new BankAccount("Timon",1000,"Meerkat"));
    accountsList.add( new BankAccount("Pumba",3000,"Varacskos pig"));
    accountsList.add( new BankAccount("Mufasa",5000,"Lion"));
    accountsList.add( new BankAccount("Kiara",9000,"Lion"));
    accountsList.add( new BankAccount("Nala",7000,"Lion"));
    return accountsList;
  }

  @GetMapping("/show")
  public String createBankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("bankaccount", bankAccount);

    return "bankaccount";
  }


  @GetMapping("/showall")
  public String createNewBankAccounts(Model model) {

    for (BankAccount account : accountsList) {
      if (account.getAnimalType().equals("Lion")) {
        account.setIsKing(true);
      }
    }
    model.addAttribute("accountslist", accountsList);
    return "allbankaccounts";
  }



  @PostMapping("/showall")
  public String donateAccounts(Model model){

    for (BankAccount account : accountsList) {
        if(account.getIsKing()){
           account.setBalance(account.getBalance()+100);
        } else {
          account.setBalance(account.getBalance()+100);
          }
    }
    model.addAttribute("accountslist", accountsList);

    return "allbankaccounts";
  }

}
/*
Create a custom form with a button, which can raise the balance of any animal by 10
If the selected animal is a King, the increment is 100
Creating new Bank Accounts
Add new row of input elements to our previously created template
With the help of these elements make sure, that the user can add new BankAccounts to our List
 */
package com.greenfoxacademy.bankofsymba.controller;

import com.greenfoxacademy.bankofsymba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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



  //@RequestMapping(value="/donate", method= RequestMethod.POST)
  //public String donate(@RequestParam(value="add")int index){
  //accountsList.get(index).raiseBalace();
    //return "redirect:/showall";
  //}


  @RequestMapping(value="/donate", method={RequestMethod.POST})
  public String donateNumber(@RequestParam(value="index")int index,
                             @RequestParam(value="number")long number){
    accountsList.get(index).raiseBalanceWithMyNumber(number);
    return "redirect:/showall";
  }


/*@PostMapping (value="/addaccount")
public String addAccount(
          @RequestParam(value = "name")String name,
          @RequestParam(value = "type")String animalType,
          @RequestParam(value = "balance")long balance){
  accountsList.add(new BankAccount(name,balance,animalType));
  return "redirect:/showall";
  } */
}

/*
Creating new Bank Accounts
Add new row of input elements to our previously created template
With the help of these elements make sure, that the user can add new BankAccounts to our List
 */
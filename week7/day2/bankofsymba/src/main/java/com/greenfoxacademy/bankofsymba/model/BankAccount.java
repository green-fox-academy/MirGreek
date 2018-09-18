package com.greenfoxacademy.bankofsymba.model;

public class BankAccount {
  String name;
  long balance;
  String animalType;

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  String currency;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return  balance ;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }


  public BankAccount(String name, long balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }


  public BankAccount() {
  }
}

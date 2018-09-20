package com.greenfoxacademy.bankofsymba.model;

public class BankAccount {
  String name;
  long balance;
  String animalType;
  public boolean isKing;

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

  public boolean getIsKing() {
    return isKing;
  }

  public void setIsKing(boolean isKing) {
    this.isKing = isKing;
  }

  public BankAccount(String name, long balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
  }


  public BankAccount() {
  }

  public void raiseBalace(){
    if (getIsKing()) {
     setBalance(getBalance() + 100);
    } else {
      setBalance(getBalance() + 10);
    }
  }
}

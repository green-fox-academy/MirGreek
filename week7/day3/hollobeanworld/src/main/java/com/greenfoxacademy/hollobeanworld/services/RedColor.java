package com.greenfoxacademy.hollobeanworld.services;

import org.springframework.stereotype.Service;


public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("THis is a red color, girl!");
  }
}

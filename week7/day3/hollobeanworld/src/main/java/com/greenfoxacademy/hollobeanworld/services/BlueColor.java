package com.greenfoxacademy.hollobeanworld.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BlueColor implements MyColor {
  Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
   printer.log("THis is a blue color, dude!");
  }
}

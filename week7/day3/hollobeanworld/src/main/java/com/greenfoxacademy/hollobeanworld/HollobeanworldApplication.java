package com.greenfoxacademy.hollobeanworld;

import com.greenfoxacademy.hollobeanworld.services.BlueColor;
import com.greenfoxacademy.hollobeanworld.services.MyColor;
import com.greenfoxacademy.hollobeanworld.services.Printer;
import com.greenfoxacademy.hollobeanworld.services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HollobeanworldApplication implements CommandLineRunner {
  MyColor color;
  Printer printer;

  @Autowired
  public HollobeanworldApplication(Printer printer, MyColor color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(HollobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("szia");
    color.printColor();
  }

}

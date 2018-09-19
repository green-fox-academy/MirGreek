package com.greenfoxacademy.hollobeanworld;

import com.greenfoxacademy.hollobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HollobeanworldApplication implements CommandLineRunner {

  Printer printer;

  @Autowired
  public HollobeanworldApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HollobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("szia");
  }
}

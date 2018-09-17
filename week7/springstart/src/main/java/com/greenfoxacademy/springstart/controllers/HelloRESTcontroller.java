package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTcontroller {
  AtomicLong id;

  public HelloRESTcontroller() {
    id = new AtomicLong(1);
  }

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam(value = "name")String name){
    Greeting greetingObj = new Greeting(id.getAndIncrement(),"Hello " + name);

      return greetingObj;
  }

//@PostMapping("/bla")
 // public Object bla(@RequestHeader(value = "headernameOrID", required = false)String headerName,
                  //  @RequestBody Object object){
   // return object;
//}
//html form -> @ModelAttribute(value = "new object") Object objec){....}

}

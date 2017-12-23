package com.lito.www.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CarController {
  
  @GetMapping
  public String getCars() {
    return "Get all cars";
  }

}

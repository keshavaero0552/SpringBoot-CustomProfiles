package com.keshav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keshav.service.Animal;
@RestController
public class HelloController {
   @Autowired
   private Animal animal;	
   @GetMapping("/")	
   public String getMessage() {
	   return animal.getMessage();
   }
}

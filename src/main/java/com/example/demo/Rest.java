package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Rest {

     @GetMapping("/check/password/{password}")
     public String checkPassword(@PathVariable String password) {
          if (password.length() < 8) {
               return "weak";
          }
          int score = 0;

          if (password.length() > 12) {
               score += 1;
          }
          if (password.length() > 16) {
               score += 1;
          }
          if (password.matches(".*\\d.*")) {
               score += 1;
          }

          if (score == 1) {
               return "weak";
          }
          if (score == 2) {
               return "medium";
          } else {
               return "strong";
          }
     }

}

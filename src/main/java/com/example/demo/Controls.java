package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controls {

     @GetMapping("/")
     public String index() {
          return "index.html";
     }

     @GetMapping("/aboutMe")
     public String aboutMe() {
          return "aboutMe.html";
     }

     @GetMapping("/contacts")
     public String contacts() {
          return "contacts.html";
     }

     @GetMapping("/projects")
     public String projects() {
          return "projects.html";
     }

}
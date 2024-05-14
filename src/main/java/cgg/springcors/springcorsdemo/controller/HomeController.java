package cgg.springcors.springcorsdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin(origins = "http://localhost:9090")
// @CrossOrigin(origins = "*")
public class HomeController {
    
    @GetMapping("/test")
    
    public String home(){
        return "Welcome to CGG";
    }
}

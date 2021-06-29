package at.felixbiedermann.firstservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    public String test() {
        return "Hello this is the First Microservice";
    }
}

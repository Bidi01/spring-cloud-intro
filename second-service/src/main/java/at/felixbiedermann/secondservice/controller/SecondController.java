package at.felixbiedermann.secondservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test() {
        return "Hello this is the Second Microservice";
    }
}

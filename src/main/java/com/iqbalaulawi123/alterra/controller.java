package com.iqbalaulawi123.alterra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
public class controller {
    @GetMapping
    public String getAllMessage(){
        return "Hello World (GET)";
    }

    @PostMapping
    public String postMessage(){
        return "Hello World (POST)";
    }

    @DeleteMapping
    public String deleteMessage(){
        return "Hello World (DELETE)";
    }


}

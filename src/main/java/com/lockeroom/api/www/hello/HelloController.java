package com.lockeroom.api.www.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/heartbeat")
    public ResponseEntity heartbeatCheck(){
        return ResponseEntity.ok().body("hello");
    }
}

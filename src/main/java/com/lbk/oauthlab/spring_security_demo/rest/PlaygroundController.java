package com.lbk.oauthlab.spring_security_demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlaygroundController {
    @GetMapping("/ping")
    @ResponseBody
    public String ping() {
        return "pong";
    }

    @GetMapping("/hi/{id}")
    @ResponseBody
    public String greet(@PathVariable("id") String subject) {
        return String.format("Hello %s!", subject);
    }
}

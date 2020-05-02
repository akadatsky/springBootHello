package com.akadatsky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    //@GetMapping("/hello")
    public String main(Map<String, Object> model) {
        return "main";
    }

}

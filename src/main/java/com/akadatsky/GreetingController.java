package com.akadatsky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping
    public String main(Map<String, Object> model) {
        return "main";
    }

    @GetMapping("/hello")
    public String hello(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            @RequestParam(name = "age", required = false, defaultValue = "22") int age,
            Map<String, Object> model
    ) {

        model.put("name", name);
        model.put("age", age);
        return "hello";
    }

    @PostMapping
    public String test(Map<String, Object> model) {
        return "test post";
    }



}

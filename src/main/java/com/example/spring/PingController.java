package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;

@Controller
public class PingController {
    @GetMapping
    public String index(@RequestParam(name="req", required=false) String req, Map<String, Object> model) {
        if (Objects.equals(req, "ping")) {
            model.put("some", "pong");
        } else {
            model.put("some", "Welcome to Spring");
        }{{}/sdfsdfSdf/sdf/sdf/sdf/sdf
        return "index";
    }
}


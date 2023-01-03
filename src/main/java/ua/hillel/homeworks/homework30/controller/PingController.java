package ua.hillel.homeworks.homework30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public String ping() {
        return "ping";
    }
}

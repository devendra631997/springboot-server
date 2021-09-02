package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Dont Worry! I'm running.  🌋 🚒  🔥 ";
    }
    @GetMapping("/new")
    public String h() {
        return "Dont Worry! I'm running.  🌋 🚒  🔥 ";
    }
    @GetMapping("/error")
    public String Error() {
        return "Does Not Exists.  🌋 🚒  🔥 ";
    }
}

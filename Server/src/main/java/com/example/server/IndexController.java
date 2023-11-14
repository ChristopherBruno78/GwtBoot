package com.example.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*
*   Controller that servers the host page
*/
@Controller
public class IndexController {

    @GetMapping("/")
    public String indexPage() {
       return "index";
    }
}

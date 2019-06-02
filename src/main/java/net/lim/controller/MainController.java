package net.lim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping({"/", "", "/index"})
    public String indexPage() {
        return "index";
    }
}

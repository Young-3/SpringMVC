package org.young.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVC {
    @RequestMapping("welcome")
    public String welcome(){
        return "success";
    }
}

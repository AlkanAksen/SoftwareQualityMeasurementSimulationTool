package com.myapp.sqmst.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/landingPage"})
    public String landingPage() {
        return "landingPage";
    }
}
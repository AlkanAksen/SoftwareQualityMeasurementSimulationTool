package com.myapp.sqmst.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/landingPage"})
    public String landingPage() {
        return "landingPage"; // src/main/resources/templates/landingPage.html
    }

    @GetMapping("/step1")
    public String step1Page() {
        return "step1Page"; // src/main/resources/templates/step1Page.html
    }
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String homePage(){
        return "home";
    }
    @RequestMapping("tocrabcakes")
    public String gotoCrabCakes(){
        return "crabcakes";
    }
    @RequestMapping("toinjera")
    public String gotoInjera(){
        return "injerarecipe";
    }
    @RequestMapping("togulab")
    public String gotoGulab(){
        return "gulabjamunrecipe";
    }
    @RequestMapping("tojerk")
    public String gotoJerk(){
        return "jerkchicken";

    }
    @RequestMapping("tobara")
    public String gotoBara(){
        return "bara";

    }
    @RequestMapping("topumpkin")
    public String gotoPumpkin(){
        return "pumpkinricenoodles";

    }
    @RequestMapping("tocroque")
    public String gotoCroque(){
        return "croquemadame";
    }
    @RequestMapping("togallery")
    public String gotoGallery(){
        return "recipelist";

    }
    @RequestMapping("tohome")
    public String gotoHome(){
        return "home";

    }
}

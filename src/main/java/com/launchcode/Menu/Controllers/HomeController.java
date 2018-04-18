package com.launchcode.Menu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("special")
public class HomeController {

    //request path: special
    @RequestMapping(value = "")
    public String index() {
        return "special/index";

    }
    //request path: form
    @RequestMapping(value = "form", method=SRequestMethod.GET)
    public String form(){
        return "special/form";
    }
}

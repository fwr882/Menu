package com.launchcode.Menu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("search")
public class HomeController {

    //request path: search
    @RequestMapping(value = "")
    public String index() {
        return "search/index";

    }
}

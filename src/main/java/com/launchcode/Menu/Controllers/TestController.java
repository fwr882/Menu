package com.launchcode.Menu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "This is a Test";

    }
}

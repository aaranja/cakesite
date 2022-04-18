package com.company.cakesite.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/welcome")
    public String welcome() {
        logger.info("Returning welcome view");
        return "welcome";
//        return new ModelAndView("welcome");
    }
}

package com.eg.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView home(){
        logger.info("Página de inicio");
        return new ModelAndView("/index");
    }
}

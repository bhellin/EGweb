package com.eg.web.controller;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest extends TestCase {

    public void testHomeView() throws Exception {
        HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.home();
        assertEquals("/index", modelAndView.getViewName());
    }
}

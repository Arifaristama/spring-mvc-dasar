package org.arif.mvcdasar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView("about");
        return mv;
    }
    @GetMapping("/contact-us")
    public ModelAndView contactUs() {
        ModelAndView mv = new ModelAndView("contact-us");
        return mv;
    }
}

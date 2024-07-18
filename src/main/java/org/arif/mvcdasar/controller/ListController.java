package org.arif.mvcdasar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/list")
public class ListController {
    @GetMapping("")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("list/ordered-list");
        return mav;
    }
    @GetMapping("/unordered")
    public ModelAndView unoredered() {
        ModelAndView mav = new ModelAndView("list/unordered-list");
        return mav;
    }
}

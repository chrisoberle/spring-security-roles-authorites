package org.baeldung.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class DemoController {

    @RequestMapping(value = "/protectedbyauthority", method = RequestMethod.GET)
    public String protectedByAuthority(final Locale locale, final Model model) {
        //model.addAttribute("users", userService.getUsersFromSessionRegistry());
        return "protectedbyauthority";
    }

    @RequestMapping(value = "/protectedbyrole", method = RequestMethod.GET)
    public String protectedByRole(final Locale locale, final Model model) {
        //model.addAttribute("users", userService.getUsersFromSessionRegistry());
        return "protectedbyrole";
    }

    @RequestMapping(value = "/protectedbynothing", method = RequestMethod.GET)
    public String protectedByNothing(final Locale locale, final Model model) {
        //model.addAttribute("users", userService.getUsersFromSessionRegistry());
        return "protectedbynothing";
    }
}

package com.stlnavajo.VaporeonButton;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping
    public String vaporeon(Model model) {
        model.addAttribute("title", "Vaporeon Button");
        return "vaporeon";
    }
}

package com.challenge.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.HashMap;

@Controller
public class ChallengeController {

    @GetMapping("/")
    public String index(Model model) {

        HashMap<String, String> additional_attributes = new HashMap<String, String>();
        additional_attributes.put("data-foo", "bar");
        additional_attributes.put("aria-live", "polite");

        model.addAttribute("additional_attributes", additional_attributes);
        return "index";
    }
}
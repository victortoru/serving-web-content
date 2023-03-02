package com.example.servingwebcontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GreetingController {
List <String> names;
        @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            names.add(name);
            model.addAttribute("names", names);
            return "greeting";
        }

        @Autowired
    public GreetingController(List<String> names) {
        this.names = names;
    }
}

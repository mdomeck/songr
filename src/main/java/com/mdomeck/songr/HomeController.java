package com.mdomeck.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
    public class HomeController {

        @GetMapping("/")
        public String showHome() {
            return "home";
        }

        @GetMapping("/capitalize/{message}")
        public String capitalize( Model welcome,
               @PathVariable String message
        ) {

            welcome.addAttribute("message", message.toUpperCase());

            return "hello";
        }

    }


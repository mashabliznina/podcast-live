package com.bliznina.podcast.controllers;

import com.bliznina.podcast.models.Episode;
import com.bliznina.podcast.services.EpisodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/contacts")
    public String showContacts(){
        return "contacts";
    }
}

package com.bliznina.podcast.controllers;

import com.bliznina.podcast.models.Episode;
import com.bliznina.podcast.repositories.EpisodeRepository;
import com.bliznina.podcast.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class PageController {
    EpisodeService episodeService;

    @Autowired
    public PageController(EpisodeService episodeService) {
        this.episodeService = episodeService;

    }
    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("episodes", episodeService.getSortedNumberEpisodes());
        return "home";
    }

    @GetMapping("/contacts")
    public String showContacts(){
        return "contacts";
    }

    @GetMapping("/episodes")
    public String showAllEpisodes(Model model){
        model.addAttribute("episodes",episodeService.getAllEpisodes());
        return "episodes";
    }
}

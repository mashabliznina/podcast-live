package com.bliznina.podcast.controllers;

import com.bliznina.podcast.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PageController {
    @Autowired
    EpisodeService episodeService;

//    public PageController(EpisodeService episodeService) {
//        this.episodeService = episodeService;
//
//    }
//    @GetMapping("/")
//    public String home(Model model){
//        model.addAttribute("episodes", episodeService.getSortedNumberEpisodes(4));
//        return "home";
//    }

    @GetMapping("/contacts/")
    public String showContacts(){
        return "contacts";
    }

    @GetMapping("/subscribe/")
    public String showSubscribe(){
        return "subscribe";
    }

    @GetMapping("/feedback/")
    public String showFeedback(){
        return "feedback";
    }

    @GetMapping("/episodes/")
    public String showAllEpisodes(Model model){
        model.addAttribute("episodes",episodeService.getAllEpisodes());
        return "episodes";
    }

    @GetMapping("/episodes/{id}")
    public String showEpisode(@PathVariable Integer id, Model model){
        model.addAttribute("episode",episodeService.getEpisodeById(id));
        return "episode";
    }
}

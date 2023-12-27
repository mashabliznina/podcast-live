package com.bliznina.podcast.controllers;

import com.bliznina.podcast.models.Episode;
import com.bliznina.podcast.services.EpisodeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@Controller
@RequestMapping("/episodes")
public class EpisodesController {

    @GetMapping
    public String showAllEpisodes(Model model){
        EpisodeService episodeService = new EpisodeService();
        ArrayList<Episode> episodes = episodeService.getAllEpisodes();
        model.addAttribute("episodes",episodeService.getAllEpisodes());

        return "episodes";
    }
}

//package com.bliznina.podcast.controllers;

import com.bliznina.podcast.models.Episode;
import com.bliznina.podcast.repositories.EpisodeRepository;
import com.bliznina.podcast.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;

//@Controller
//@RequestMapping("/episodes")
//public class EpisodesController {
//    @Autowired
//    private final EpisodeRepository episodeRepository;
//    public EpisodesController(EpisodeRepository episodeRepository) {
//        this.episodeRepository = episodeRepository;
//    }
//
//    @GetMapping
//    public String showAllEpisodes(Model model){
//        EpisodeService episodeService = new EpisodeService();
//        //Episode e = episodeRepository.save(new Episode("ccdc", "tttt",  LocalDate.of(2022,12, 12), "preview"));
//        model.addAttribute("episodes",episodeRepository.findAll());
//        return "episodes";
//    }
//}

package com.bliznina.podcast.controllers;

import com.bliznina.podcast.ViewModels.Home.EpisodeModel;
import com.bliznina.podcast.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Controller
@RequestMapping
public class HomeController {
    @Autowired
    EpisodeService episodeService;

    @GetMapping("/")
    public String home(Model model) {
        Collection<EpisodeModel> data = episodeService
                .getSortedNumberEpisodes(4)
                .stream()
                .map(x -> new EpisodeModel(x.getId(),
                        x.getTitle(),
                        x.getPreview(),
                        x.getTheme(),
                        x.getDate(),
                        x.getBuzz_id())
                )
                .toList();
        model.addAttribute("episodes", data);
        return "home";
    }
}

package com.bliznina.podcast.services;

import com.bliznina.podcast.models.Episode;
import com.bliznina.podcast.repositories.EpisodeRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Component
public class EpisodeServiceImpl implements EpisodeService{

    EpisodeRepository episodeRepository;

    @Autowired
    public EpisodeServiceImpl(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    @Override
    public void addEpisode(Episode episode) {
        episodeRepository.save(episode);
    }

    @Override
    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll();
    }

    @Override
    public Episode getEpisodeById(int id) {
        return episodeRepository.getReferenceById(id);
    }

    @Override
    public void updateEpisodeInfo(int id) {

    }

    @Override
    public void deleteEpisodeById(int id) {
    }

    @Override
    public ArrayList<Episode> getSortedNumberEpisodes(int maxSize) {
        List<Episode> episodes = episodeRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
        return episodes
                .stream()
                .limit(maxSize)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

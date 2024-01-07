package com.bliznina.podcast.services;

import com.bliznina.podcast.models.Episode;

import java.util.ArrayList;
import java.util.List;

public interface EpisodeService {

    void addEpisode(Episode episode);
    List<Episode> getAllEpisodes();
    Episode getEpisodeById(int id);
    void updateEpisodeInfo(int id);
    void deleteEpisodeById(int id);

    ArrayList<Episode> getSortedNumberEpisodes();
}

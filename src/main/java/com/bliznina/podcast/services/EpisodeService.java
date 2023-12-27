package com.bliznina.podcast.services;

import com.bliznina.podcast.models.Episode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class EpisodeService {

    public ArrayList<Episode> getAllEpisodes() {
        ObjectMapper mapper = JsonMapper.builder()
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true)
                .build();
        try {
            ArrayList<Episode> episodes = mapper.readValue(getClass().getResourceAsStream("/episodes.json"),
                    new TypeReference<>() { });
            return episodes;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
}

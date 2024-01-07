package com.bliznina.podcast.repositories;

import com.bliznina.podcast.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {

}

package com.bliznina.podcast.ViewModels.Home;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EpisodeModel {
    public int id;
    public String title;
    public String preview;
    public String theme;
    public LocalDate date;
    public String buzz_id;
}

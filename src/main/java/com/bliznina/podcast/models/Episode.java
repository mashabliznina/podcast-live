package com.bliznina.podcast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name = "episodes")
@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class Episode {
    public Episode(){ }
    public Episode(String theme, String title, LocalDate date, String preview) {
        this.theme = theme;
        this.title = title;
        this.preview = preview;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "theme")
    String theme;

    @Column(name = "title")
    String title;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "preview")
    String preview;
}

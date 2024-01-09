package com.bliznina.podcast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDate;


@Entity
@Table(name = "episodes")
@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class Episode {
    public Episode(){ }
    public Episode(String theme, String title, LocalDate date, String preview, String body) {
        this.theme = theme;
        this.title = title;
        this.preview = preview;
        this.date = date;
        this.body = body;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "theme",  length = 30)
    String theme;

    @Column(name = "title",  length = 70)
    String title;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "preview",  length = 70)
    String preview;

    @Column(name = "body")
    String body;
}

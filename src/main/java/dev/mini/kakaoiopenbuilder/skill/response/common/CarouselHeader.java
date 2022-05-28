package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarouselHeader {
    private String title;
    private String description;
    private Thumbnail thumbnail;

    @JsonCreator
    public CarouselHeader(
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("thumbnail") Thumbnail thumbnail
    ) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @Override
    public String toString() {
        return "CarouselHeader{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail=" + thumbnail +
                '}';
    }
}
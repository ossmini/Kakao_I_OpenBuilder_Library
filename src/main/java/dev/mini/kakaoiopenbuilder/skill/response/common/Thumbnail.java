package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnail {
    private String imageUrl;
    private Link link;
    private boolean fixedRatio;
    private int width;
    private int height;

    @JsonCreator
    public Thumbnail(
            @JsonProperty("imageUrl") String imageUrl,
            @JsonProperty("link") Link link,
            @JsonProperty("fixedRatio") boolean fixedRatio,
            @JsonProperty("width") int width,
            @JsonProperty("height") int height
    ) {
        this.imageUrl = imageUrl;
        this.link = link;
        this.fixedRatio = fixedRatio;
        this.width = width;
        this.height = height;
    }

    public static Thumbnail of(String imageUrl) {
        return new Thumbnail(imageUrl, null, false, 0, 0);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Link getLink() {
        return link;
    }

    public boolean getFixedRatio() {
        return fixedRatio;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "imageUrl='" + imageUrl + '\'' +
                ", link=" + link +
                ", fixedRatio=" + fixedRatio +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
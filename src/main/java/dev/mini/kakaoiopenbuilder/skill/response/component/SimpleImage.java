package dev.mini.kakaoiopenbuilder.skill.response.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleImage extends Component {
    private String imageUrl;
    private String altText;

    @JsonCreator
    public SimpleImage(
            @JsonProperty("imageUrl") String imageUrl,
            @JsonProperty("altText") String altText
    ) {
        super("SimpleImage");
        this.imageUrl = imageUrl;
        this.altText = altText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAltText() {
        return altText;
    }

    @Override
    public String toString() {
        return "SimpleImage{" +
                "imageUrl='" + imageUrl + '\'' +
                ", altText='" + altText + '\'' +
                '}';
    }

}

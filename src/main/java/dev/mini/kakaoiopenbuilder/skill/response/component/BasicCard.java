package dev.mini.kakaoiopenbuilder.skill.response.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.mini.kakaoiopenbuilder.skill.response.common.Button;
import dev.mini.kakaoiopenbuilder.skill.response.common.Thumbnail;

import java.util.List;

public class BasicCard extends Component {
    String title;
    String description;
    Thumbnail thumbnail;
    List<Button> buttons;

    @JsonCreator
    public BasicCard(
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("thumbnail") Thumbnail thumbnail,
            @JsonProperty("buttons") List<Button> buttons
    ) {
        super("BasicCard");
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.buttons = buttons;
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

    public List<Button> getButtons() {
        return buttons;
    }

    @Override
    public String toString() {
        return "BasicCard{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail=" + thumbnail +
                ", buttons=" + buttons +
                '}';
    }

}

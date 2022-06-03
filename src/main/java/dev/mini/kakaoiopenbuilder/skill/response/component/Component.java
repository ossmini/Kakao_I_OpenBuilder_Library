package dev.mini.kakaoiopenbuilder.skill.response.component;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type",
        defaultImpl = SimpleText.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SimpleText.class),
        @JsonSubTypes.Type(value = SimpleImage.class),
        @JsonSubTypes.Type(value = BasicCard.class)
})
public class Component {
    private final String type;

    public Component(String type) {
        this.type = type;
    }

}

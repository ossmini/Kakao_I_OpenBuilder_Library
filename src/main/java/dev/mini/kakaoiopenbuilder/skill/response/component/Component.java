package dev.mini.kakaoiopenbuilder.skill.response.component;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = SimpleText.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SimpleText.class, name = "simpleText"),
})
public interface Component {

}

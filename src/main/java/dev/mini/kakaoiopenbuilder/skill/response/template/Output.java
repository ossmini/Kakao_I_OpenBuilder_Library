package dev.mini.kakaoiopenbuilder.skill.response.template;

import com.fasterxml.jackson.annotation.*;
import dev.mini.kakaoiopenbuilder.skill.response.component.Component;

import java.util.Collections;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Output {
    private Map<String, Component> component;

    @JsonCreator
    public Output(
            @JsonProperty("key") String key,
            @JsonProperty("value") Component value) {
        this.component = Collections.singletonMap(key, value);
    }

    @JsonAnySetter
    public void setComponents(String key, Component value) {
        this.component = Collections.singletonMap(key, value);
    }

    @JsonAnyGetter
    public Map<String, Component> getComponent() {
        return component;
    }

    @Override
    public String toString() {
        return "Output{" +
                "component=" + component +
                '}';
    }

}

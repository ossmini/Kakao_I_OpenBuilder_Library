package dev.mini.kakaoiopenbuilder.skill.response.template;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Template {
    private final List<Output> output;

    @JsonCreator
    public Template(
            @JsonProperty("outputs") List<Output> output
    ) {
        this.output = output;
    }

    public List<Output> getOutputs() {
        return output;
    }

    @Override
    public String toString() {
        return "Template{" +
                "output=" + output +
                '}';
    }

}

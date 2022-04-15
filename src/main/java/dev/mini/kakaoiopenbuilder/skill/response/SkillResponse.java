package dev.mini.kakaoiopenbuilder.skill.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.mini.kakaoiopenbuilder.skill.response.context.ContextControl;
import dev.mini.kakaoiopenbuilder.skill.response.template.Template;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SkillResponse {
    private final String version;
    private final Template template;
    private final ContextControl context;
    private final Map<String, String> data;

    @JsonCreator
    public SkillResponse(
            @JsonProperty("template") Template template,
            @JsonProperty("context") ContextControl context,
            @JsonProperty("data") Map<String, String> data
    ) {
        this.version = "2.0";
        this.template = template;
        this.context = context;
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public Template getTemplate() {
        return template;
    }

    public ContextControl getContext() {
        return context;
    }

    public Map<String, String> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "SkillResponse{" +
                "version='" + version + '\'' +
                ", template=" + template +
                ", context=" + context +
                ", data=" + data +
                '}';
    }
}
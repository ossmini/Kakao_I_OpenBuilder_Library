package dev.mini.kakaoiopenbuilder.skill.response;

import dev.mini.kakaoiopenbuilder.skill.response.context.ContextControl;
import dev.mini.kakaoiopenbuilder.skill.response.template.Template;

import java.util.HashMap;
import java.util.Map;

public class SKillResponseBuilder {
    private Template template;
    private ContextControl context;
    private Map<String, String> data = new HashMap<>();

    static public SKillResponseBuilder builder() {
        return new SKillResponseBuilder();
    }

    public SKillResponseBuilder addTemplate(Template template) {
        this.template = template;
        return this;
    }

    public SKillResponseBuilder addContextControl(ContextControl context) {
        this.context = context;
        return this;
    }

    public SKillResponseBuilder addData(String key, String value) {
        this.data.put(key, value);
        return this;
    }

    public SKillResponseBuilder addData(Map<String, String> data) {
        this.data.putAll(data);
        return this;
    }

    public SkillResponse build() {
        return new SkillResponse(template, context, data);
    }

}

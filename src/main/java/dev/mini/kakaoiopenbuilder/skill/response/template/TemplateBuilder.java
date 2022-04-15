package dev.mini.kakaoiopenbuilder.skill.response.template;

import dev.mini.kakaoiopenbuilder.skill.response.component.SimpleText;

import java.util.ArrayList;
import java.util.List;

public class TemplateBuilder {
    private List<Output> output = new ArrayList<>();

    public static TemplateBuilder builder() {
        return new TemplateBuilder();
    }

    public TemplateBuilder addSimpleText(String text) {
        output.add(new Output("simpleText", new SimpleText(text)));
        return this;
    }

    public Template build() {
        return new Template(output);
    }

}

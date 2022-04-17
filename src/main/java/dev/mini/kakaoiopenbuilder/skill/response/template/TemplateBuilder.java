package dev.mini.kakaoiopenbuilder.skill.response.template;

import dev.mini.kakaoiopenbuilder.skill.exception.ComponentsOutOfBoundsException;
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
        isValidComponent();
        return new Template(output);
    }

    private void isValidComponent() {
        if(output.size() < 1 || output.size() > 3) {
            throw new ComponentsOutOfBoundsException();
        }
    }

}

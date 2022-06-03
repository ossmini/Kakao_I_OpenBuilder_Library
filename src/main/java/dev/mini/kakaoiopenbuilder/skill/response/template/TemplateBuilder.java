package dev.mini.kakaoiopenbuilder.skill.response.template;

import dev.mini.kakaoiopenbuilder.skill.exception.ComponentsOutOfBoundsException;
import dev.mini.kakaoiopenbuilder.skill.response.common.Button;
import dev.mini.kakaoiopenbuilder.skill.response.common.Thumbnail;
import dev.mini.kakaoiopenbuilder.skill.response.component.BasicCard;
import dev.mini.kakaoiopenbuilder.skill.response.component.SimpleImage;
import dev.mini.kakaoiopenbuilder.skill.response.component.SimpleText;

import java.util.ArrayList;
import java.util.List;

public class TemplateBuilder {
    private List<Output> output = new ArrayList<>();

    public static TemplateBuilder builder() {
        return new TemplateBuilder();
    }

    public TemplateBuilder addSimpleText(String text) {
        SimpleText simpleText = new SimpleText(text);
        output.add(new Output("simpleText", simpleText));
        return this;
    }

    public TemplateBuilder addSimpleImage(String imageUrl, String altText) {
        SimpleImage simpleImage = new SimpleImage(imageUrl, altText);
        output.add(new Output("simpleImage", simpleImage));
        return this;
    }

    public TemplateBuilder addBasicCard(String title, String description, Thumbnail thumbnail, List<Button> buttons) {
        BasicCard basicCard = new BasicCard(title, description, thumbnail, buttons);
        output.add(new Output("basicCard", basicCard));
        return this;
    }

    public Template build() {
        isValidComponent();
        return new Template(output);
    }

    private void isValidComponent() {
        if(output.isEmpty() || output.size() > 3) {
            throw new ComponentsOutOfBoundsException();
        }
    }

}

package dev.mini.kakaoiopenbuilder.skill.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.exception.ComponentsOutOfBoundsException;
import dev.mini.kakaoiopenbuilder.skill.response.template.Template;
import dev.mini.kakaoiopenbuilder.skill.response.template.TemplateBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SkillResponseTest {

    private static final String SKILL_SIMPLE_TEXT_FILE_PATH = "testResources/skill_response_simple_text.json";

    @Test
    @DisplayName("출력할 수 있는 Skill Component는 1개 미만일 수 없다.")
    void invalidComponentsExceptionWhenZero() {
        // given when that
        assertThatThrownBy(() -> {
            Template template = new TemplateBuilder()
                    .build();
        }).isInstanceOf(ComponentsOutOfBoundsException.class)
                .hasMessage("출력할 수 있는 Skill Component의 개수는 1개 이상 3개 이하입니다.");
    }

    @Test
    @DisplayName("출력할 수 있는 Skill Component의 개수는 3개 초과일 수 없다.")
    void invalidComponentsExceptionWhenExceedsThree() {
        // given when that
        assertThatThrownBy(() -> {
            Template template = new TemplateBuilder()
                    .addSimpleText("test1")
                    .addSimpleText("test2")
                    .addSimpleText("test3")
                    .addSimpleText("test4")
                    .build();
        }).isInstanceOf(ComponentsOutOfBoundsException.class)
                .hasMessage("출력할 수 있는 Skill Component의 개수는 1개 이상 3개 이하입니다.");
    }

    @Test
    @DisplayName("SimpleText 포맷이 동일한지 검증한다.")
    void validSimpleText() throws IOException {
        // given
        Template actual = loadSkillResponseTemplateJson(SKILL_SIMPLE_TEXT_FILE_PATH).getTemplate();

        // when
        Template expected = TemplateBuilder.builder()
                .addSimpleText("간단한 텍스트 요소입니다.")
                .build();

        // that
        assertThat(actual.toString()).hasToString(expected.toString());
    }

    private SkillResponse loadSkillResponseTemplateJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try(InputStream fileStream = new FileInputStream(filePath)) {
            return objectMapper.readValue(fileStream, SkillResponse.class);
        }
    }

}

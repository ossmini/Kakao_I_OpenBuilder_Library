package dev.mini.kakaoiopenbuilder.skill.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.response.template.Template;
import dev.mini.kakaoiopenbuilder.skill.response.template.TemplateBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

class SkillResponseTest {

    private static final String SKILL_SIMPLE_TEXT_FILE_PATH = "testResources/skill_response_simple_text.json";

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

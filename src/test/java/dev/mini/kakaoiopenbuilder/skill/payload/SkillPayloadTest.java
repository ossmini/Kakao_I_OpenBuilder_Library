package dev.mini.kakaoiopenbuilder.skill.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.payload.intent.Intent;
import dev.mini.kakaoiopenbuilder.skill.payload.bot.Bot;
import dev.mini.kakaoiopenbuilder.skill.payload.userrequest.UserRequest;
import dev.mini.kakaoiopenbuilder.skill.payload.action.Action;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SkillPayloadTest {

    private static final String SKILL_PAYLOAD_TEST_FILE_PATH = "testResources/skill_payload.json";
    private SkillPayload skillPayload;

    @BeforeEach
    public void setUp() throws IOException {
        loadSkillPayloadJson();
    }

    @Test
    @DisplayName("SkillPayload 포맷이 동일한지 검증한다.")
    void skillPayloadValidTest() throws JsonProcessingException {
        // given
        ObjectMapper objectMapper = new ObjectMapper();
        SkillPayload actual = skillPayload;

        // when
        String json = objectMapper.writeValueAsString(actual);
        SkillPayload expected = objectMapper.readValue(json, SkillPayload.class);

        // that
        assertAll(
                () -> assertThat(json).doesNotContain("null"),
                () -> assertThat(actual).isEqualTo(expected)
        );
    }

    @Test
    @DisplayName("UserRequest 포맷이 동일한지 검증한다.")
    void userRequestValidTest() throws JsonProcessingException {
        // given
        ObjectMapper objectMapper = new ObjectMapper();
        UserRequest actual = skillPayload.getUserRequest();

        // when
        String json = objectMapper.writeValueAsString(actual);
        UserRequest expected = objectMapper.readValue(json, UserRequest.class);

        // that
        assertAll(
                () -> assertThat(json).doesNotContain("null"),
                () -> assertThat(actual).isEqualTo(expected)
        );
    }

    @Test
    @DisplayName("Bot 포맷이 동일한지 검증한다.")
    void botValidTest() throws JsonProcessingException {
        // given
        ObjectMapper objectMapper = new ObjectMapper();
        Bot actual = skillPayload.getBot();

        // when
        String json = objectMapper.writeValueAsString(actual);
        Bot expected = objectMapper.readValue(json, Bot.class);

        // that
        assertAll(
                () -> assertThat(json).doesNotContain("null"),
                () -> assertThat(actual).isEqualTo(expected)
        );
    }

    @Test
    @DisplayName("Intent 포맷이 동일한지 검증한다.")
    void intentValidTest() throws JsonProcessingException {
        // given
        ObjectMapper objectMapper = new ObjectMapper();
        Intent actual = skillPayload.getIntent();

        // when
        String json = objectMapper.writeValueAsString(actual);
        Intent expected = objectMapper.readValue(json, Intent.class);

        // that
        assertAll(
                () -> assertThat(json).doesNotContain("null"),
                () -> assertThat(actual).isEqualTo(expected)
        );
    }

    @Test
    @DisplayName("Action 포맷이 동일한지 검증한다.")
    void actionValidTest() throws JsonProcessingException {
        // given
        ObjectMapper objectMapper = new ObjectMapper();
        Action actual = skillPayload.getAction();

        // when
        String json = objectMapper.writeValueAsString(actual);
        Action expected = objectMapper.readValue(json, Action.class);

        // that
        assertAll(
                () -> assertThat(json).doesNotContain("null"),
                () -> assertThat(actual).isEqualTo(expected)
        );
    }

    private void loadSkillPayloadJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try(InputStream fileStream = new FileInputStream(SKILL_PAYLOAD_TEST_FILE_PATH)) {
            skillPayload = objectMapper.readValue(fileStream, SkillPayload.class);
        }
    }

}

package dev.mini.skill.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.skill.payload.bot.Bot;
import dev.mini.skill.payload.intent.Intent;
import dev.mini.skill.payload.userrequest.UserRequest;
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
    @DisplayName("UserRequest 포맷이 동일한지 검증한다.")
    void user_request_valid_test() throws JsonProcessingException {
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
    void bot_valid_test() throws JsonProcessingException {
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
    void intent_valid_test() throws JsonProcessingException {
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

    private void loadSkillPayloadJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try(InputStream fileStream = new FileInputStream(SKILL_PAYLOAD_TEST_FILE_PATH)) {
            skillPayload = objectMapper.readValue(fileStream, SkillPayload.class);
        }
    }

}

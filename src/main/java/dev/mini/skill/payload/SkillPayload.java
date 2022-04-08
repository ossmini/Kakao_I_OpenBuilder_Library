package dev.mini.skill.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.skill.payload.bot.Bot;
import dev.mini.skill.payload.userrequest.UserRequest;

public class SkillPayload {

    private Bot bot;
    private UserRequest userRequest;

    public Bot getBot() {
        return bot;
    }

    public UserRequest getUserRequest() {
        return userRequest;
    }

    @Override
    public String toString() {
        return "SkillPayload{" +
                "userRequest=" + userRequest +
                '}';
    }

    public static SkillPayload parse(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, SkillPayload.class);
    }

}

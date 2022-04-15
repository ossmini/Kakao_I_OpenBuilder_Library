package dev.mini.kakaoiopenbuilder.skill.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.payload.action.Action;
import dev.mini.kakaoiopenbuilder.skill.payload.bot.Bot;
import dev.mini.kakaoiopenbuilder.skill.payload.intent.Intent;
import dev.mini.kakaoiopenbuilder.skill.payload.userrequest.UserRequest;

public class SkillPayload {
    private Bot bot;
    private Intent intent;
    private Action action;
    private UserRequest userRequest;

    public Bot getBot() {
        return bot;
    }

    public Intent getIntent() {
        return intent;
    }

    public Action getAction() {
        return action;
    }

    public UserRequest getUserRequest() {
        return userRequest;
    }

    @Override
    public String toString() {
        return "SkillPayload{" +
                "bot=" + bot +
                ", intent=" + intent +
                ", action=" + action +
                ", userRequest=" + userRequest +
                '}';
    }

    public static SkillPayload parse(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, SkillPayload.class);
    }

}

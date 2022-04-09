package dev.mini.skill.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.skill.payload.action.Action;
import dev.mini.skill.payload.bot.Bot;
import dev.mini.skill.payload.intent.Intent;
import dev.mini.skill.payload.userrequest.UserRequest;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillPayload that = (SkillPayload) o;
        return Objects.equals(bot, that.bot) && Objects.equals(intent, that.intent) && Objects.equals(action, that.action) && Objects.equals(userRequest, that.userRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bot, intent, action, userRequest);
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

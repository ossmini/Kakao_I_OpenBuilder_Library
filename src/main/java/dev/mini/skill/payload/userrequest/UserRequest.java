package dev.mini.skill.payload.userrequest;

import java.util.Objects;

public class UserRequest {
    private String timezone;
    private Block block;
    private String utterance;
    private Params params;
    private String lang;
    private User user;

    public String getTimezone() {
        return timezone;
    }

    public Block getBlock() {
        return block;
    }

    public String getUtterance() {
        return utterance;
    }

    public Params getParams() {
        return params;
    }

    public String getLang() {
        return lang;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return Objects.equals(timezone, that.timezone) && Objects.equals(block, that.block) && Objects.equals(utterance, that.utterance) && Objects.equals(params, that.params) && Objects.equals(lang, that.lang) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timezone, block, utterance, params, lang, user);
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "timezone='" + timezone + '\'' +
                ", block=" + block +
                ", utterance='" + utterance + '\'' +
                ", params=" + params +
                ", lang='" + lang + '\'' +
                ", user=" + user +
                '}';
    }

}

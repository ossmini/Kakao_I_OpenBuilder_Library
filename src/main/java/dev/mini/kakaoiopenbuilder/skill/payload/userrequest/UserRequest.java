package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

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

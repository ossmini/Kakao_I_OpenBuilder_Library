package dev.mini.kakaoiopenbuilder.skill.payload.intent;

public class Reason {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

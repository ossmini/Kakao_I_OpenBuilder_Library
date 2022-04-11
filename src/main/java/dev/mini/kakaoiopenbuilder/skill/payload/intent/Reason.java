package dev.mini.kakaoiopenbuilder.skill.payload.intent;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reason reason = (Reason) o;
        return Objects.equals(code, reason.code) && Objects.equals(message, reason.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        return "Reason{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

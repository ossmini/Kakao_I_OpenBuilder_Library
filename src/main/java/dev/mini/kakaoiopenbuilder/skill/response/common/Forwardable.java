package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Forwardable {
    private boolean forwardable;

    @JsonCreator
    public Forwardable(
            @JsonProperty("forwardable") boolean forwardable
    ) {
        this.forwardable = forwardable;
    }

    public boolean isForwardable() {
        return forwardable;
    }

    @Override
    public String toString() {
        return "Forwardable{" +
                "forwardable=" + forwardable +
                '}';
    }

}
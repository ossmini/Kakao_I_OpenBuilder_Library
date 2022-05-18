package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {
    private String nickname;
    private String imageUrl;

    @JsonCreator
    public Profile(
            @JsonProperty("nickname") String nickname,
            @JsonProperty("imageUrl") String imageUrl
    ) {
        this.nickname = nickname;
        this.imageUrl = imageUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "nickname='" + nickname + '\'' +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }

}
package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = "friend")
public class Properties {
    private String plusfriendUserKey;
    private String appUserId;

    @JsonProperty(value = "isFriend")
    private boolean isFriend;

    public String getPlusfriendUserKey() {
        return plusfriendUserKey;
    }

    public String getAppUserId() {
        return appUserId;
    }

    public boolean isFriend() {
        return isFriend;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "plusfriendUserKey='" + plusfriendUserKey + '\'' +
                ", appUserId='" + appUserId + '\'' +
                ", isFriend=" + isFriend +
                '}';
    }

}
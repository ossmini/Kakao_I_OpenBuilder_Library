package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties that = (Properties) o;
        return isFriend == that.isFriend && Objects.equals(plusfriendUserKey, that.plusfriendUserKey) && Objects.equals(appUserId, that.appUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plusfriendUserKey, appUserId, isFriend);
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
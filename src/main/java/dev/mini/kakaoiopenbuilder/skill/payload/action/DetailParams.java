package dev.mini.kakaoiopenbuilder.skill.payload.action;

import java.util.Objects;

public class DetailParams {
    private String origin;
    private String value;
    private String groupName;

    public String getOrigin() {
        return origin;
    }

    public String getValue() {
        return value;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailParams that = (DetailParams) o;
        return Objects.equals(origin, that.origin) && Objects.equals(value, that.value) && Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, value, groupName);
    }

    @Override
    public String toString() {
        return "DetailParams{" +
                "origin='" + origin + '\'' +
                ", value='" + value + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

}

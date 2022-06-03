package dev.mini.kakaoiopenbuilder.skill.payload.action;

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
    public String toString() {
        return "DetailParams{" +
                "origin='" + origin + '\'' +
                ", value='" + value + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

}

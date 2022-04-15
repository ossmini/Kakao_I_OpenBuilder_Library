package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

public class User {
    private String id;
    private String type;
    private Properties properties;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", properties=" + properties +
                '}';
    }

}

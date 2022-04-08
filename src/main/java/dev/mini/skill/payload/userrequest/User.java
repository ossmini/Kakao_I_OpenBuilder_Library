package dev.mini.skill.payload.userrequest;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(type, user.type) && Objects.equals(properties, user.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, properties);
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

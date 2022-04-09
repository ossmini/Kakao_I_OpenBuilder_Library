package dev.mini.kakaoiopenbuilder.skill.payload.intent;

import java.util.Objects;

public class Intent {
    private String id;
    private String name;
    private Extra extra;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Extra getExtra() {
        return extra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intent intent = (Intent) o;
        return Objects.equals(id, intent.id) && Objects.equals(name, intent.name) && Objects.equals(extra, intent.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, extra);
    }

    @Override
    public String toString() {
        return "Intent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", extra=" + extra +
                '}';
    }

}

package dev.mini.kakaoiopenbuilder.skill.payload.intent;

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
    public String toString() {
        return "Intent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", extra=" + extra +
                '}';
    }

}

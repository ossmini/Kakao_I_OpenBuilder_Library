package dev.mini.kakaoiopenbuilder.skill.payload.bot;

public class Bot {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

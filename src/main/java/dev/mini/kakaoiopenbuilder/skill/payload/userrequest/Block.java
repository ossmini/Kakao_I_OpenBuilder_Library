package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

public class Block {
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
        return "Block{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
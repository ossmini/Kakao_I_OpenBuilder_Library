package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(id, block.id) && Objects.equals(name, block.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Block{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
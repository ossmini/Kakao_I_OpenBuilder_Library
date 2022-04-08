package dev.mini.skill.payload.bot;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return Objects.equals(id, bot.id) && Objects.equals(name, bot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Bot{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

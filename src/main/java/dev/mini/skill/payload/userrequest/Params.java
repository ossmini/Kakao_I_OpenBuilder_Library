package dev.mini.skill.payload.userrequest;

import java.util.Objects;

public class Params {
    private String surface;
    private String ignoreMe;

    public String getSurface() {
        return surface;
    }

    public String getIgnoreMe() {
        return ignoreMe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Params params = (Params) o;
        return Objects.equals(surface, params.surface) && Objects.equals(ignoreMe, params.ignoreMe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface, ignoreMe);
    }

    @Override
    public String toString() {
        return "Params{" +
                "surface='" + surface + '\'' +
                ", ignoreMe='" + ignoreMe + '\'' +
                '}';
    }

}

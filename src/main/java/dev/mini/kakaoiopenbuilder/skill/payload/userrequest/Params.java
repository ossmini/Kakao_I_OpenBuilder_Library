package dev.mini.kakaoiopenbuilder.skill.payload.userrequest;

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
    public String toString() {
        return "Params{" +
                "surface='" + surface + '\'' +
                ", ignoreMe='" + ignoreMe + '\'' +
                '}';
    }

}

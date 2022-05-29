package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {
    private String pc;
    private String mobile;
    private String web;

    @Override
    public String toString() {
        return "Link{" +
                "pc='" + pc + '\'' +
                ", mobile='" + mobile + '\'' +
                ", web='" + web + '\'' +
                '}';
    }

    @JsonCreator
    public Link(
            @JsonProperty("pc") String pc,
            @JsonProperty("mobile") String mobile,
            @JsonProperty("web") String web
    ) {
        this.pc = pc;
        this.mobile = mobile;
        this.web = web;
    }

    public String getPC() {
        return pc;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWeb() {
        return web;
    }

}
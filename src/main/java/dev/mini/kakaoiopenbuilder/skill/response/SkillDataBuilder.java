package dev.mini.kakaoiopenbuilder.skill.response;

import java.util.HashMap;
import java.util.Map;

public class SkillDataBuilder {
    private Map<String, String> data = new HashMap<>();

    public static SkillDataBuilder builder() {
        return new SkillDataBuilder();
    }

    public SkillDataBuilder addData(String key, String value) {
        data.put(key, value);
        return this;
    }

    public SkillData build() {
        return new SkillData(data);
    }

}

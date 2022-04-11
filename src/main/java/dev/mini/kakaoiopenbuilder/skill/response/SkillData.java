package dev.mini.kakaoiopenbuilder.skill.response;

import java.util.Map;
import java.util.Objects;

public class SkillData extends SkillResponse {
    private Map<String, String> data;

    public SkillData() {

    }

    public SkillData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillData that = (SkillData) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "SkillData{" +
                "version=" + super.getVersion() + "," +
                "data=" + data +
                '}';
    }
}

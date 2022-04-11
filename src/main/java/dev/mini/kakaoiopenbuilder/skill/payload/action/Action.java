package dev.mini.kakaoiopenbuilder.skill.payload.action;

import java.util.Map;
import java.util.Objects;

public class Action {
    private String id;
    private String name;
    private Map<String, String> params;
    private Map<String, DetailParams> detailParams;
    private Map<String, Object> clientExtra; // TODO: 현재 검증 안됨, 추후 검증 예정

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public Map<String, DetailParams> getDetailParams() {
        return detailParams;
    }

    public Map<String, Object> getClientExtra() {
        return clientExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return Objects.equals(id, action.id) && Objects.equals(name, action.name) && Objects.equals(params, action.params) && Objects.equals(detailParams, action.detailParams) && Objects.equals(clientExtra, action.clientExtra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, params, detailParams, clientExtra);
    }

    @Override
    public String toString() {
        return "Action{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", params=" + params +
                ", detailParams=" + detailParams +
                ", clientExtra=" + clientExtra +
                '}';
    }

}

package dev.mini.kakaoiopenbuilder.skill.payload.action;

import java.util.Map;

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

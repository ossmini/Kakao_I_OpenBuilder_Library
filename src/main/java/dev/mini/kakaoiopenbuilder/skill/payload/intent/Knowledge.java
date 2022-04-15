package dev.mini.kakaoiopenbuilder.skill.payload.intent;

import java.util.List;

public class Knowledge {
    private String responseType;
    private List<MatchedKnowledges> matchedKnowledges;

    public String getResponseType() {
        return responseType;
    }

    public List<MatchedKnowledges> getMatchedKnowledges() {
        return matchedKnowledges;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "responseType='" + responseType + '\'' +
                ", matchedKnowledges=" + matchedKnowledges +
                '}';
    }

}

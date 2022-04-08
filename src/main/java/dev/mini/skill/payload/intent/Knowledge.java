package dev.mini.skill.payload.intent;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knowledge knowledge = (Knowledge) o;
        return Objects.equals(responseType, knowledge.responseType) && Objects.equals(matchedKnowledges, knowledge.matchedKnowledges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseType, matchedKnowledges);
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "responseType='" + responseType + '\'' +
                ", matchedKnowledges=" + matchedKnowledges +
                '}';
    }

}

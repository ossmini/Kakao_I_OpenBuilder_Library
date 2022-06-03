package dev.mini.kakaoiopenbuilder.skill.payload.intent;

import java.util.List;

public class MatchedKnowledges {
    private List<String> categories;
    private String question;
    private String answer;
    private String imageUrl;
    private String landingUrl;

    public List<String> getCategories() {
        return categories;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLandingUrl() {
        return landingUrl;
    }

    @Override
    public String toString() {
        return "MatchedKnowledges{" +
                "categories=" + categories +
                ", questions='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", landingUrl='" + landingUrl + '\'' +
                '}';
    }
}

package dev.mini.skill.payload.intent;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchedKnowledges that = (MatchedKnowledges) o;
        return Objects.equals(categories, that.categories) && Objects.equals(question, that.question) && Objects.equals(answer, that.answer) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(landingUrl, that.landingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, question, answer, imageUrl, landingUrl);
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

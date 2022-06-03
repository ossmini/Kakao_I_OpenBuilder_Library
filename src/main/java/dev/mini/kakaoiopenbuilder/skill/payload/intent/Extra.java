package dev.mini.kakaoiopenbuilder.skill.payload.intent;

public class Extra {
    private Reason reason;
    private Knowledge knowledge;

    public Reason getReason() {
        return reason;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    @Override
    public String toString() {
        return "Extra{" +
                "reason=" + reason +
                ", knowledge=" + knowledge +
                '}';
    }

}

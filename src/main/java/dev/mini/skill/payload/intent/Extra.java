package dev.mini.skill.payload.intent;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extra extra = (Extra) o;
        return Objects.equals(reason, extra.reason) && Objects.equals(knowledge, extra.knowledge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, knowledge);
    }

    @Override
    public String toString() {
        return "Extra{" +
                "reason=" + reason +
                ", knowledge=" + knowledge +
                '}';
    }

}

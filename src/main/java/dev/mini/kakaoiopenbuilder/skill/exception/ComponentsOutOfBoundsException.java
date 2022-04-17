package dev.mini.kakaoiopenbuilder.skill.exception;

public class ComponentsOutOfBoundsException extends IndexOutOfBoundsException {

    private static final String MESSAGE = "출력할 수 있는 Skill Component의 개수는 1개 이상 3개 이하입니다.";

    public ComponentsOutOfBoundsException() {
        super(MESSAGE);
    }

}

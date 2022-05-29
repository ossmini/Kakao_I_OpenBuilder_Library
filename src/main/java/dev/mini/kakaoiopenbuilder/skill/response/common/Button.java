package dev.mini.kakaoiopenbuilder.skill.response.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Button {
    private String label;
    private String action;
    private String webLinkUrl;
    private String messageText;
    private String phoneNumber;
    private String blockId;
    private Map<String, Object> extra;

    @JsonCreator
    public Button(
            @JsonProperty("label") String label,
            @JsonProperty("action") String action,
            @JsonProperty("webLinkUrl") String webLinkUrl,
            @JsonProperty("messageText") String messageText,
            @JsonProperty("phoneNumber") String phoneNumber,
            @JsonProperty("blockId") String blockId,
            @JsonProperty("extra") Map<String, Object> extra
    ) {
        this.label = label;
        this.action = action;
        this.webLinkUrl = webLinkUrl;
        this.messageText = messageText;
        this.phoneNumber = phoneNumber;
        this.blockId = blockId;
        this.extra = extra;
    }

    public String getLabel() {
        return label;
    }

    public String getAction() {
        return action;
    }

    public String getWebLinkUrl() {
        return webLinkUrl;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBlockId() {
        return blockId;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    @Override
    public String toString() {
        return "Button{" +
                "label='" + label + '\'' +
                ", action='" + action + '\'' +
                ", webLinkUrl='" + webLinkUrl + '\'' +
                ", messageText='" + messageText + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", blockId='" + blockId + '\'' +
                ", extra=" + extra +
                '}';
    }

}
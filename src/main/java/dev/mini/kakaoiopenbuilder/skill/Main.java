package dev.mini.kakaoiopenbuilder.skill;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.response.SKillResponseBuilder;
import dev.mini.kakaoiopenbuilder.skill.response.SkillResponse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("Hello Kakao I OpenBuilder Java Library!");

        // example: SkillResponse Data
        Map<String, String> dataMap = new HashMap<String, String>(){{
            put("msg","HI");
            put("name","Ryan");
            put("position","Senior Managing Director");
        }};

        SkillResponse skillResponse = SKillResponseBuilder.builder()
                .addData(dataMap)
                .build();

        System.out.println("Skill Response Data example: " + objectMapper.writeValueAsString(skillResponse));
    }

}
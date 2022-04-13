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
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("name","Ryan");
        dataMap.put("position","Senior Managing Director");

        SkillResponse skillResponse = SKillResponseBuilder.builder()
                .addData("msg","HI")
                .addData(dataMap)
                .build();

        System.out.println("Skill Response Data example");
        System.out.println(objectMapper.writeValueAsString(skillResponse));
    }

}
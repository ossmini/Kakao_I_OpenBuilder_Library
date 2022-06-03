package dev.mini.kakaoiopenbuilder.skill;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mini.kakaoiopenbuilder.skill.response.SKillResponseBuilder;
import dev.mini.kakaoiopenbuilder.skill.response.SkillResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        log.info("Hello Kakao I OpenBuilder Java Library!");

        // example: SkillResponse Data
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("name","Ryan");
        dataMap.put("position","Senior Managing Director");

        SkillResponse skillResponse = SKillResponseBuilder.builder()
                .addData("msg","HI")
                .addData(dataMap)
                .build();

        String json = objectMapper.writeValueAsString(skillResponse);

        log.info("Skill Response Data example");
        log.info(json);
    }

}
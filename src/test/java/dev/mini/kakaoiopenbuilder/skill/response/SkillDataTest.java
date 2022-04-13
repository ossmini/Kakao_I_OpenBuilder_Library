package dev.mini.kakaoiopenbuilder.skill.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class SkillDataTest {

    private static final String SKILL_RESPONSE_DATA_TEST_FILE_PATH = "testResources/skill_response_data.json";
    private SkillResponse skillData;

    @BeforeEach
    public void setUp() throws IOException {
        loadSkillResponseDataJson();
    }

    @Test
    @DisplayName("SkillData 포맷이 동일한지 검증한다.")
    void skillDataValidTest() {
        // given
        SkillResponse actual = skillData;
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("name","Ryan");
        dataMap.put("position","Senior Managing Director");

        // when
        SkillResponse expected = SKillResponseBuilder.builder()
                .addData("msg","HI")
                .addData(dataMap)
                .build();

        // that
        assertThat(actual).isEqualTo(expected);
    }

    private void loadSkillResponseDataJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try(InputStream fileStream = new FileInputStream(SKILL_RESPONSE_DATA_TEST_FILE_PATH)) {
            skillData = objectMapper.readValue(fileStream, SkillResponse.class);
        }
    }

}

package dev.mini.kakaoiopenbuilder.skill.util;

public enum SystemEntity {
    DATE("sys_date"),
    DATE_PERIOD("sys_date_period"),
    DATE_LUNAR("sys_date_lunar"),
    DATE_PERIOD_LUNAR("sys_date_period_lunar"),
    TIME("sys_time"),
    TIME_PERIOD("sys_time_period"),
    DATE_TIME("sys_date_time"),
    DATE_TIME_PERIOD("sys_date_time_period"),
    NUMBER("sys_number"),
    NUMBER_TIMES("sys_number_times"),
    NUMBER_PERCENT("sys_number_percent"),
    NUMBER_ORDINAL("sys_number_ordinal"),
    NUMBER_AGE("sys_number_age"),
    NUMBER_BIRTHYEAR("sys_number_birthyear"),
    NUMBER_DECADE("sys_number_decade"),
    NUMBER_ALBUM("sys_number_album"),
    NUMBER_RANK("sys_number_rank"),
    UNIT_DURATION("sys_unit_duration"),
    UNIT_LENGTH("sys_unit_length"),
    UNIT_AREA("sys_unit_area"),
    UNIT_WEIGHT("sys_unit_weight"),
    UNIT_VOLUME("sys_unit_volume"),
    UNIT_PRESSURE("sys_unit_pressure"),
    UNIT_TEMPERATURE("sys_unit_temperature"),
    UNIT_SPEED("sys_unit_speed"),
    UNIT_DATA("sys_unit_data"),
    UNIT_ENERGY("sys_unit_energy"),
    UNIT_CURRENCY("sys_unit_currency"),
    TEXT("sys_text"),
    LOCATION("sys_location"),
    NATION("sys_nation"),
    TATE("sys_state"),
    CITY("sys_city"),
    FORTUNE_STARSIGN("sys_fortune_starsign"),
    FORTUNE_ZODIAC("sys_fortune_zodiac"),
    PERSON_NAME("sys_person_name"),
    PERSON_GROUP("sys_person_group"),
    CURRENCYNAME("sys_currencyname"),
    CURRENCY_CODE("sys_currency_code"),
    PORTS_NAME("sys_sports_name"),
    PORTS_LEAGUE("sys_sports_league"),
    PORTS_TEAM("sys_sports_team"),
    PORTS_STADIUM("sys_sports_stadium"),
    TV_NAME("sys_tv_name"),
    TV_CHANNELNAME("sys_tv_channelname"),
    RADIO_NAME("sys_radio_name"),
    RADIO_CHANNELNAME("sys_radio_channelname"),
    MOVIE_NAME("sys_movie_name"),
    ORGANIZATION_NAME("sys_organization_name"),
    THEATER_NAME("sys_theater_name"),
    BROADCAST_NAME("sys_broadcast_name"),
    URL("sys_url"),
    BUSSINESS_NUMBER("sys_bussiness_number"),
    PHONE_NUMBER("sys_phone_number"),
    LICENSEPLATE_NUMBER("sys_licenseplate_number");

    private final String parameter;

    SystemEntity(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

}

package com.acuweather.liveforecast.configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ClientConfigPropertiesTest {

    @Autowired
    private ClientConfigProperties configProperties;

    @Test
    void configPropertiesSearch(){
        String url= configProperties.getOpenWeatherUrl();
        assertAll(
                ()-> assertEquals("api.openweathermap.org/data/2.5/weather",url,"url Api ")
        );
    }
}

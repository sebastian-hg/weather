package com.acuweather.liveforecast.configuration;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConstructorBinding
@ConfigurationProperties(prefix = "client")
public class ClientConfigProperties {
    private String openWeatherUrl;

}

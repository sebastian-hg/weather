package com.acuweather.liveforecast.client.impl;

import com.acuweather.liveforecast.client.OpenWeatherApiClient;
import com.acuweather.liveforecast.configuration.ClientConfigProperties;
import com.acuweather.liveforecast.exception.ErrorInCallToApiException;
import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class OpenWeatherApiClientImpl implements OpenWeatherApiClient {
    private static final String APP_ID = "&appid=8f472c70733460dde96a4490ebc9aa01";

    @Override
    public Mono<WeatherAllResponseDto> execute(String city) {
        var params = city + APP_ID;
        return WebClient.create()
                .get()
                .uri("api.openweathermap.org/data/2.5/weather?q=" + params)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(WeatherAllResponseDto.class)
                .onErrorMap(e -> new ErrorInCallToApiException("Error during call in API" + e.getMessage()));
    }
}

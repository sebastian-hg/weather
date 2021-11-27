package com.acuweather.liveforecast.client;

import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import reactor.core.publisher.Mono;

public interface OpenWeatherApiClient {
    Mono<WeatherAllResponseDto> execute(String city);
}

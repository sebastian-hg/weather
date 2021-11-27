package com.acuweather.liveforecast.service;

import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import reactor.core.publisher.Mono;

public interface GetLiveForecastByCity {
    Mono<WeatherAllResponseDto> execute(String city);
}

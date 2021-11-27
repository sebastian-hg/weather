package com.acuweather.liveforecast.service.impl;

import com.acuweather.liveforecast.client.OpenWeatherApiClient;
import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import com.acuweather.liveforecast.service.GetLiveForecastByCity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
@Builder
public class GetLiveForecastByCityImpl implements GetLiveForecastByCity {
    private final OpenWeatherApiClient apiClient;

    @Override
    public Mono<WeatherAllResponseDto> execute(String city) {
        return apiClient.execute(city);
    }
}

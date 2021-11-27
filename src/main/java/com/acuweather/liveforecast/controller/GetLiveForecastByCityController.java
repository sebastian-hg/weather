package com.acuweather.liveforecast.controller;

import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import com.acuweather.liveforecast.service.GetLiveForecastByCity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/live-forecast/by-city")
public class GetLiveForecastByCityController {
    private final GetLiveForecastByCity getLiveForecastByCity;

    @GetMapping
    public Mono<WeatherAllResponseDto> viewAverageBitcoin(@RequestParam("city") String city) {
        return getLiveForecastByCity.execute(city);
    }
}
package com.acuweather.liveforecast.repository;

import com.acuweather.liveforecast.model.City;
import reactor.core.publisher.Mono;

public interface CityRepository {
    Mono<City> findById(Integer id);
}

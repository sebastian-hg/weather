package com.acuweather.liveforecast.handler;

import com.acuweather.liveforecast.helper.ResponseHelper;
import com.acuweather.liveforecast.model.dto.WeatherAllResponseDto;
import com.acuweather.liveforecast.service.GetLiveForecastByCity;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Log4j2
@Component
public class GetLiveForecastByCityHandler extends Handler<Object, Validator> {
    private final GetLiveForecastByCity getLiveForecastByCity;

    public GetLiveForecastByCityHandler(@NonNull ResponseHelper responseHelper,
//                                        @Autowired @Qualifier("defaultValidator") Validator validator,
                                        GetLiveForecastByCity getLiveForecastByCity) {
        super(responseHelper);
//        super(responseHelper, String.class, validator);
        this.getLiveForecastByCity = getLiveForecastByCity;
    }

    @Override
    protected Mono<ServerResponse> execute(Mono<Object> noBody, ServerRequest serverRequest) {
        var city = serverRequest.queryParam("city").get();
        log.info("Receiving request {}", city);
        return getLiveForecastByCity.execute(city)
                .flatMap(weatherAllResponseDto -> responseHelper.buildOK(Mono.just(weatherAllResponseDto)));
    }
}

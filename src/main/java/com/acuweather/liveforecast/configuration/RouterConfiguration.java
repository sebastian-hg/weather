package com.acuweather.liveforecast.configuration;

import com.acuweather.liveforecast.handler.GetLiveForecastByCityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> routeRequest(
            GetLiveForecastByCityHandler getLiveForecastByCityHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/live-forecast/by-city-new"),
                        getLiveForecastByCityHandler::executeWithoutBodyValidation)
 //               .andRoute(RequestPredicates.POST("/api/v1/notify/signature-link"), notifySignatureLinkHandler::executeWithBodyValidation)
                 ;
    }

}
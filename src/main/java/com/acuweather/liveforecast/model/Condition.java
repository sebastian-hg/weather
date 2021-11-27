package com.acuweather.liveforecast.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


import javax.persistence.Table;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "CONDITION")
public class Condition {

    @Id
    private Long id;
    private Double temperature;
    private Double wind;
    private Double humidity;
    // private City city;
    private LocalDateTime time;


}

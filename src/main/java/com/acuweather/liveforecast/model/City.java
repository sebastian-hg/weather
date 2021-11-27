package com.acuweather.liveforecast.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Table("CITY")
public class City {

    @Id
    private Long id;
    private String name;
    //  private Country country;
}

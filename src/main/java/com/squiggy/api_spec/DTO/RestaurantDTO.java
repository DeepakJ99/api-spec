package com.squiggy.api_spec.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor(force = true)
public class RestaurantDTO {
    String id;
    String name;
    String address;
    Double rating;
    Coords coords;
    Boolean active;
}

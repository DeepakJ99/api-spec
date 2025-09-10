package com.squiggy.api_spec.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Coords {
    String id;
    Double x;
    Double y;
    String restaurantId;
}

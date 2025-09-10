package com.squiggy.api_spec.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor(force = true)
public class PlacedOrderDTO {
    String id;
    String restaurantId;
    Map<String, Integer> menuItemIds;
}


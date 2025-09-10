package com.squiggy.api_spec.DTO.event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import java.time.Instant;
@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class RestaurantStatusUpdateEvent {
    String restaurantId;
    Instant timestamp = Instant.now();
    Boolean isActive;
    String eventType = "RestaurantStatusUpdateEvent";
}


package com.squiggy.api_spec.DTO.event;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import java.time.Instant;
@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class MenuItemStatusUpdateEvent {
    String eventType = "MenuItemStatusUpdateEvent";
    String restaurantId;
    String menuItemId;
    boolean outOfStock;
    Instant timestamp = Instant.now();
}

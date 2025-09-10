package com.squiggy.api_spec.DTO.event;

import com.squiggy.api_spec.DTO.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Map;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class OrderInitiationEvent {
    String userId;
    String orderId;
    OrderStatus orderStatus = OrderStatus.INITIATED;
    String restaurantId;
    Map<String, Integer> menuItems;
}

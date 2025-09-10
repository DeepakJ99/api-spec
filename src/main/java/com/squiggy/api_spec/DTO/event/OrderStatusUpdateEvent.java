package com.squiggy.api_spec.DTO.event;

import com.squiggy.api_spec.DTO.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class OrderStatusUpdateEvent {
    String orderId;
    OrderStatus orderStatus;
}

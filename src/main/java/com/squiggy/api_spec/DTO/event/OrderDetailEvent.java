package com.squiggy.api_spec.DTO.event;


import com.squiggy.api_spec.DTO.OrderedMenuItemDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import java.time.Instant;
import java.util.List;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class OrderDetailEvent {
    String orderId;
    String orderStatus;
    Instant timestamp = Instant.now();
    List<OrderedMenuItemDTO> menuItems;
}

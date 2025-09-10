package com.squiggy.api_spec.DTO;

import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true)
public class OrderedMenuItemDTO {
    String itemId;
    Integer quantity;
}

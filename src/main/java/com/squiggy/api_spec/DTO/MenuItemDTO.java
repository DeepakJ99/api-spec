package com.squiggy.api_spec.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuItemDTO {
    String id;
    String name;
    String description;
    Double price;
    Double rating;
    Boolean outOfStock;
}

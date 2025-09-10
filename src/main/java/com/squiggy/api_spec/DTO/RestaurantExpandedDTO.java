package com.squiggy.api_spec.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor(force = true)
public class RestaurantExpandedDTO {
    RestaurantDTO restaurant;
    List<MenuItemDTO> menuItems;
}

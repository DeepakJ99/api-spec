package com.squiggy.api_spec.DTO.event;

import com.squiggy.api_spec.DTO.DeliveryPartnerStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class DeliveryPartnerEvent {
    private String id;
    private DeliveryPartnerStatus status;
}

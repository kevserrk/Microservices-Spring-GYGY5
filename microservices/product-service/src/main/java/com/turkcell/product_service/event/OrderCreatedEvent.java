package com.turkcell.product_service.event;

import java.util.UUID;

public record OrderCreatedEvent(
        UUID eventId,
        UUID orderId,
        UUID productId,
        Integer quantity
) {
}

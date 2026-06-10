package com.turkcell.product_service.processed_event;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class ProcessedEvent {

    @Id
    private UUID eventId;

    public ProcessedEvent() {
    }

    public ProcessedEvent(UUID eventId) {
        this.eventId = eventId;
    }

    public UUID getEventId() {
        return eventId;
    }
}

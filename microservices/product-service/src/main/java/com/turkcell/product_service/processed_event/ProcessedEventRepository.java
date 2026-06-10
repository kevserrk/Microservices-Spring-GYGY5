package com.turkcell.product_service.processed_event;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedEventRepository
        extends JpaRepository<ProcessedEvent, UUID> {
}

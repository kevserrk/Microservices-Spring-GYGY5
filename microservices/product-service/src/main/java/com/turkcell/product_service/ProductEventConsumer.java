package com.turkcell.product_service.consumer;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.turkcell.product_service.event.TestEvent;

@Configuration
public class ProductEventConsumer {

    @Bean
    public Consumer<TestEvent> testEvent() {
        return event -> {
            System.out.println("EVENT GELDİ");
            System.out.println(event.message());
            System.out.println(event.productId());
        };
    }
}

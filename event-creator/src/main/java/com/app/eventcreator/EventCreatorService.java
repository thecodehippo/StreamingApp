package com.app.eventcreator;

import com.app.domain.PaymentEvent;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventCreatorService {

    private final WebClient webClient;
    private final RestTemplate restTemplate;

    public void create() {
        PaymentEvent paymentEvent = new PaymentEvent(UUID.randomUUID(),"test");
        restTemplate.exchange(new RequestEntity<>(paymentEvent, HttpMethod.POST, URI.create("http://localhost:8080/api/v1/event-handler")), String.class);
        //restTemplate.postForObject("http://localhost:8080/api/v1/event-handler",paymentEvent, String.class);
    }


}

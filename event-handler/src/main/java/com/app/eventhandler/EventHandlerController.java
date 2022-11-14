package com.app.eventhandler;

import com.app.domain.PaymentEvent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/event-handler")
@AllArgsConstructor
public class EventHandlerController {

    @PostMapping
    public String receiveEvent(@RequestBody PaymentEvent paymentEvent) {
        System.out.println(paymentEvent);
        return "OK";
    }


}

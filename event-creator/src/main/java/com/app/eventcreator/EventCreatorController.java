package com.app.eventcreator;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/event-creator")
@AllArgsConstructor
public class EventCreatorController {

    private final EventCreatorService eventCreatorService;

    @GetMapping
    public void triggerCreateEvent() {
        System.out.println("event triggered");
        eventCreatorService.create();
    }

}

package com.app.domain;

import java.util.UUID;

public record PaymentEvent(UUID id, String eventDesc) {

}
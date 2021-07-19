package com.ldt.springvalidation.application.response;

import java.util.UUID;

public class CreateOrderResponse {
    private UUID uuid;

    public CreateOrderResponse(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "CreateOrderResponse{" +
                "uuid=" + uuid +
                '}';
    }
}

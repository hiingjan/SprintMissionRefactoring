package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message {
    private UUID id;
    private Long createdAt;
    private Long updatedAt;

    public Message(UUID id, Long createdAt) {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
    }
}

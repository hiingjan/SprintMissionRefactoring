package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel {
    private UUID id;
    private Long createdAt;
    private Long updatedAt;

    public Channel(UUID id, Long createdAt) {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
    }
}

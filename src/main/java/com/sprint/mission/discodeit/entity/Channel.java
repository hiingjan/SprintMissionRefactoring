package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel {
    private UUID id;
    private Long createdAt;
    private Long updatedAt;
    private String channelName;
    private String channelDescription;

    public Channel(String channelName, String channelDescription) {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.channelName = channelName;
        this.channelDescription = channelDescription;
    }
    
    public UUID getId() {
        return id;
    }
    
    public Long getCreatedAt() {
        return createdAt;
    }
    
    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public String getChannelName() {
        return channelName;
    }
    
    public String getChannelDescription() {
        return channelDescription;
    }
    
    public void updateChannelName(String channelName) {
        this.channelName = channelName;
        this.updatedAt = System.currentTimeMillis();
    }
    
    public void updateChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
        this.updatedAt = System.currentTimeMillis();
    }
    
    
    

  
}

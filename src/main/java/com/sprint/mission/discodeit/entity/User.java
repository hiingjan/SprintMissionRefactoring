package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class User {
    private UUID id;
    private Long createdAt;
    private Long updatedAt;
    private String userName;
    private String userEmail;

    public User(String userName, String userEmail) {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.userName = userName;
        this.userEmail = userEmail;
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

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void updateUserName(String userName) {
        this.userName = userName;
        this.updatedAt = System.currentTimeMillis();
    }

    public void updateUserEmail(String userEmail) {
        this.userEmail = userEmail;
        this.updatedAt = System.currentTimeMillis();
    }


}

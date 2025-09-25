package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.User;

import java.util.UUID;

public interface UserService {
    void saveUser(User user);
    void readUser(UUID id);
    void readAllUsers();
    void updateUser(User user, String userName, String userEmail);
    void deleteUser(UUID id);
}

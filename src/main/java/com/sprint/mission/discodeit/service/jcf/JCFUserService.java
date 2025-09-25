package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JCFUserService implements UserService {

    private final Map<UUID, User> data = new HashMap<>();


    @Override
    public void saveUser(User user) {
        data.put(user.getId(), user);
    }

    @Override
    public void readUser(UUID id) {
        if (data.containsKey(id)) {
            System.out.println(data.get(id));
        } else{
            System.out.println("User is not found");
        }

    }

    @Override
    public void readAllUsers() {
        if (data.isEmpty()) {
            System.out.println("No users found");
        } else {
            for (Map.Entry<UUID, User> entry : data.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    @Override
    public void updateUser(User user, String userName, String userEmail) {

            // 1. userName이 유효한 값인지 확인하고 업데이트합니다.
        if (userName != null && !userName.isBlank()) {
                user.updateUserName(userName);
                System.out.println("Username updated.");
            }

            // 2. userEmail이 유효한 값인지 확인하고 업데이트합니다.
        if (userEmail != null && !userEmail.isBlank()) {
                user.updateUserEmail(userEmail);
                System.out.println("User email updated.");
            }
    }

    @Override
    public void deleteUser(UUID id) {
        if (data.containsKey(id)) {
           data.remove(id);
        } else{
            System.out.println("User is not found");
        }
    }
}

package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;
import com.sprint.mission.discodeit.service.jcf.JCFUserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new JCFUserService();

        User user = new User("user1","user1@example.com");
        userService.saveUser(user);
        userService.readAllUsers();
        userService.updateUser(user, "user2","");
        userService.readAllUsers();


    }
}

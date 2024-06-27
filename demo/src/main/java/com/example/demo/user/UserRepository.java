package com.example.demo.user;

public interface UserRepository {
    void save(User user);

    User findUser(Long userId);
}

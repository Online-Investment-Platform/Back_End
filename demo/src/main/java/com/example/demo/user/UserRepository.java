package com.example.demo.user;

public interface UserRepository {
    void save(User user);

    User findByUser(Long userId);
}

package com.example.demo.user;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository {

    private static final Map<Long, User> store = new HashMap<Long, User>();

    @Override
    public void save(final User user) {
        store.put(user.getUserId(), user);
    }

    @Override
    public User findByUser(final Long userId) {
        return store.get(userId);
    }
}

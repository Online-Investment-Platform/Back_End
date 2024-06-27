package com.example.demo.user;

public class User {

    private final Long userId;
    private final String userName;
    private final Long email;
    private final Long password;
    private final Long joinDate;

    public User(final Long userId, final String userName, final Long email, final Long password, final Long joinDate) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Long getEmail() {
        return email;
    }

    public Long getPassword() {
        return password;
    }

    public Long getJoinDate() {
        return joinDate;
    }
}

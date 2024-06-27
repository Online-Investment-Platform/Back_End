package com.example.demo.user;

public class User {

    private final Long userId;
    private final String userName;
    private final Long userEmail;
    private final Long userPassword;
    private final Long userJoinDate;

    public User(final Long userId, final String userName, final Long userEmail, final Long userPassword, final Long userJoinDate) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userJoinDate = userJoinDate;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Long getuserEmail() {
        return userEmail;
    }

    public Long getuserPassword() {
        return userPassword;
    }

    public Long getuserJoinDate() {
        return userJoinDate;
    }
}

package com.login.repository;

public interface PersonalRepository {
    void addPersonal(String name, String login, String password);
    String searchPersonal(String login, String password);
}

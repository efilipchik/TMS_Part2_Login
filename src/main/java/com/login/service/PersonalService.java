package com.login.service;

public interface PersonalService {
    void addPersonal(String name, String login, String password);
    String searchPersonal(String login, String password);
}

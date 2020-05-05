package com.login.service;

import com.login.repository.PersonalRepository;
import com.login.repository.PersonalRepositoryImpl;

public class PersonalServiceImpl implements PersonalService {
    PersonalRepository personalRepository = new PersonalRepositoryImpl();

    @Override
    public void addPersonal(String name, String login, String password) {
        personalRepository.addPersonal(name, login, password);
    }

    @Override
    public String searchPersonal(String login, String password) {
        return personalRepository.searchPersonal(login, password);

    }
}

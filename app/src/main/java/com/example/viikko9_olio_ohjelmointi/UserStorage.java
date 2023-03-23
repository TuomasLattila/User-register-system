package com.example.viikko9_olio_ohjelmointi;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;

    private UserStorage()   {
    }

    public static UserStorage getInstance() {
        if (userStorage == null)    {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers()   {
        return users;
    }

    public void addUser(User newUser)  {
        users.add(newUser);
    }
}

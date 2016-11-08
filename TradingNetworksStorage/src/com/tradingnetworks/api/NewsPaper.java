package com.tradingnetworks.api;

import com.tradingnetworks.dataobjects.User;

import java.util.ArrayList;

/**
 * Created by catavlas on 11/8/2016.
 */
public interface NewsPaper {
    String name = null;
    ArrayList<User> activeUsers = null;

    String getName();
    void setName();
    String getUsers();
    void addUser(User user);
    void deleteUser(User user);
    void update();

}

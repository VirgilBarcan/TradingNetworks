package com.tradingnetworks.dataobjects;

import com.tradingnetworks.api.NewsPaper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by catavlas on 11/8/2016.
 */
public class MyFriendsBettingsNewsPaper implements NewsPaper {
    private Map<String, ArrayList<String>> userFriendMap = new HashMap<>();

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName() {

    }

    @Override
    public String getUsers() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void update() {

    }

    public Map<String, ArrayList<String>> getUserFriendMap() {
        return userFriendMap;
    }

    public void setUserFriendMap(Map<String, ArrayList<String>> userFriendMap) {
        this.userFriendMap = userFriendMap;
    }
}

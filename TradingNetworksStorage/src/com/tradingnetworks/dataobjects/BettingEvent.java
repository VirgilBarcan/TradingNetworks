package com.tradingnetworks.dataobjects;

import java.util.ArrayList;

/**
 * Created by catavlas on 11/8/2016.
 */
public class BettingEvent {

    private String name;
    private ArrayList<Game> games;
    private ArrayList<User> registeredUsers;

    public BettingEvent(String name){
        this.name = name;
        games = new ArrayList<Game>();
        registeredUsers = new ArrayList<User>();
    }

    public void registerBet(User user, String gameId, String otionId, String value){

    }

    public void regsterObserver(User user){
        registeredUsers.add(user);
    }

    public void deleteObserver(User user) {


    }

    public void update(String updateMessage) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(ArrayList<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
}

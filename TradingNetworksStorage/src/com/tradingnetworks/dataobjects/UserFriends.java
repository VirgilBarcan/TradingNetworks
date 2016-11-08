package com.tradingnetworks.dataobjects;

import java.util.*;

/**
 * This class is a wrapper over the User class, adding the list of friends to the User.
 * It provides methods for adding a new friend or for removing one, as well as getting the list of friends.
 *
 * IMPORTANT NOTE: The setter for the user attribute was not added to force the client to use the constructor
 * and provide an User reference. It would not make sense to have a UserFriends object that doesn't have an User.
 * It is true that the constructor can be called with a null reference, but let's assume this is less probable
 * than forgetting to call a setter :).
 * Created by virgil on 08.11.2016.
 */
public class UserFriends {

    private User user;
    private Map<User, Date> friends;

    public UserFriends(User user) {
        this.user = user;
        this.friends = new HashMap<>();
    }

    public User getUser() {
        return user;
    }

    public void addFriend(User friend, Date since) {
        friends.put(friend, since);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    public List<User> getFriendsList() {
        return new ArrayList<>(friends.keySet());
    }

    public Map<User, Date> getFriends() {
        return friends;
    }
}

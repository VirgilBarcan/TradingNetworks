package com.tradingnetworks.api;

import com.tradingnetworks.dataobjects.User;

/**
 * Created by <a href="mailto:aurelian.hreapca@info.uaic.ro">FIIAurelian<a/>
 * on Nov 7, 2016.
 */
public interface UserStorage {

	/**
	 * Query for a user based on id
	 * @param userId - identifier of User
	 * @return User with specified id
	 */
	User getUserById(int userId);
	
	/**
	 * Query for a user based on username
	 * @param username - username of User
	 * @return User with specified username
	 */
	User getUserByUsername(String username);
	
}

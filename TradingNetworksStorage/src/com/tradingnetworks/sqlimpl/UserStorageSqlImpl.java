package com.tradingnetworks.sqlimpl;

import com.tradingnetworks.api.UserStorage;
import com.tradingnetworks.dataobjects.User;

/**
 * Created by <a href="mailto:aurelian.hreapca@info.uaic.ro">FIIAurelian<a/>
 * on Nov 7, 2016.
 */
public class UserStorageSqlImpl implements UserStorage{

	private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id = :id";
	private static final String GET_USER_BY_USERNAME = "SELECT * FROM users" +
													   "WHERE username = :username";
	
	public User getUserById(int userId) {
		//TODO Add code, maybe after set up database
		return null;
	}

	public User getUserByUsername(String username) {
		// TODO Add code, maybe after set up database 
		return null;
	}

}

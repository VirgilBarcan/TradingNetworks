package com.tradingnetworks.sqlimpl.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tradingnetworks.dataobjects.User;

/**
 * Created by <a href="mailto:aurelian.hreapca@info.uaic.ro">FIIAurelian<a/>
 * on Nov 7, 2016.
 * If Spring is used, maybe we can extend from RowMapper<User>
 */
public class UserMapper {

	private static final String ID = "id";
	private static final String USERNAME = "username";
	private static final String FIRST_NAME = "first_name";
	private static final String LAST_NAME = "last_name";
	private static final String BALANCE = "balance";
	
	public User mapRow(ResultSet rs, int rownum) throws SQLException {
		User user = new User.Builder()
			.withId(rs.getInt(ID))
			.withUsername(rs.getString(USERNAME))
			.withFirstName(rs.getString(FIRST_NAME))
			.withLastName(rs.getString(LAST_NAME))
			.withBalance(rs.getDouble(BALANCE))
			.build();
		return user;
	}
}

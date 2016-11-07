package com.tradingnetworks.sqlimpl;

import com.tradingnetworks.api.TradingNetworksStorage;
import com.tradingnetworks.api.UserStorage;

/**
 * Created by <a href="mailto:aurelian.hreapca@info.uaic.ro">FIIAurelian<a/>
 * on Nov 7, 2016.
 */
public class TradingNetworksStorageSqlImpl implements TradingNetworksStorage {

	public UserStorage getUserStorage() {
		return new UserStorageSqlImpl();
	}

	
	
}

package com.shopNest1.customer1;

import com.shopNest1.dbHandler.DataFetcher;

public class Validator {

	public static boolean isValid(String uname, String pass) {
		String dbPass = DataFetcher.fetchPassword(uname);
		if(pass.equals(dbPass)) {
			return true;
		}
		else {
			return false;
		}
	}

}

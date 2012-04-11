package com.rartavia.xmlbeansgradle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.rartavia.xmlbeansgradle.xml.xmlSchema.UserType;

public class UserTest {

	@Test
	public void testUserModel() {
		UserType user = UserType.Factory.newInstance();
		user.setName("Test name");

		assertNotNull(user);
		assertNotNull(user.getName());
	}
}

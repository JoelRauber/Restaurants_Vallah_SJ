/**
 * 
 */
package ch.bbcag.ch.controller;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author zswobs
 *
 */
public class UserControllerTest {
	
	private UserController uC;
	
	@Before
	public void setUp() {
		uC = UserController.getUserController();
	}

	/**
	 * Test method for {@link ch.bbcag.ch.controller.UserController#getUserController()}.
	 */
	@Test
	public void testUserControllerSingleton() {
		assertEquals(UserController.getUserController(), uC);
	}

	/**
	 * Test method for {@link ch.bbcag.ch.controller.UserController#verifyLogin(java.lang.String, java.lang.String)}.
	 */
//	@Test
//	public void testVerifyLogin() {
//		fail("Not yet implemented");
//	}

}

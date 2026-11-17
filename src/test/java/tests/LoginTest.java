package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {
	
	@Test(groups = {"smoke"})
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user", "secret_sauce");
		//loginPage.login("standard_user1", "secret_sauce1");
		//loginPage.login("standard_user2", "secret_sauce2");
		
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.logout();
	}

}

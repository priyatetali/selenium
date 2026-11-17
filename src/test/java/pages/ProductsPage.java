package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement menuButton;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement logoutButton;

	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// Constructor
	}
	
	public void logout() {
		menuButton.click();
		//Thread.sleep(3000);
		logoutButton.click();
		
		driver.quit();
	}
}

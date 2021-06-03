package stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page()  {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
 driver = new ChromeDriver();
driver.get("https://gmail.com");

	    
	}

	@When("^Title of login page is Gmail$")
	public void title_of_login_page_is_Gmail() {
		System.out.println(driver.getTitle());
	}

	@Then("^user enter user name$")
	public void user_enter_user_name() {
		driver.findElement(By.id("identifierId")).sendKeys("unnathishekaregowda@gmail.com");
	
	}
	
	@Then("^click on next button$")
	public void click_on_next_button() {
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

	@Then("^user enters password$")
	public void user_enters_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Unnathi@02");
	}

	@Then("^user clicks on Login$")
	public void user_clicks_on_Login() {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

	
}

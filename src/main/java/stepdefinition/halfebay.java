package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class halfebay {
WebDriver driver;

@When("^User is on ebay registration page$")
public void user_is_on_ebay_registration_page() throws InterruptedException {
	String key = "webdriver.chrome.driver";
	String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
driver = new ChromeDriver();
	driver.get("https://reg.ebay.in/reg/PartialReg");
	Thread.sleep(5000);
}

@Then("^Enter first name$")
public void enter_first_name() {
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nithya");
	
}

@When("^enter Last name$")
public void enter_Last_name() {
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("shekar");
}

@Then("^Enter emailid$")
public void enter_emailid() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("unnathishekaregowda@gmail.com");
}

@And("^Enter Password$")
public void enter_Password() {
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Unnathi@02");
}

@Then("^Click on register$")
public void click_on_register() {
	driver.findElement(By.xpath("//input[@id='ppaFormSbtBtn']")).click();
}
}


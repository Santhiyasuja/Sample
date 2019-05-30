package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^My Flipkart app is open$")
	public void my_amazon_app_is_open() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "src\\test\\java\\drivers\\chromedriver.exe");					
    driver= new ChromeDriver();

    driver.manage().window().maximize();			
    driver.get("https://www.flipkart.com");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				

    }

	@Then("^I enter userid$")
	public void i_enter_userid() throws Throwable {
	driver.findElement(By.xpath("//input[@class=\"_2zrpKA\"]")).sendKeys("9941426105");
	
}
	@Then("^I enter password$")
	public void i_enter_password() throws Throwable {
	driver.findElement(By.xpath("//input[@class=\"_2zrpKA _3v41xv\"]")).sendKeys("sandy123");
}

	@Then("^I Click Signin$")
	public void i_Click_Signin() throws Throwable {
	
	driver.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
}
	
	}




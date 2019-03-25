package Stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Findvehicle {
	WebDriver driver;
	@Given("^user opens the Browser$")
	public void user_opens_the_Browser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
	}
	@When("^user enters URL$")
	public void user_enters_URL() throws Throwable {
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
		
	   }
	@Then("^User enters vehicle Registration number$")
	public void user_enters_vehicle_Registration_number() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='vehicleReg']")).sendKeys("OV12UYY");
	}
	@Then("^user clicks Find Vehicle$")
	public void user_clicks_Find_Vehicle() throws Throwable {
	 driver.findElement(By.xpath("//button[@name='btnfind']")).click();
    Thread.sleep(3000);
	    
	}
	@Then("^user should see the result$")
	public void user_should_see_the_result() throws Throwable {
	String Result=	driver.findElement(By.xpath("//div[contains(text(),'Result for : OV12UYY')]")).getText();

		Assert.assertEquals(Result,"Result for : OV12UYY");

		System.out.println("Vehicle Registered ");
		driver.close();

		
	    
	}





	
	
	
}

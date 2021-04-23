package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("^I open url in chrome browser$")
	public void i_open_url_in_chrome_browser() throws Throwable {
	   System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
	   driver = new FirefoxDriver();
	   driver.get("http://orangehrm.qedgetech.com/");
	   driver.manage().window().maximize();
	}

	@When("^I enter admin in usernamefield$")
	public void i_enter_admin_in_usernamefield() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}

	@When("^I enter admin in passwordfield$")
	public void i_enter_admin_in_passwordfield() throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^I verify Url$")
	public void i_verify_Url() throws Throwable {
	    String expected="dashboard";
	    String actual=driver.getCurrentUrl();
	    if(actual.contains(expected))
	    {
	    	System.out.println("Login success");
	    }
	    else
	    {
	    	System.out.println("Login Fail");
	    }
	    //driver.close();
	}

}

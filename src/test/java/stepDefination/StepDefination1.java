package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
WebDriver driver;
String url="http://orangehrm.qedgetech.com/";

@Given("^User Open url in \"([^\"]*)\"$")
public void user_Open_url_in(String brw) throws Throwable {
    if(brw.equalsIgnoreCase("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
    }
    else if(brw.equalsIgnoreCase("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.get(url);
    }
    else
    {
    	System.out.println("Browser value is not matching");
    }
}

@When("^user Enter \"([^\"]*)\" in username textbox$")
public void user_Enter_in_username_textbox(String username) throws Throwable {
	driver.findElement(By.name("txtUsername")).sendKeys(username);
}

@When("^user Enter \"([^\"]*)\" in password textbox$")
public void user_Enter_in_password_textbox(String password) throws Throwable {
	driver.findElement(By.name("txtPassword")).sendKeys(password);
}

@When("^User clcik on login button$")
public void user_clcik_on_login_button() throws Throwable {
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
}

@Then("^User validates url$")
public void user_validates_url() throws Throwable {
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
}

@Then("^User close browser$")
public void user_close_browser() throws Throwable {
    driver.close();
}


}

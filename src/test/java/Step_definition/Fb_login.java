package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_login {
	WebDriver driver;
	@Given("the user is on the Facebook login page")
	public void the_user_is_on_the_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony Saji\\Downloads\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//create a new instance of the ChromeDriver
	   driver = new ChromeDriver();
	   driver.navigate().to("https://www.facebook.com");
	}

	@When("the user enters their valid username")
	public void the_user_enters_their_valid_username() {
		WebElement username=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("sonysaji360@gmail.coms");
	}

	@When("the user enters their valid password")
	public void the_user_enters_their_valid_password() {
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("1234");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		
	}

	@Then("the user should be logged into their Facebook account")
	public void the_user_should_be_logged_into_their_facebook_account() {
	}




}

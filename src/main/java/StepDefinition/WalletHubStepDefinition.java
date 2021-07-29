package StepDefinition;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WalletHubStepDefinition 
{
	WebDriver driver;

	@Given("^User is already on login page$")
	public void User_is_already_on_login_page() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		//To disable browser notification
		options.addArguments("--disable-notifications");
		
		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome/chrome.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Google\\Chrome\\Application\\chrome driver\\chromedriver.exe");
		
		driver = new ChromeDriver(options);// driver looks for chrome through options opject

		driver.get("https://www.facebook.com/");// chrome driver instance
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("^title of the page is Facebook$")
	public void Title_of_the_page_is_Facebook() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(
				"Facebook - लॉग इन या साइन अप करें",
				title);

	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_username_and_password(String username, String password) 
	{
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void User_Clicks_on_Login_button() 
	{
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^user is on Home page$")
	public void User_is_on_home_page() 
	{
		String title2 = driver.getTitle();
		System.out.println("Home page title:" + title2);
		Assert.assertEquals(
				"Facebook",
				title2);

	}
	
	@Then("^user clicks on add post text field$")
	public void User_clicks_on_add_post_text_field() 
	{
		driver.findElement(By.xpath("//span[contains(text(),'mind') and @class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		
	@Then("^user writes status as Hello World$")
	public void User_writes_status_as_Hello_World() 
	{
		driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hello World");
	}
	
	@Then("^user clicks on post button$")
	public void User_clicks_on_post_button() 
	{
		driver.findElement(By.xpath("//div[@class='k4urcfbm dati1w0a hv4rvrfc i1fnvgqd j83agx80 rq0escxv bp9cbjyn discj3wi']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']")).click();
		
	}	
}
		
	



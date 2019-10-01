package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DefineStep{
	WebDriver driver;
	@Given("TestmeApp is up")
	public void testmeapp_is_up() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\newchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("click on SignUp")
	public void click_on_SignUp() {
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("Enter username as {string}")
	public void enter_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter Firstname as {string}")
	public void enter_Firstname_as(String string) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("Enter Lastname as {string}")
	public void enter_Lastname_as(String string) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter password as {string}")
	public void enter_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("Confirm password as {string}")
	public void confirm_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("select the gender as {string}")
	public void select_the_gender_as(String string) {
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[6]/div[1]/div[1]/label[1]/span[1]")).click();
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the email as {string}")
	public void enter_the_email_as(String string) {
		driver.findElement(By.xpath(" //input[@id='emailAddress']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter mobile number as {string}")
	public void enter_mobile_number_as(String string) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Select DOB as {string}")
	public void select_DOB_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the address {string}")
	public void enter_the_address(String string) {
		driver.findElement(By.xpath(" //textarea[@id='address']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Select the security question as {string}")
	public void select_the_security_question_as(String string) {
		Actions act1=new Actions(driver);
		WebElement sq= driver.findElement(By.xpath("//select[@id='securityQuestion']"));
	act1.moveToElement(sq).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the appropriate answer as {string}")
	public void enter_the_appropriate_answer_as(String string) {
		driver.findElement(By.xpath("  //input[@id='answer']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("To SignUp to TestmeApp")
	public void to_SignUp_to_TestmeApp() {
	   
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Click on Register")
	public void click_on_Register() {
		driver.findElement(By.xpath("  //input[@name='Submit']")).click();
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("click on SignIn")
	public void click_on_SignIn() {
		driver.findElement(By.xpath(" //a[contains(text(),'SignIn')]")).click();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user credentials are {string} and {string}")
	public void user_credentials_are_and(String string, String string2) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("to login to testmeApp")
	public void to_login_to_testmeApp() {
		driver.findElement(By.xpath(" //input[@name='Login']")).click();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Successfully logins to testmeApp")
	public void successfully_logins_to_testmeApp() {
	    
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("SignIn with the credentials as {string} and {string}")
	public void signin_with_the_credentials_as_and(String string, String string2) {
		driver.findElement(By.xpath(" //a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		driver.findElement(By.xpath(" //input[@name='Login']")).click();
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("Search and select dor a product")
	public void search_and_select_dor_a_product() {
		Actions act =new Actions(driver);
		WebElement search=driver.findElement(By.id("myInput"));

		act.keyDown(search, Keys.SHIFT).sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").pause(3000).keyUp(Keys.SHIFT).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user tries to click on cart")
	public void user_tries_to_click_on_cart() {
		 driver.findElement(By.xpath("//form//input[@name='val']")).click();

		   try {
		              driver.findElement(By.partialLinkText("Cart"));
		       }
		   catch(Exception e)
		   {
		    System.out.println("There shall be atleast 1 item in cart");
}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("the user cannot proceed")
	public void the_user_cannot_proceed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
}

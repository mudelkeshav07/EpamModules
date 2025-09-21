package Task2Steps;

import Task2Pages.Sign;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
    static WebDriver driver;
    static Sign s;

    @Given("user should be on Signin Page")
    public void user_should_be_on_signin_page() {
         driver = new ChromeDriver();
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();
         s = new Sign(driver);
    }
    @When("user should enter name & email and hit the button")
    public void user_should_enter_name_email_and_hit_the_button() {
       s.Signin("Sam", "Sam7@gmail.com");
    }

    @When("Enter all the details")
    public void enter_all_the_details() {
        s.Registration(29, 9,2001);
    }
    @Then("Validate account created message")
    public void validate_account_created_message() {
        s.Validation();
    }


    @Given("user will be on logged in page")
    public void user_will_be_on_logged_in_page() {
        //NullException
        if (driver == null) {
            throw new RuntimeException("User is not logged in");
        }
        s = new Sign(driver);

    }
    @When("click on Logout Button")
    public void click_on_logout_button() {
        s.ClickLogout();
    }
    @Then("user should redirect to Loginpage")
    public void user_should_redirect_to_loginpage() {
        s.Page();
    }




}

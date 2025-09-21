package Task2Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign {

    WebDriver driver;
    public Sign(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text() = ' Signup / Login']")
    WebElement lnk_Signup;
    @FindBy(xpath = "//input[@data-qa = 'signup-name']")
    WebElement txt_name;
    @FindBy(xpath = "//input[@data-qa = 'signup-email']")
    WebElement txt_email;
    @FindBy(xpath = "//button[@data-qa = 'signup-button']")
    WebElement btn_Signup;
    @FindBy( id= "id_gender1")
    WebElement rd_gender;
    @FindBy(xpath = "//input[@data-qa = 'password']")
    WebElement txt_pass;
    @FindBy(xpath = "//select[@data-qa = 'days']")
    WebElement txt_days;
    @FindBy(xpath = "//select[@data-qa = 'months']")
    WebElement txt_month;
    @FindBy(xpath = "//select[@data-qa = 'years']")
    WebElement txt_year;
    @FindBy(xpath = "//input[@data-qa = 'first_name']")
    WebElement txt_fname;
    @FindBy(xpath = "//input[@data-qa = 'last_name']")
    WebElement txt_lname;
    @FindBy(xpath = "//input[@data-qa = 'address']")
    WebElement txt_add;
    @FindBy(id = "country")
    WebElement txt_country;
    @FindBy(xpath = "//input[@data-qa = 'state']")
    WebElement txt_state;
    @FindBy(xpath = "//input[@data-qa = 'city']")
    WebElement txt_city;
    @FindBy(xpath = "//input[@data-qa = 'zipcode']")
    WebElement txt_code;
    @FindBy(xpath = "//input[@data-qa = 'mobile_number']")
    WebElement txt_mobile;
    @FindBy(xpath = "//button[@data-qa = 'create-account']")
    WebElement btn_CreateAccount;
    @FindBy(xpath = "//a[text() = 'Continue']")
    WebElement btn_Cont;
    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    WebElement btn_Logout;

    public void Signin(String name, String email){
        lnk_Signup.click();
        txt_name.sendKeys(name);
        txt_email.sendKeys(email);
        btn_Signup.click();
    }

    public void Registration(int day, int month, int year){
        rd_gender.click();
        txt_pass.sendKeys("kesh123");
        txt_days.sendKeys(String.valueOf(day));
        txt_month.sendKeys(String.valueOf(month));
        txt_year.sendKeys(String.valueOf(year));
        txt_fname.sendKeys("Sam");
        txt_lname.sendKeys("Austin");
        txt_add.sendKeys("Type 2, 86/7 Rangehills");
        txt_country.sendKeys("India");
        txt_state.sendKeys("Maharashtra");
        txt_city.sendKeys("Pune");
        txt_code.sendKeys("411020");
        txt_mobile.sendKeys("7245687901");
        btn_CreateAccount.click();
    }
    public void Validation(){
        WebElement msg = driver.findElement(By.xpath("//h2[@data-qa = 'account-created']"));
        Assert.assertTrue( "Account Created!", msg.isDisplayed());
        btn_Cont.click();
    }

    public void ClickLogout(){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.elementToBeClickable(btn_Logout));
        btn_Logout.click();
    }
    public void Page(){
        String PageTitle = driver.getTitle();
        Assert.assertEquals("Redirected to LoginPage", "Automation Exercise - Signup / Login", PageTitle);
    }
}

package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    @Given("^user is on Login Page$")
    public void User_is_on_Login_Page(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Then("^user enters username in  username textfield$")
    public void user_enters_username_in_username_textfields(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @Then("^user enters password in password textfield$")
    public void user_enters_password_in_password_textfields(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @Then("^user click on the Login button$")
    public void user_clicks_on_the_Login_buttons(){driver.findElement(By.id("login-button")).click();
   }
    @Then("^user is on HomePage$")
    public void user_is_on_Home_Page(){
        Assert.assertEquals("Swag Labs",driver.getTitle());
    }
    @When("user enter {String} and {String}")
    public void User_enter_username_and_password(String uname, String pass){
        driver.findElement(By.id("user-name")).sendKeys("uname");
        driver.findElement(By.id("password")).sendKeys("pass");

    }
}

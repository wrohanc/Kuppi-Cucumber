package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by rohan on 2017-07-03.
 */
public class FacebookLogin {
    WebDriver webDriver;

    @Given("^Open browser window$")
    public void open_browser_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        /*webDriver = new FirefoxDriver();
        webDriver.manage().window().fullscreen();
        webDriver.get("http://www.website.com");*/
    }

    @When("^Invalid credentials provides$")
    public void invalid_credentials_provides() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       /* webDriver.findElement(By.id("username")).sendKeys("usnm");
        webDriver.findElement(By.id("pass")).sendKeys("pwd");*/
    }

    @When("^Invalid username \"([^\"]*)\" and password \"([^\"]*)\" provided$")
    public void invalid_username_and_password_provided(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Username : " + username + " and password : " + password);
    }

    @Then("^User not logged in$")
    public void user_not_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //webDriver.findElement(By.id("u_0_s")).click();
    }

    @When("^provide username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void provide_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^New function$")
    public void new_function() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}

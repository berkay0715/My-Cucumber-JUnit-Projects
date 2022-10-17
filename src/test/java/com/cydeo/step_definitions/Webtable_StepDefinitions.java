package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Webtable_StepDefinitions {
    WebTableLoginPage webTableLoginPage =new WebTableLoginPage();
    @Given("user is on the login page of the wer table app")
    public void user_is_on_the_login_page_of_the_wer_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);

    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();

    }
    @Then("user should see URL contains orders")
    public void user_should_see_url_contains_orders() {

      String currentULR =  Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(currentULR.contains("orders"));

        // or you can use verifyURLContains method from the BrowserUtils

        BrowserUtils.verifyURLContains("orders");
    }
    @When("user enters username {string} and password {string} and logins")
    public void user_enters_username_and_password_and_logins(String username, String password) {
        webTableLoginPage.inputUsername.sendKeys(username);
        webTableLoginPage.inputPassword.sendKeys(password);
        webTableLoginPage.loginButton.click();
    }
}

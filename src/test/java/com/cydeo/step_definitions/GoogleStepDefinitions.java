package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class GoogleStepDefinitions {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Then("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyWord) {

        googleSearchPage.AlertBox.click();
        googleSearchPage.searchBox.sendKeys(searchKeyWord + Keys.ENTER);


    }
    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyWord) {

    googleSearchPage.searchBox.sendKeys(searchKeyWord);


    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg actual
        Assert.assertEquals("Title is not as expected!",expectedTitle,actualTitle);

    }

    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg actual
        Assert.assertEquals("Title is not as expected!",expectedTitle,actualTitle);
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @Then("user should see the title is google")
    public void user_should_see_the_title_is_google() {

        String expectedTitle = "Google";
       String actualTitle =  Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }
}

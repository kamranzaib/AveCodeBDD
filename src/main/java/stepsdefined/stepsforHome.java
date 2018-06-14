package stepsdefined;

/**
 All tests based on bugs found during manual run
 on Home page when creating a new task
 *
 */

import Web.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.signUpPage;

public class stepsforHome {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    signUpPage signUp = PageFactory.initElements(driver, signUpPage.class);
    pages.HomePage home = PageFactory.initElements(driver, pages.HomePage.class);

    @Given("^user is on home page of avenuecode website$")
    public void userIsOnHomePageOfAvenuecodeWebsite() throws Throwable {
        driver.get("https://qa-test.avenuecode.com/");

        signUp.SignIn("mkzaib02@gmail.com", "Avenuecode123");
    }

    @When("^user clicks MyTask next page and reads the top title under navigation bar$")
    public void userClicksMyTaskNextPageAndReadsTheTopTitleUnderNavigationBar() throws Throwable {
        home.getInfo();
    }

    @Then("^title should read \"([^\"]*)\"$")
    public void titleShouldRead(String arg0) throws Throwable {
        home.GreenButton();
        home.enteringtask("mnopqrstuv");
        home.Buttons();

    }

}


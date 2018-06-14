package stepsdefined;

/*
 Normal signUp/in Test
 *
 */


import Web.BrowserFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.signUpPage;


public class SignUpSteps {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    signUpPage signup = PageFactory.initElements(driver, signUpPage.class);

    @Given("^User navigates to signup page$")
    public void user_navigates_to_signup_page() throws Throwable {

        driver.get("https://qa-test.avenuecode.com");

        signup.nav();

    }

    @When("^User enters username, email id and Password$")
    public void user_enters_username_email_id_and_Password() throws Throwable {

        //enter Sign Up steps
        signup.registeruser("", "", "", "");

        try {
            signup.errors();
        } catch (Exception e) {
            if (!(e instanceof NoSuchElementException)) {
                throw e;
            }


        }
    }



    @Then("^User should be able to sign up verified by welcome title$")
    public void userShouldBeAbleToSignUpVerifiedByWelcomeTitle() throws Throwable {

        signup.Signupverification();


    }
}
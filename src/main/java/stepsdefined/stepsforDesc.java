package stepsdefined;

/***
All tests based on bugs found during manual run in subTask Description
 *
 */

import Web.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class stepsforDesc {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    pages.CommonTasks common = PageFactory.initElements(driver, pages.CommonTasks.class);
    pages.subtasks  subTask = PageFactory.initElements(driver, pages.subtasks.class);

    @Given("^User is on pop up modal for sub task description$")
    public void userIsOnPopUpModalForSubTaskDescription() throws Throwable {


        driver.get("https://qa-test.avenuecode.com/");
        //enter SignIn Values
        common.CommonSignIn("mkzaib02@gmail.com","Avenuecode123");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        subTask.TASKbutton();



    }

    @When("^User enters valid character max (\\d+) and due date$")
    public void userEntersValidCharacterMaxAndDueDate(int arg0) throws Throwable {

        subTask.DescriptionInput("task01");

    }


    @Then("^subtask should ONLY accept if characters of count (\\d+) and due date are filled$")
    public void subtaskShouldONLYAcceptIfCharactersOfCountAndDueDateAreFilled(int arg0) throws Throwable {

        subTask.DueDate("04/12/2018");


    }
}

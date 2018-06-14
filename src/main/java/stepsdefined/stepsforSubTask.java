package stepsdefined;
/*
 Test for setting up subtask
 *
 */

import Web.BrowserFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class stepsforSubTask  {


    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    pages.CommonTasks common = PageFactory.initElements(driver, pages.CommonTasks.class);
    pages.subtasks  subTask = PageFactory.initElements(driver, pages.subtasks.class);


    @Given("^user creates subtask$")
    public void userCreatesSubtask() throws Throwable {
        driver.get("https://qa-test.avenuecode.com/");


        common.CommonSignIn("mkzaib02@gmail.com","Avenuecode123");



    }

    @When("^user click on manage tasks button$")
    public void userClickOnManageTasksButton() throws Throwable {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        subTask.TASKbutton();

    }

    @Then("^sub task pop up opens allowing user to enter sub tasks$")
    public void subTaskPopUpOpensAllowingUserToEnterSubTasks() throws Throwable {

        subTask.getpopup();

    }

}

package pages;

/**
 Checking all modules of Home Page
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(linkText = "My Tasks")
    WebElement mytasks;

    @FindBy(xpath = "/html/body/div[1]/div[3]/center/a")
    WebElement GreentASK;

    @FindBy(xpath = "/html/body/div[1]/h1")
    WebElement readTitle;

    @FindBy(id = "new_task")
    WebElement enterTask;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/form/div[2]/span")
    WebElement BUTTON;


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void getInfo() {
        String value = mytasks.getText();
        System.out.println(value);

    }

    public void GreenButton() {

        GreentASK.click();
        String readit = readTitle.getText();
        String expectedmessage1 = "Hey Muhammad,this is your ToDo list for today:";

        if (expectedmessage1.contains(readit)) {
            System.out.println(readit);
        } else {
            System.out.println(readit + "  (test fail)");

        }


    }

    public void enteringtask(String s) {

        if (s.length() < 3 || s.length() > 250) {
            System.out.println("invalid count of values was allowed");


        }

        enterTask.sendKeys(s);


    }


    public void Buttons(){
    BUTTON.click();
    }

}
package pages;

/**
 Checking components of task manager
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class subtasks {

    WebDriver driver;


    @FindBy(xpath = "//*[text()='(0) Manage Subtasks']//following::button[2]")
    WebElement taskbutton;

    @FindBy(xpath = "/html/body/div[4]/div/div")
    WebElement popup;

    @FindBy(id = "new_sub_task")
    WebElement subtaskDesc;

    @FindBy(id = "dueDate")
    WebElement dueDATE;

    @FindBy(id = "add-subtask")
    WebElement addButton;


    public subtasks(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void TASKbutton() {
        taskbutton.click();


    }

    public void getpopup() {

        String values = popup.getText();
        System.out.println(values);



    }

    public void DescriptionInput(String d) {
        if (d.length() > 250) {
            System.out.println("invalid count of values was allowed");
        }


        subtaskDesc.sendKeys(d);
    }


    public void DueDate(String date) {

        dueDATE.clear();

        if(date.isEmpty()){
            System.out.println("no date was entered sub task was still allowed");
        }

        dueDATE.sendKeys(date);
        addButton.click();

    }
}
package pages;

/**
 For Default sign ins
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonTasks {

    WebDriver driver;

    @FindBy(id = "user_name")
    WebElement username;

    @FindBy(id="user_email")
    WebElement email;

    @FindBy(id="user_password")
    WebElement pass;

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

    @FindBy(name = "commit")
    WebElement submitbutton;

    @FindBy(linkText = "Sign In")
    WebElement signInButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/li")
    WebElement error;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    WebElement alertts;

    public CommonTasks(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

}

public void CommonSignIn(String usermail, String userpass){

    signInButton.click();
    email.sendKeys(usermail);
    pass.sendKeys(userpass);
    submitbutton.click();
    GreentASK.click();


}
}




package pages;
/**
 signing in
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signUpPage {

    WebDriver driver;

    @FindBy(linkText = "Register")
    WebElement register;

    @FindBy(id = "user_name")
    WebElement username;

    @FindBy(id="user_email")
    WebElement email;

    @FindBy(id="user_password")
    WebElement pass;

    @FindBy(id="user_password_confirmation")
    WebElement passconf;

    @FindBy(name = "commit")
    WebElement submitbutton;

    @FindBy(linkText = "Sign In")
    WebElement signInButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    WebElement allerror;

    @FindBy(xpath = "/html/body/div[1]/div[2]/li")
    WebElement error;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    WebElement alertts;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    WebElement welcome;




    public signUpPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void nav(){

        register.click();

    }



    public void registeruser(String uid, String mail, String uspass, String pasconf){
        username.sendKeys(uid);
        email.sendKeys(mail);
        pass.sendKeys(pasconf);
        passconf.sendKeys(uspass);
        submitbutton.click();




    }

    public void errors (){

        String geterrors = allerror.getText();
        System.out.println(geterrors);

        /**   String actual_message= error.getText();
         String expected = "Password is too short (minimum is 8 characters)";

         if(expected.contains(actual_message)) {
         System.out.println(actual_message);
         }else{
         System.out.println("test failed");



        String actualmessage1 = alertts.getText();
        String expectedmessage1 = "Invalid email or password.";

        if(expectedmessage1.contains(actualmessage1)) {
            System.out.println(actualmessage1);
        }else{
            System.out.println("test failed");

        }*/



    }


    public void Signupverification (){

        String welcometitle =   welcome.getText();
        System.out.println(welcometitle);
    }

    public void SignIn(String usermail, String userpass){

        signInButton.click();
        email.sendKeys(usermail);
        pass.sendKeys(userpass);
        submitbutton.click();
    }


}

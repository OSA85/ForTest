package forTests;

import core.BasePage;
import helper.TestValue;
import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class AuthorizationPage extends BasePage {

    @FindBy(xpath = "//input [@name='auth_email']")
    private WebElement email;

    @FindBy(xpath = "//input [@name='auth_pass']")
    private WebElement password;

//    не нужна
    @FindBy(xpath = "//button [@name='form_auth_submit']")
    private WebElement buttonEnter;

    public AuthorizationPage(){
        driver.get(TestValue.TEST_URL);
        PageFactory.initElements(driver, this);
    }


    public HowOldPage authorization(String emailValue, String passwordValue){
        email.sendKeys(emailValue);
        password.sendKeys(passwordValue, Keys.ENTER);


        return new HowOldPage();
    }
}

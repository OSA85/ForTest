package forTests;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TxtPageMin18 extends BasePage {

    @FindBy(xpath = "//p")
    private WebElement txt;

    public TxtPageMin18(){
        PageFactory.initElements(driver, this);
    }

    public String getTxt (){
        return txt.getText();
    }
}

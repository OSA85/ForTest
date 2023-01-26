package forTests;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowOldPage extends BasePage {

    @FindBy(xpath = "//input [@value='18']")
    private WebElement check18;

    @FindBy(xpath = "//input [@type='submit']")
    private WebElement buttonSubmit;


    public HowOldPage() {
        PageFactory.initElements(driver, this);
    }

    public TxtPageMin18 txtPageMin18(){
        check18.click();
        buttonSubmit.click();
        return new TxtPageMin18();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HowOldRuPage extends BasePage {
    private final By inputBox = By.name("img");
    private final By submitButton = By.xpath("//input[@type='submit']");

    public HowOldRuPage(WebDriver driver) {
        super(driver);
    }

    public void enterImageUrl(String url) {
        driver.findElement(inputBox).sendKeys(url);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

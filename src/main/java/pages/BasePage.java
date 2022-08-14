package pages;

import org.openqa.selenium.WebDriver;
import static java.util.concurrent.TimeUnit.*;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(timeToWait, SECONDS);
    }
}

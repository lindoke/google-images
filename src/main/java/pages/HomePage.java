package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public static final String SEARCH_INPUT = "//input[@title='Поиск']";

    public void searchImage(final String keyword){
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(Keys.ENTER);
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }

}

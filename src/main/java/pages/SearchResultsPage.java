package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage{

    public static final String imagesButton = "//a[text()='Картинки']";
    List<WebElement> images = driver.findElements(By.xpath("//img"));

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickImagesButton(){
        driver.findElement(By.xpath(imagesButton)).click();
    }

    public int imagesCount(){
        return images.size();
    }
}

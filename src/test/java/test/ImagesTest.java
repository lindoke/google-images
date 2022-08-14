package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImagesTest extends BaseTest{

    private final String SEARCH_KEYWORD = "Котики";

    @Test
    public void searchForImage(){
        getHomePage().searchImage(SEARCH_KEYWORD);
        getHomePage().implicitWait(10);
        getSearchResultsPage().clickImagesButton();
        getSearchResultsPage().implicitWait(10);
        Assert.assertNotEquals(getSearchResultsPage().imagesCount(), 0);
    }
}

package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        // Find the Computers tab in topmenu and click the link
        clickOnElement(By.linkText("Computers"));

        //This is from requirement
        String expectedText = "Computers";

        // Verify the text Computers
       String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Computers')]"));

       // Verify the text Computers
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        // Find the Electronics tab in topmenu and click on the link
        clickOnElement(By.linkText("Electronics"));

        //This is from requirement
        String expectedText = "Electronics";

        // Verify the text Electronics
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Electronics')]"));

        // Verify the text Electronics
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){

        // Find the Electronics tab in topmenu and click on the link
        clickOnElement(By.linkText("Apparel"));

        //This is from requirement
        String expectedText = "Apparel";

        // Verify the text Apparel
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Apparel')]"));

        // Verify the text Apparel
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){

        // Find the Digital downloads tab in topmenu and click on the link
        clickOnElement(By.linkText("Digital downloads"));

        //This is from requirement
        String expectedText = "Digital downloads";

        // Verify the text Digital downloads
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Digital downloads')]"));

        // Verify the text Digital downloads
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        // Find the Books tab in topmenu and click on the link
        clickOnElement(By.linkText("Books"));

        //This is from requirement
        String expectedText = "Books";

        // Verify the text Books
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Books')]"));

        // Verify the text Books
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        // Find the Jewelry tab in topmenu and click on the link
        clickOnElement(By.linkText("Jewelry"));

        //This is from requirement
        String expectedText = "Jewelry";

        // Verify the text Jewelry
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Jewelry')]"));

        // Verify the text Jewelry
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){

        // Find the Gift Cards tab in topmenu and click on the link
        clickOnElement(By.linkText("Gift Cards"));

        //This is from requirement
        String expectedText = "Gift Cards";

        // Verify the text Gift Cards
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Gift Cards')]"));

        // Verify the text Gift Cards
        Assert.assertEquals(actualText, expectedText);

    }

    @After
    public void teardown(){
        closeBrowser();
    }
}


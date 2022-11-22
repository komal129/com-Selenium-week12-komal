package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        // Find the login link and click on Log in link
        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";


        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Didn't navigate to login page", expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // Find the login link and click on Log in link
        clickOnElement(By.linkText("Log in"));

        // Find the Email field and send the email
        sendTextToElement(By.id("Email"),"davidjones@xyz.com");

        // Find the Password field and send the password
        sendTextToElement(By.id("Password"), "davejones129");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //This is from requirement
        String expectedLogoutLink = "Log out";

        // Once logged in find the Log out text element and get the text
        String actualLogoutLink = getTextFromElement(By.xpath("//div[@class = 'header-links']/ul[1]/li[2]/a[text() = 'Log out']"));

        // Verify the Log out text is displayed
        Assert.assertEquals("Log out text is not displayed",expectedLogoutLink, actualLogoutLink);

    }

    @Test
    public void verifyTheErrorMessage(){

        // Find the login link and click on Log in link
        clickOnElement(By.linkText("Log in"));

        // Find the Email field and send the email
        sendTextToElement(By.id("Email"),"user123@xyz.com");

        // Find the Password field and send the password
        sendTextToElement(By.id("Password"), "user1234");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // This is from requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        // Find the error message text element and get the text
        String actualErrorMessage = getTextFromElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));

        // Verify the error message
        Assert.assertEquals("Error message is not displayed", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void teardown(){
      closeBrowser();
    }
}

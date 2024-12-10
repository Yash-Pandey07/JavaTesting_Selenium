package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
// Navigate to the Links page
        var linksPage = homePage.goToElements().clickLinks();

// Click on the Bad Request link
        linksPage.clickBadRequestLink();

// Get the actual response from the page
        String actualResponse = linksPage.getResponse();

// Log the actual response
        System.out.println("Actual Response: " + actualResponse);

// Assert that the response contains "400" and "Bad Request"
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse + ")\n Does Not Contain '400' and 'Bad Request' \n");

// Log the result of the assertion
        if (actualResponse.contains("400") && actualResponse.contains("Bad Request")) {
            System.out.println("Positive Case: Response contains '400' and 'Bad Request'");
        } else {
            System.out.println("Negative Case: Response does not contain '400' and 'Bad Request'");
        }

    }
}

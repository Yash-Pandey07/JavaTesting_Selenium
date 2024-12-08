package part3.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "/n Actual & Expected Messages Do Not Match  /n" );
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickConfirmationAlertButton();
        dismissAlert();
        String expectedConfirmationResult = "You selected Cancel";
        String actualConfirmationResult = alertPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult , expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");
    }
}

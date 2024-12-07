package part3.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "/n Actual & Expected Messages Do Not Match  /n" );
        acceptAlert();
    }
}

package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertPage extends Alerts_Frames_WindowsPage{
    private By informationAlertButton = By.id("alertButton");


    public void clickInformationButton() {
        click(informationAlertButton);
    }

}

package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading") ;

    public String getTextInBigFrame() {
        //switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        //switchToDefaultContent();
        return bigFrameText;
    }
}
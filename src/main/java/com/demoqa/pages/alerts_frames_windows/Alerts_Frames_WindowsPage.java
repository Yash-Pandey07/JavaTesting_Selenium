package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public BrowserWindowsPage clickBrowserWindows() {
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }
    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
    public AlertPage clickAlerts() {
        scrollToElementJS(alertMenuItem);
        click(alertMenuItem);
        return new AlertPage();
    }

    public FramesPage clickFrames() {
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

}

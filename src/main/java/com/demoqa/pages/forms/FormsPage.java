package com.demoqa.pages.forms;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptIUtility.scrollToElementJS;

public class FormsPage extends BasePage {
    private By praticeFormMenu = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PraticeFormPage clickPracticeForm() {
        scrollToElementJS(praticeFormMenu);
        click(praticeFormMenu);
        return new PraticeFormPage();
    }
}

package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptIUtility.scrollToElementJS;

public class PraticeFormPage extends FormsPage {
    private By femaleRadioButton = By.id("gender-radio-2");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        click(femaleRadioButton);
    }
}

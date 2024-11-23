package com.demoqa.pages.forms;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PraticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);

        click(practiceFormMenuItem);
        return new PraticeFormPage();
    }
}

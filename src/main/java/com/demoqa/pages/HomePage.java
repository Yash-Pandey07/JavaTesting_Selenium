package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptIUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
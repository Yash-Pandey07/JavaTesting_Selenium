package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private By productsHeader = By.xpath("//*[@id=\"inventory_filter_container\"]/div");

    public boolean isProductHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}

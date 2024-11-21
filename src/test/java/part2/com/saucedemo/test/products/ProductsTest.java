package part2.com.saucedemo.test.products;

import org.testng.Assert;
import org.testng.annotations.Test;
import part1.com.saucedemo.pages.ProductsPage;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.logintoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(),"\n Products Header Is not displayed !\n");
    }
}

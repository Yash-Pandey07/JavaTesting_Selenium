package part2.com.saucedemo.test.products;

import com.saucedemo.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.logintoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),"\n Products Header Is not displayed !\n");
    }
}

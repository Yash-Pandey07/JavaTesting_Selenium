package part3.com.demoqa.tests.part3.javascript;

import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;
import part3.com.demoqa.base.Base;

public class JavaScriptTest extends Base {

    @Test
    public void testScrollingToElement() {
        homePage.goToForms();
    }
}

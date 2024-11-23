package part3.com.demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class RadioButtonTest  extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
    }
}

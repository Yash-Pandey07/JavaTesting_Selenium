package part3.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        // Navigate to the Select Menu page
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();

        // Select options in the multi-select dropdown
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1); // Assuming 1 corresponds to an option like "Saab"
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2); // Assuming 2 corresponds to an option like "Opel"

        // Deselect an option in the multi-select dropdown
        selectMenuPage.deselectStandardMulti("saab");

        // Get all selected options
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        // Assert that the expected options are selected
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"), "\n Volvo is not selected as expected \n");
        Assert.assertTrue(actualSelectedOptions.contains("Opel"), "\n Opel is not selected as expected \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"), "\n Audi is not selected as expected \n");
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab is selected as an option \n"); }
}

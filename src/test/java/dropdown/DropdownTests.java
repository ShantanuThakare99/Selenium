package dropdown;

import base.BaseTests3;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests3 {

    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropDown();
        //Instead of write the whole [ DropdownPage dropdownPage = homePage.clickDropDown(); ] class name "DropDownPage"
        //We can also write this as [ var dropdownPage = homePage.clickDropDown(); ]
        String option = "Option 1"; 
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions(); // where var is 'DropdownPage'
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}

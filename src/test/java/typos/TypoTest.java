package typos;

import base.BaseTests3;
import org.testng.annotations.Test;
import pages.TyposPage;

import static org.testng.Assert.assertTrue;

public class TypoTest extends BaseTests3 {
    @Test
    public void typoPageTest(){
        TyposPage typo_page = homePage.clickTyposPage();
        String paraString = typo_page.paraTypo();
        assertTrue(paraString.contains("It does it randomly on each page load."), "There are no typos in the paragraph...");
    }
}

package wait;

import base.BaseTests3;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests2 extends BaseTests3 {

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        if(loadingPage.isStartButtonDisplayed()){
            loadingPage.clickStart();
        }
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect.");
    }
}

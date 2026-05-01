package frames;

import base.BaseTests3;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests3 {

    @Test
    public void testFrameText(){
        var nestedFramePage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramePage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramePage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }

    @Test
    public void testOtherFramesText(){
        var nestedFramePage = homePage.clickFramesPage().clickNestedFrames();
        List<String> list_actual = nestedFramePage.getMiddleRightFrameText();
        List<String> list_expected = List.of("MIDDLE", "RIGHT");
        assertEquals(list_expected, list_actual, "List does not match");
    }
}

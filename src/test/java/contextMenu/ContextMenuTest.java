package contextMenu;

import base.BaseTests3;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests3 {

    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String message = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
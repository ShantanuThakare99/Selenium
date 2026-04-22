package EntryAd;

import base.BaseTests3;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTests3 {

    @Test
    public void modalCloseTest(){
        var entryAdPage = homePage.clickEntryAd();
        entryAdPage.getModalTitle();
        entryAdPage.clickModalCloseBtn();
    }

    @Test
    public void clickRestartModal(){
        var entryAdPage = homePage.clickEntryAd();
        entryAdPage.modalTitleVisibility();
        entryAdPage.clickModalCloseBtn();
        entryAdPage.clickRestartModal();
    }
}

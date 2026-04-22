package alerts;

import base.BaseTests3;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests3 {

    @Test
    public void testFileUpload(){
        var uploadPage =  homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\IntelliJ Maven\\Selenium\\resources\\KTM-2025-390-adventure-r.jpg");
        assertEquals(uploadPage.getUploadedFiles(), "KTM-2025-390-adventure-r.jpg", "Uploaded files incorrect");
    }
}

import BaseTest.Base;
import Page.PracticeFormPage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Test_Setting_Name_Lastname_Email extends Base {


    @Test
    public void set_Name_LastName_Email() {
        // WebDriver'ı base sınıfından alarak PracticeFormPage'e ilet
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

        practiceFormPage.setName("Doğan");
        Assertions.assertEquals("Doğan",practiceFormPage.getName(),"Name Value is not correct!");

        practiceFormPage.setLastName("Güneş");
        Assertions.assertEquals("Güneş",practiceFormPage.getLastName(),"LastName Value is not correct!");

        practiceFormPage.setEmail("dgunes679@gmail.com");
        Assertions.assertEquals("dgunes679@gmail.com",practiceFormPage.getEmail(),"Email Value is not correct!");
    }




}



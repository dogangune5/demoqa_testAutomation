package BaseTest;

import Page.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.TestInstance;

import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        // WebDriver başlatma
        driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Elementleri beklemek için
       // driver.manage().window().maximize();  // Tarayıcıyı tam ekran yap


    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();  // Test tamamlandığında tarayıcıyı kapat
//        }
//    }

}

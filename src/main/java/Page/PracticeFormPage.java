package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {

      // Sayfa nesnesine ait WebDriver



    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");


    private GenderSection genderSection;



    // Constructor ile WebDriver'ı alıyoruz
    public PracticeFormPage(WebDriver driver) {
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }


    public GenderSection genderSection() {
        return this.genderSection;
    }



    public void setName(String name) {
        type(nameLocator,name);
//        WebElement nameSpace = driver.findElement(nameLocator);
//        nameSpace.click();
//        nameSpace.sendKeys(name);
    }

    public void setLastName(String lastName) {
//        WebElement lastNameSpace = driver.findElement(lastNameLocator);
//        lastNameSpace.click();
//        lastNameSpace.sendKeys(lastName);
        type(lastNameLocator,lastName);
    }

    public void setEmail(String email) {
//        WebElement emailSpace = driver.findElement(emailLocator);
//        emailSpace.click();
//        emailSpace.sendKeys(mailAddress);
        type(emailLocator,email);
    }



    public String getName() {
//        WebElement nameSpace = driver.findElement(nameLocator);
//        return nameSpace.getAttribute("value");
        return find(nameLocator).getAttribute("value");

    }

    public String getLastName() {
//        WebElement nameSpace = driver.findElement(lastNameLocator);
//        return nameSpace.getAttribute("value");
        return find(lastNameLocator).getAttribute("value");

    }

    public String getEmail() {
//        WebElement nameSpace = driver.findElement(emailLocator);
//        return nameSpace.getAttribute("value");
        return find(emailLocator).getAttribute("value");

    }


}

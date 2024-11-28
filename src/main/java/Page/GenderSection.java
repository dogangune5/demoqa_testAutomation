package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage {



    private final By maleRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']") ;
    private final By femaleRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioLabelLocator = new By.ByCssSelector("label[for='gender-radio-3']") ;


    private final By maleRadioButtonLocator = By.id("gender-radio-1");
    private final By femaleRadioButtonLocator = By.id("gender-radio-2");
    private final By otherRadioButtonLocator = By.id("gender-radio-3");


    public enum Genders {MALE , FEMALE, OTHER}


    // Constructor
    public GenderSection(WebDriver driver) {
       super(driver);
    }


    public void clickRadioButton(Genders gender) {
        switch (gender) {
            case FEMALE:
                click(femaleRadioButtonLocator);
                break;

            case MALE:
                click(maleRadioButtonLocator);
                break;

            case OTHER:
                click(otherRadioButtonLocator);
                break;

        }
    }

    public boolean isRadioButtonChecked(Genders gender) {

        boolean isChecked = false;

        switch(gender) {
            case FEMALE:
            isChecked = isSelected(femaleRadioButtonLocator);
                break;
            case MALE:
                isChecked = isSelected(maleRadioButtonLocator);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocator);
                break;
        }
        return isChecked;
    }


}

package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath = "//span[@class='menu-toggler__text']")
            private WebElement catalogue;

    @FindBy (xpath = "//a[@href='https://rozetka.com.ua/ua/notebooks/asus/c80004/v004/']")
    private WebElement asusFolter;

    @FindBy (xpath = "//a[href='https://rozetka.com.ua/ua/notebooks/dell/c80004/v007/']")
    private WebElement dellFolter;

    

}

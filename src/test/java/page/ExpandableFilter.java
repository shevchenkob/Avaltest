package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class ExpandableFilter {
    private static final String XPATH = ".//div[contains(@class, 'filter-parametrs-i')]//a[contains(text(),'%s')]" +
            "/parent::div/parent::div";
    protected WebDriver driver;
    protected WebElement filterArea;

    public ExpandableFilter(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    public ExpandableFilter(WebDriver driver, String filterName) {
        this.driver = driver;
        this.filterArea = driver.findElement(By.xpath(String.format(XPATH, filterName)));
        //PageFactory.initElements(driver, this);
    }

    public abstract void expand();
    public abstract void collapse();
    public abstract List<WebElement> getFilters();
}

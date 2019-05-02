package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExpandableFilterImpl extends ExpandableFilter {

    public ExpandableFilterImpl(WebDriver driver) {
        super(driver);
    }

    public ExpandableFilterImpl(WebDriver driver, String filterName) {
        super(driver, filterName);
    }

    public void expand() {
        filterArea.findElement(By.xpath(".//a[contains(text(),'Ще')]")).click();
    }

    public void collapse() {
        filterArea.findElement(By.xpath(".//a[contains(text(),'Згорнути')]")).click();
    }


    public List<WebElement> getFilters() {
        return filterArea.findElements(By.xpath(".//li[contains(@class,'filter-parametrs-i-l-i')]"));
    }
}

package wbTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class WbCardPage extends BasePage {

    public WbCardPage(WebDriver driver) {
        super(driver);
    }

    By buttonAddInBucket = By.xpath("//*[@class='order']");
    By buttonGoToBucket = By.xpath("//*[@class='navbar-pc__item j-item-basket']");
    By item = By.xpath("//*[@href='/catalog/43221351/detail.aspx?size=86155679']");

    public void bucketCheck() {
        driver.findElement(buttonAddInBucket).click();
        driver.findElement(buttonGoToBucket).click();
        try {
            driver.findElement(item);
            System.out.println("Товар виден");
        } catch (NoSuchElementException ex) {
            System.out.println("Товар не виден");
            throw ex;
        }
    }
}

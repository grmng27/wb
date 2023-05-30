package test;

import org.openqa.selenium.WebDriver;
import wbTest.BasePage;
import wbTest.CommonAction;
import wbTest.WbCardPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected WbCardPage wbHomePage = new WbCardPage(driver);
}

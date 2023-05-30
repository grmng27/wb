package test;

import org.testng.annotations.Test;

public class AddInBucket extends BaseTest {

    @Test
    public void checkBucket() {
        basePage.open("https://www.wildberries.ru/catalog/43221351/detail.aspx");
        wbHomePage.bucketCheck();
    }
}

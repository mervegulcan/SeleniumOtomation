import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {


    By resultLocator = new By.ByClassName("resultText");
    By productSelected =By.xpath("//*[@id=\"view\"]/ul/li[7]");
    //int i = new Random().nextInt(100);
    //By productNameLocator =new By.ByXPath("#view > ul > li:nth-child(" + i + ") > div.columnContent");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return  isDisplayed(resultLocator);

    }


    public void selectProduct(int i) {
        getAllProduct().get(i).click();

    }

    private List<WebElement> getAllProduct(){
        return findAll(productSelected);
    }


}

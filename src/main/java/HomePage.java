import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage  extends  BasePage{
    
    SearchBox searchBox;
    By cartCountLocator = new By.ByClassName("basketTotalNum");
    By cartContainerLocator =new By.ByClassName("myBasket");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCount() {
        return  getCartCount() > 0 ;
    }

    private  int getCartCount(){
       String count=  find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
    public void goToCart() {
        click(cartContainerLocator);
    }
}

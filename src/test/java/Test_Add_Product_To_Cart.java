import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart  extends  BaseTest{

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;

    @Test
    @Order(1)
    public  void homePageControl(){
        homePage = new HomePage(driver);
        //homePage.waitForPageLoad();
       // System.out.println("title = "+driver.getTitle());
       // Assertions.assertTrue(driver.getTitle().equals("Giriş Yap - n11.com"));
       // System.out.println("N11 Alışveriş sitesi açıldı");
    }
    @Test
    @Order(2)
    public  void search_a_product(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchBox().search("Bilgisayar");
        Assertions.assertTrue(productPage.isOnProductPage(),"Not on product page");

    }
    @Test
    @Order(3)
    public  void click_product(){
       // int i = new Random().nextInt(20);
        productPage.selectProduct(2);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");

    }
    @Test
    @Order(4)
    public  void add_product_to_cart(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCount(),"Product count did not increase");
    }
    @Test
    @Order(5)
    public  void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product was not added to cart");


    }

}

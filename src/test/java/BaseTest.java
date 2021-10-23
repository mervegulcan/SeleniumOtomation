import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();

        //Thread.sleep(5);
        //driver.findElement(By.cssSelector("#header > div > div > div.hMedMenu > div.customMenu > div.myAccountHolder.customMenuItem.withLocalization > div > div > a.btnSignIn")).click();
       // driver.findElement(By.id("email")).sendKeys("projeodevihesabi@gmail.com");
       // driver.findElement(By.id("password")).sendKeys("369852asd.");
        //driver.findElement(By.id("loginButton")).click();
    }
    @AfterAll
    public  void tearDown(){
        driver.quit();
    }
}

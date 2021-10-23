import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="loginButton")
    private WebElement loginButton;

    @FindBy(id="user")
    private WebElement userName;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  void enterLoginForm(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public  void submit(){
        loginButton.click();

    }
    public  String getUserName(){
        return userName.getText();
    }

}

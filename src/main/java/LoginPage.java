import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private By login;
    private By password;
    private By button;

    public LoginPage() {
        this.login = By.cssSelector("#field_email");
        this.password = By.cssSelector("#field_password");
        this.button = By.xpath("//*[@id=\"anonymPageContent\"]/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/input");
    }

    public void login(String userLogin, String userPassword, WebDriver webDriver) {
        WebElement email = webDriver.findElement(login);
        email.sendKeys(userLogin);
        WebElement pass = webDriver.findElement(password);
        pass.sendKeys(userPassword);
        WebElement btn = webDriver.findElement(button);
        btn.click();
    }

}
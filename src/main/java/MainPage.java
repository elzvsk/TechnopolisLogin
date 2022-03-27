import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private By xpathFullName;
    private String name;

    public MainPage(){
        this.xpathFullName = By.xpath("//*[@id=\"hook_Block_Navigation\"]/div/div/a[1]/div");
    }


    public String getName(WebDriver webDriver) {
        WebElement name = webDriver.findElement(xpathFullName);
        this.name = name.getText();
        return this.name;
    }
}

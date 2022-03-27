import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        User user = new User("Евгения Лозовская","89080941665", "haha that's not my password");
        System.setProperty("webdriver.chrome.driver","D:\\homework\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        loginPage.login(user.getLogin(), user.getPassword(), driver);

        try{
            assertEquals(mainPage.getName(driver), user.getFullName());
        } catch (Exception e){
            System.out.println("\nsomething went wrong\n");
        }
    }

}

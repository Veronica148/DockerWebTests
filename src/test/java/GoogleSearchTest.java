import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    WebDriver driver;

    @BeforeTest
    public void before(){
        driver = new ChromeDriver();
    }

    @Test
    public void searchTest(){
        driver.get("https://www.google.ru/");
        System.out.println("title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @AfterTest
    public void after(){
        driver.quit();
    }
}

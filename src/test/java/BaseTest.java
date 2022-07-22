import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/yazar/ingm?gclid=EAIaIQobChMIpJ6R14yK-QIVi41oCR2qXAuREAAYASAAEgIv8_D_BwE");
        driver.manage().window().maximize();

    }
   // @AfterAll
    //public void tearDown(){
      //  driver.quit();
    //}

}

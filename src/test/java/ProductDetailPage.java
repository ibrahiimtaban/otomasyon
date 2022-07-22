import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.id("<span>Add to Cart</span>") ;

    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductDetailPage() {

        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}

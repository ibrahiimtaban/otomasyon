import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By shippingOptionLocator = By.id("faceted-search-group-0") ;
    By productNameLocator = By.className("a.add-to-cart onclick=AddToCart(306815)");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {

        return isDisplayed(shippingOptionLocator);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);

    }
}

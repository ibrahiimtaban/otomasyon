import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestAdd extends BaseTest{

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchbox().search("roman");
        Assertions.assertTrue(productsPage.isOnProductsPage(),
                "Not on products page");

    }

    @Test
    @Order(2)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage() ,
                "Not on product detail page");

    }

    @Test
    @Order(3)
    public void add_product(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp() ,
                "Product count did not increase");

    }

    @Test

    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product was not added to cart");

    }
}


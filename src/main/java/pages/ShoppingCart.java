package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver){
        this.driver = driver;
    }

    private By productTitleFromCart = By.className("sc-product-title");
    private By productPriceFromCart = By.id("sc-subtotal-amount-activecart");



    public String getProductTitleFromCart(){return driver.findElement(productTitleFromCart).getText();}
    public String getProductPriceFromCart(){return driver.findElement(productPriceFromCart).getText();}


}

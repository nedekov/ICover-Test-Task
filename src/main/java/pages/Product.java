package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {

    private WebDriver driver;



    private By ChooseQuantity = By.id("quantity");
    private By AddProductToCart = By.id("add-to-cart-button");
    private By AssertAddedToCartMessage = By.id("huc-v2-order-row-confirm-text");
    private By ClickCartButton = By.id("hlb-view-cart-announce");
    private By GetProductTitle = By.cssSelector(".product-title-word-break");
    private By GetProductPrice = By.id("price_inside_buybox");

    public Product(WebDriver driver) {
        this.driver = driver;
    }



    public void ChooseQuantity() {driver.findElement(ChooseQuantity).sendKeys("3");}
    public void AddProductToCart() {driver.findElement(AddProductToCart).click();}
    public void ClickCartButton() {driver.findElement(ClickCartButton).click();}
    public void AssertAddedToCartMessage() {driver.findElement(AssertAddedToCartMessage).getText().contentEquals("Added to Cart");}
    public String GetProductTitle() {return driver.findElement(GetProductTitle).getText();}
    public String GetProductPrice() {return driver.findElement(GetProductPrice).getText();}
    
    }

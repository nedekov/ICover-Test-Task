package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Filter {

    private WebDriver driver;



    private By EnterMinimumPrice = By.id("low-price");
    private By EnterMaxPrice = By.id("high-price");
    private By ClickPriceFilterButton = By.id("a-autoid-1");
    private By FilterBrand = By.id("p_89/LEGO");
    private By GoToNextPage = By.partialLinkText("Next");
    private By ClickFirstResult = By.cssSelector("[data-component-type='s-product-image'] .a-link-normal");

    public Filter(WebDriver driver){
        this.driver = driver;
    }

    public void EnterMinimumPrice() { driver.findElement(EnterMinimumPrice).sendKeys("5");}
    public void EnterMaxPrice() {driver.findElement(EnterMaxPrice).sendKeys("500");}
    public void ClickPriceFilterButton() {driver.findElement(ClickPriceFilterButton).click();}
    public void FilterBrand() {driver.findElement(FilterBrand).click();}
    public void GoToNextPage() {driver.findElement(GoToNextPage).click();}
    public void ClickFirstResult() {driver.findElement(ClickFirstResult).click();}




}

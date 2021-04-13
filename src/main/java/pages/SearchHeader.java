package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHeader{

    private WebDriver driver;

    private By searchBar = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public SearchHeader(WebDriver driver){
        this.driver = driver;
    }

    public void searchByString(String searchCriteria) {
        driver.findElement(searchBar).sendKeys(searchCriteria);
        driver.findElement(searchButton).click();
    }
}

package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class AssertTotalPriceIsCorrectTest extends Base{

    SearchHeader searchHeader = new SearchHeader(getDriver());
    Departments departments = new Departments(getDriver());
    Filter filter = new Filter(getDriver());
    Product product = new Product(getDriver());
    ShoppingCart shoppingCart = new ShoppingCart(getDriver());

    @Test
    public void AssertTotalPriceIsCorrect() throws InterruptedException {
        searchHeader.searchByString("Star Wars");
        departments.expandAllDepartments();
        departments.selectToysDepartment();
        filter.EnterMinimumPrice();
        filter.EnterMaxPrice();
        filter.ClickPriceFilterButton();
        filter.FilterBrand();
        filter.GoToNextPage();
        Thread.sleep(2000);
        filter.ClickFirstResult();
        String productTitle =  product.GetProductTitle();
        double productPrice = Double.parseDouble(product.GetProductPrice().substring(1))*3;
        product.ChooseQuantity();
        product.AddProductToCart();
        product.AssertAddedToCartMessage();
        product.ClickCartButton();
        Assert.assertEquals(productTitle,shoppingCart.getProductTitleFromCart());
        Assert.assertTrue(productTitle.contains(shoppingCart.getProductTitleFromCart()), "Title is not as expected ");











        //List<WebElement> arrayList = getDriver().findElements(new By.ByClassName("rush-component"));
        //arrayList.get(1).click();
    }
}

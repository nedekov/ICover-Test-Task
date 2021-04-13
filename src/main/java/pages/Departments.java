package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Departments {

    private WebDriver driver;

    public Departments(WebDriver driver){
        this.driver = driver;
    }

    private By expandAllDepartement = By.partialLinkText("See All");
    private By getToysDepartment = By.linkText("Toys & Games");

    public void expandAllDepartments(){
        try {
            driver.findElement(expandAllDepartement).click();
        }
       catch (NoSuchElementException e) {
       }



    }

    public void selectToysDepartment() {
        driver.findElement(getToysDepartment).click();
    }

}

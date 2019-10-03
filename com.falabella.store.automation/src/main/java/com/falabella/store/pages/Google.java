package com.falabella.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement txtSearchResults;
    
    @FindBy(name = "btnK")
    private WebElement btnSearchResults;
    
    public Google(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void searchResult(String text,String store){
    	txtSearchResults.sendKeys(text,Keys.ENTER);
    	driver.findElement(By.partialLinkText(store)).click();
    }
    
	
}

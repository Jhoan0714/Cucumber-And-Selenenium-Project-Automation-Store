package com.falabella.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Product {
	private WebDriver driver;

	@FindBy(xpath = "//button[@class='fb-btn fb-btn-primary fb-product-cta__controls--actions--choose full-width-btn']")
	private WebElement addProduct;
	
	@FindBy(how = How.LINK_TEXT, using = "Ver Bolsa de Compras")
    private WebElement linkBag;

	public Product(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void addCart(){
		addProduct.click();
	}
}

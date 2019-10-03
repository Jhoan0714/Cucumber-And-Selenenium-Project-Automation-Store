package com.falabella.store.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store {
	private WebDriver driver;

	@FindBy(id = "searchQuestionSolr")
	private WebElement txtSearchProduct;

	@FindBy(xpath = "//*[@id=\"searchFormSolr\"]/a/i")
	private WebElement btnSearchProduct;

	@FindBy(xpath = "//*[@id=\"vertical-filters-custom\"]/div[2]/h4/i")
	private WebElement filterVerticalType;

	@FindBy(name = "Otro")
	private WebElement filterTypeOther;

	@FindBy(xpath = "//*[@id=\"all-pods\"]/div")
	private WebElement productStore;

	public Store(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void searchProduct(String product) {
		txtSearchProduct.click();
		txtSearchProduct.sendKeys(product,Keys.ENTER);
		filterVerticalType.click();
		productStore.click();

	}

}

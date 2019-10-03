package com.falabella.store.feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.falabella.store.pages.Google;
import com.falabella.store.pages.Product;
import com.falabella.store.pages.Store;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreStepsDefinition {

	WebDriver driver;

	@Given("^abrir el navegador (.*) y busque (.*) en (.*)$")
	public void abrir_el_navegador_y_busque_en(String browser, String store, String engine) {
		if (browser.toLowerCase().equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
    	driver.get(engine);
    	driver.manage().window().maximize();
		Google google = new Google(driver);
		google.searchResult(store, "Falabella.com - Bienvenidos");
	}

	@When("^ingrese el nombre del producto (.*) y busque resultados$")
	public void ingrese_el_nombre_del_producto_y_busque_resultados(String product) {
		Store store = new Store(driver);
		store.searchProduct(product);
	}

	@Then("^lo agrega al carrito de compra$")
	public void lo_agrega_al_carrito_de_compra() {
		
		Product product = new Product(driver);
		product.addCart();
		driver.quit();
	}
}

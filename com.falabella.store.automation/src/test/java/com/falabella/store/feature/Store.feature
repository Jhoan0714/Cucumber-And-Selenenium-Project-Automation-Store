@StoreTest
Feature: Compra de productos en tienda online falabella

Scenario Outline: Verificar el añadir productos al carro de compras
	Given abrir el navegador <browser> y busque <store> en <searchengine>
	When ingrese el nombre del producto <product> y busque resultados
	Then lo agrega al carrito de compra
	
	Examples: 
	
	|browser|store		|searchengine	|product		|
	|Chrome	|falabella	|https://www.google.com/	|Televisor HD	|
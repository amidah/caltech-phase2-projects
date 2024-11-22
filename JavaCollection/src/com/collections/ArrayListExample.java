package com.collections;

import java.util.ArrayList;

class Product{
	
	int pid;
	String name;
	int price;
	int quantity;
	
	public Product() 
	{
		
	}

	public Product(int pid, String name, int price, int quantity) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
}

class User{
	
	String name;
	String email;
	
	ArrayList<Product> shoppingCart;
	
	public User() {
		
	}
	
	public User(String name, String email) {
		this.name  = name;
		this.email = email;
		shoppingCart = new ArrayList<Product>();
	}
	
	void addProductToCart(Product product){
		product.quantity++;
		shoppingCart.add(product);
	}
	
	void increment(Product product) {
		int idx = shoppingCart.indexOf(product);
		
		shoppingCart.get(idx).quantity++;
		
	}
	
	void decrement(Product product) {
		int idx = shoppingCart.indexOf(product);
		
		if(idx > 0) {
			shoppingCart.get(idx).quantity--;
		}
	}
	
	void removeProductFromCart(Product product) {
		int idx = shoppingCart.indexOf(product);
		shoppingCart.remove(idx);
	}
	
	void showProductsInCart() {
		System.out.println("Listing products for " + name);
		
		for(Product product : shoppingCart) {
			System.out.println(product);
		}
		
		System.out.println();
	}
	
	void checkoutFromCart() {
		System.out.println("Checking out for " + name);
		
		int total = 0;
		
		for(Product product : shoppingCart) {
			System.out.println(product);
			total += (product.price * product.quantity);
		}
		
		System.out.println("Dear, " + name + "Please pay: " + total);
		System.out.println();
		
	}
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Adidas AlphaBounce Shoe", 2000, 0);
		Product p2 = new Product(201, "IPhone 11", 60000, 0);
		Product p3 = new Product(301, "Samsung LED TV", 50000, 0);
		Product p4 = new Product(401, "HITACHI Fridge", 80000, 0);
		Product p5 = new Product(501, "Coffee Mug", 200, 0);
		
		User user1 = new User("John", "john@gmail.com");
		User user2 = new User("Sam", "sam@gmail.com");
		
		user1.addProductToCart(p1);
		user1.addProductToCart(p2);
		user1.addProductToCart(p3);
		
		user2.addProductToCart(p4);
		user2.addProductToCart(p5);

		user1.showProductsInCart();
		user2.showProductsInCart();
		
		user1.increment(p1);
		user1.increment(p3);
		
		user1.showProductsInCart();
		
		user1.decrement(p3);
		
		user1.showProductsInCart();
		
		user1.removeProductFromCart(p2);
		
		user1.showProductsInCart();
		
		user1.checkoutFromCart();
		user2.checkoutFromCart();
	}
	

}

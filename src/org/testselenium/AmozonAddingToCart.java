package org.testselenium;

import org.testng.annotations.Test;

public class AmozonAddingToCart extends PublicLibrary {
	private ApplicationLibrary al = new ApplicationLibrary();
	
	@Test
	public void addingTocart() throws InterruptedException {
		al.amozonLogin();
		al.searchForProduct();
		al.selectingRandomProduct("Dennis Lingo Men's Cotton Black Solid Casual Shirt");
	}
	
	
	
	
	
	
	
	
	
}

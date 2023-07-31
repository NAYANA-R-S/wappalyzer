package test;

import org.testng.annotations.Test;

import pages.Automatepage;

public class Automatepagetest extends Baseclass{
	@Test
	public void testing()
	{
		Automatepage ap = new Automatepage(driver);
		ap.auto();
		ap.setValues("Shopify Product Reviews");
		ap.tech();
			
	}

}

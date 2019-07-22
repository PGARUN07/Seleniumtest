package testpage;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.Basepage;
import pages.Homepageobjects;

public class Homepagetest {
	
		Homepageobjects homePage;
		Basepage bp;
		
		public Homepagetest() {
		homePage = new Homepageobjects();
		bp = new Basepage();
		}
		
		@Test
		public void verifytabs()
		{
			Assert.assertTrue(homePage.Elelementfound (homePage.women()));
			Assert.assertTrue(homePage.Elelementfound (homePage.dress()));
			Assert.assertTrue(homePage.Elelementfound (homePage.tshirt()));
	
		}

		@Test
		public void verifyclick()
		{
	homePage.womenclick();
	String getTitle1=bp.getTitlte();
	Assert.assertEquals(getTitle1, "Women - My Store");
	homePage.dressclick();
	
	String getTitle2=bp.getTitlte();
	Assert.assertEquals(getTitle2, "Dresses - My Store");
	homePage.tshirtclick();
	
	String getTitle3=bp.getTitlte();
	Assert.assertEquals(getTitle3, "T-shirts - My Store");
	
	

		}

		public void verifysize() 
		{
			Assert.assertTrue(homePage.isElementVisible(homePage.verifysize()));
			
		}
		
		@Test
		public void verifyaddtocart()
		{
system();

}
}



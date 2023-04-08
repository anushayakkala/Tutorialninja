package numpypageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execute {
	
	
	WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://tutorialsninja.com/demo/index.php");
		  driver.manage().window().maximize();
	}
	
	
	
	  @Test public void impo() throws InterruptedException { TnHome th=new
	  TnHome(driver); th.clickDesktop(); th.clickShowall(); th.clickHp();
	  
	  HpPage hp=new HpPage(driver); hp.sendDate(); hp.sendQty(); hp.add();
	  Thread.sleep(2000); hp.success(); Thread.sleep(1000); hp.clickShoppingkart();
	  hp.clickViewkart(); }
	  
	  @Test public void impo1() throws InterruptedException {
	  
	  
	  TnHome th=new TnHome(driver); th.clickDesktop(); th.clickShowall();
	  th.clickHp();
	  
	  HpPage hp=new HpPage(driver); hp.sendDate(); hp.sendQty(); hp.add();
	  Thread.sleep(1000); hp.clickShoppingkart(); hp.clickViewkart();
	  
	  
	  Kart k=new Kart(driver);
	  
	  k.clickCoupon(); Thread.sleep(500); k.sendCoupon(); k.clickApply();
	  Thread.sleep(500); k.printwarn();
	  
	  }
	  
	  @Test public void impo2() throws InterruptedException { TnHome th=new
	  TnHome(driver); th.clickDesktop(); th.clickShowall(); th.clickHp();
	  
	  HpPage hp=new HpPage(driver); hp.sendDate(); hp.sendQty(); hp.add();
	  Thread.sleep(1000); hp.clickShoppingkart(); hp.clickViewkart();
	  
	  Kart k=new Kart(driver); k.clickGift(); Thread.sleep(500); k.sendGift();
	  k.clickApplygift(); Thread.sleep(1000); k.printwarn(); k.clickCheckout();
	  
	  }
	  
	@Test
	public void imp3() throws InterruptedException
	{
		TnHome th=new TnHome(driver);
		th.clickDesktop();
		th.clickShowall(); 
		th.clickHp(); 
		
		HpPage hp=new HpPage(driver);
		hp.sendDate(); 
		hp.sendQty();	
		hp.add();
		Thread.sleep(1000);
		hp.clickShoppingkart();
		hp.clickViewkart();
		
		
		Kart k=new Kart(driver);
		k.clickCheckout();
		Thread.sleep(1000);
		Login l=new Login(driver);
		l.sendEmail();
		l.sendPass();
		l.clickLogin();
		
		Thread.sleep(1000);
		
		Checkout c=new Checkout(driver);
		
		c.clickCont();
		//c.clickCont();
		
	}
	
	
	
	//  @AfterMethod(alwaysRun=true) public void After() { driver.quit(); }
	 
	

}

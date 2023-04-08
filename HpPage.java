package numpypageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HpPage {
	
	public HpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-quantity")
	WebElement qty;
	
	@FindBy(id="input-option225")
	WebElement date;
	
	
	  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement msg;
	  
	  @FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']") WebElement Shopingkart;
	  
	 
	@FindBy(xpath="//button[text()='Add to Cart']")WebElement addtokart;
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")WebElement viewkart;
	
	 public void sendDate() 
	  { 
		  date.clear();
		  date.sendKeys("2013-04-13");
		  }
	  
	  
	  public void sendQty() 
	  { 
		  qty.clear();
		  qty.sendKeys("2"); 
		  
	  }
	 
	
	public void add()
	{
		addtokart.click();
	}
	
	public void success()
	{
	String m=msg.getText();
	System.out.println("sucess msg:"+m);
	}
	
	
	public void clickShoppingkart()
	{
		Shopingkart.click();
	}
	
	public void clickViewkart()
	{
		viewkart.click();
	}
	
	
	
	
	
}

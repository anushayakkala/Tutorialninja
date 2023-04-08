package numpypageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kart {
	
	public Kart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Use Coupon Code")
	WebElement coupon;
	
	@FindBy(linkText="Use Gift Certificate")
	WebElement gift;
	
	
	
	
	@FindBy(name="coupon")
	WebElement ctext;
	
	@FindBy(id="input-voucher")
	WebElement gtext;
	
	
	
	@FindBy(id="button-coupon")
	WebElement apply;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement warn;
	
	
	@FindBy(id="button-voucher")
	WebElement applygift; 
	
	
	@FindBy(linkText="Checkout")
	WebElement checkout;
	
	
	public void clickCoupon()
	{
		coupon.click();
	}
	public void clickGift()
	{
		gift.click();
	}
	
	public void sendCoupon()
	{
		ctext.sendKeys("abcd123");
	}
	
	public void sendGift()
	{
		gtext.sendKeys("azdec12");
	}
	
	public void clickApply()
	{
		apply.click();
	}
	
	public void clickApplygift()
	{
		applygift.click();
	}
	public void printwarn()
	{
		String w=warn.getText();
		System.out.println(w);
	}
	
	public void clickCheckout()
	{
		checkout.click();
	}
	
	 

}

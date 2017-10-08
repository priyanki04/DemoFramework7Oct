package ApplictnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver1){
		this.driver= driver1;
	}
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div/ul/li[1]/a/span") 
	WebElement HomePageLink;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div/ul/li[2]/a/span")
	WebElement MyAccount;
	@FindBy(xpath="/html/body/header/div[1]/div/div/div/ul/li[3]/a/span")
	WebElement MyCart;
	@FindBy(xpath="/html/body/header/div[1]/div/div/div/ul/li[4]/a/span")
	
	WebElement WishList;
	@FindBy(xpath="/html/body/header/div[1]/div/div/div/ul/li[5]/a/span")
	
	WebElement login;
	
	public void clickLogin(){
		login.click();
	}
	
	public void clickMyAccnt(){
		MyAccount.click();
	}
	public void clickWishlist(){
		WishList.click();
	}
		public String getApplicationTitle(){
			String title= driver.getTitle();
			return title;
		}
	}



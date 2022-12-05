package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomeLogin extends BaseSetup{

    public RetailHomeLogin() {
        PageFactory.initElements(getDriver(), this);
    }
   
    
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;

}

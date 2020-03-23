package Pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("https://demo.guru99.com/V4/")
public class LoginPage extends FluentPage  {

	   
	   @FindBy(name = "uid")
	    public FluentWebElement userName; 
	   @FindBy(name = "password")
	    public FluentWebElement password; 
	   
	   @FindBy(name = "btnLogin")
	    public FluentWebElement btnLogin; 
	   
	   public LoginPage setUserName (String usrName)
	   {
		   userName.fill().with(usrName);
		   return this;
	   }
	   
	   public LoginPage setPassword (String strPassword)
	   {
		   password.fill().with(strPassword);
		   return this;
	   }
	   
	   public LoginPage clickLoginButton()
	   {
		   btnLogin.click();
		   return this;
	   }

}

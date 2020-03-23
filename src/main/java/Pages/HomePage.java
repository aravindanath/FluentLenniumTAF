package Pages;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.Assert;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
@PageUrl("https://demo.guru99.com/V4/manager/Managerhomepage.php")
public class HomePage extends FluentPage {
	 @FindBy(xpath = "//table//tr[@class='heading3']")
	 public FluentWebElement homePageBanner; 
	 
	 public HomePage assertHomePage()
	 {
		 Assert.assertTrue(homePageBanner.text().contains("mgr123"));
		 return this;
	 }

}

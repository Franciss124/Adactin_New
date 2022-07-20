package PagesObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends SearchHotel {
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutto;

	public WebElement getRadiobutto() {
		return radiobutto;
	}
	@FindBy(id="continue")
	private WebElement continues;

	public WebElement getContinues() {
		return continues;
	}

}

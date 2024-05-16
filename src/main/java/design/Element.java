package design;

import org.openqa.selenium.WebElement;

public interface Element {
	
	void click(String ele);
	void enterText(String value, String data);
	void selectDropDownUsingValue(String ele, String value) ;
	boolean verifyExactText(String ele, String expectedText);
	

}

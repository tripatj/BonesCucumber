package PageClasses;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import frameworkClasses.Hooks;
import utilClasses.GenericUtility;


public class PageOne extends GenericUtility {
	
	public WebDriver driver;

	@FindBy(css="article h3 a")
	List<WebElement> headlines;
	
	public PageOne(WebDriver driver) {
		driver = super.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void readGnews() {
		System.out.println(driver.getTitle() +" :: " +driver.toString());
	}

	public void readHeadLines(){
		for (WebElement headln : headlines){
			System.out.println("--> " + headln.getText());
		}
	}
	
	

}

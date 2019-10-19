package seleniumeasy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.TestBase;

public class MultipleWindowPopupModal extends TestBase {
WebDriver driver;
	
	String baseurl="https://www.seleniumeasy.com/test";
	
	@BeforeClass
	public void openBrowser(){
		driver=init();
        driver.get(baseurl+"/window-popup-modal-demo.html");
}
	@Test
	public void testMultipleWindowPopup(){
		
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy']")).click();
		driver.findElement(By.id("followall")).click();
		
		String mainWindow=driver.getWindowHandle();
	    
		Set<String> set = driver.getWindowHandles();
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()){
			String popupWindow=itr.next();
			
			if(!mainWindow.equals(popupWindow)){
				driver.switchTo().window(popupWindow);
				System.out.println(driver.switchTo().window(popupWindow).getTitle());
				
			
			}
		}
	
	}
	
}

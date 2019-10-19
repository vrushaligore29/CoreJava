package seleniumeasy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.TestBase;

public class SingleWindowPopup1 extends TestBase {

	WebDriver driver;
	String baseurl = "https://www.seleniumeasy.com/test";

	@BeforeClass
	public void openBrowser() {
		this.driver = init();
		driver.get(baseurl + "/window-popup-modal-demo.html");
	}

	@Test
	public void singleWindowPopup() throws InterruptedException {

		
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Facebook']")).click();
	
		String parent = driver.getWindowHandle();

		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Parent window id is" + parent);
		System.out.println("Total window=" + count);

		for (String child : allwindows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
		}
		
		 driver.switchTo().window(parent);
		 System.out.println("Parent Title is"+driver.getTitle());
		 
	}

}

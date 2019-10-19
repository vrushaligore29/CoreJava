package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.TestBase;

public class BootstrapModal1 extends TestBase {
	WebDriver driver;

	String baseurl = "https://www.seleniumeasy.com/test";

	@BeforeClass
	public void openBrowser() {
		driver = init();
		driver.get(baseurl + "/bootstrap-modal-demo.html");
	}

	@Test
	public void testSingleModel() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='#myModal0']")).click();
		Thread.sleep(1000);
		String s1 = driver.findElement(By.className("modal-title")).getText();
		System.out.println(s1);
		String s2 = driver.findElement(By.className("modal-body")).getText();
		System.out.println(s2);
		driver.findElement(By.xpath("//a[@class='btn']")).click();
		// driver.findElement(By.xpath("//a[@onclick='history.go(0)']")).click();

	}

	@Test
	public void testMultipleModal() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='#myModal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn']")).click();
		// driver.findElement(By.xpath("//a[@onclick='history.go(0)']")).click();
	}
}

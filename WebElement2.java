package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr =new ChromeDriver();
		//dr.navigate().to("https://www.saucedemo.com/");
		dr.get("https://www.saucedemo.com/");
		
		
		Dimension d = new Dimension(500, 750);
		dr.manage().window().setSize(d);
		
		WebElement we = dr.findElement(By.id("user-name"));
		we.click();
		we.sendKeys("Ankur");
		we.clear();
		
		WebElement we1 =dr.findElement(By.id("password"));
		we1.sendKeys("Sunday@00");
		
		System.out.println(we.getLocation());
		System.out.println(we.getTagName());
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getSize());
		System.out.println(we.getAttribute("value"));
	

	}

}

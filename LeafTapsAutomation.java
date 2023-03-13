package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsAutomation {

	public static void main(String[] args) {

		ChromeDriver obj = new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps/control/main");
		obj.manage().window().maximize();
		obj.findElement(By.id("username")).sendKeys("DemoCSR");
		obj.findElement(By.id("password")).sendKeys("crmsfa");
		obj.findElement(By.className("decorativeSubmit")).click();
		String title = obj.getTitle();
		System.out.println(title);
		obj.findElement(By.linkText("CRM/SFA")).click();
		
		
				
	}

}

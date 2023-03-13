package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		obj.findElement(By.linkText("Leads")).click();
		obj.findElement(By.linkText("Create Lead")).click();
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("HondaCars");
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Purushothaman");
		obj.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		obj.findElement(By.name("firstNameLocal")).sendKeys("Purushothaman");
		obj.findElement(By.name("departmentName")).sendKeys("Mechanical Engineering");
		obj.findElement(By.name("description")).sendKeys("Automobile");
		obj.findElement(By.name("primaryEmail")).sendKeys("purusoth555@gmail.com");
		WebElement state = obj.findElement(By.name("generalStateProvinceGeoId"));
		Select sec = new Select(state);
		sec.selectByVisibleText("New York");
		obj.findElement(By.name("submitButton")).click();
		obj.findElement(By.linkText("Duplicate Lead")).click();
		obj.findElement(By.id("createLeadForm_companyName")).clear();
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("volkswagen");
		obj.findElement(By.id("createLeadForm_firstName")).clear();
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopalakrishnan");
		obj.findElement(By.linkText("Create Lead")).click();
		String title2 = obj.getTitle();
		System.out.println(title2);
	}

}

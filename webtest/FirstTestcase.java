package webtest;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTestcase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String actTitle=driver.getTitle();
System.out.println("Actual Title is:"+actTitle);
if(actTitle.equals("OrangeHRM")){
	System.out.println("Testcase pass");
}
else
{
System.out.println("Testcase Fail");
}}
}
	



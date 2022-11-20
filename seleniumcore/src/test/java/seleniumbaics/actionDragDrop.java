package seleniumbaics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionDragDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement tar=driver.findElement(By.xpath("//div[@id='box101']"));
		Actions drag=new Actions(driver);
		drag.dragAndDrop(src, tar).perform();
	}

}

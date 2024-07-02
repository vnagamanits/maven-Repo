package echoprj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class echocls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// launching the browser
		driver.get("https://echoecho.com/htmlforms10.htm\r\n");
		// maximize the window
		driver.manage().window().maximize();
		// print the title
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Wine']")).click();
		// to find the No of elements
		int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement radioButton = driver.findElements(By.xpath("//input[@name='group2']")).get(i);
//			System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
//			System.out.println(driver.findElements(By.xpath("//@name='group2']")).get(i).getAttribute("value"));

//				String text = driver.findElements(By.xpath("//@name='group2']")).get(i).getAttribute("value");
//			// to print the selected object
			if (radioButton.isSelected()) {

				System.out.println(radioButton.getAttribute(("value")));
			}

		}
	}
}

package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
     ChromeDriver driver;
	
	public void open() {
		System.setProperty("Webdriver.Chrome.driver","D:\\extra\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
//		driver.close();
	}
	
	public void login() {
		WebElement usm = driver.findElement(By.name("uid"));
		usm.sendKeys("mngr474858");
		driver.findElement(By.name("password")).sendKeys("qajAnUr");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
//		driver.findElement(By.partialLinkText("New")).click();
		 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("parag sane");
		 WebElement radioButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
		 radioButton.click();
		 WebElement date = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
		 date.sendKeys("01-02-2023");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("01 krishna nagar thane east ");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("thane");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("maharashtra");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("400603");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("908205638");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("paragsane0@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("parag@123");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();



	}

	
	public static void main(String[] args) {
		Script1 o = new Script1();
		o.open();
		o.login();
		
		
	}

}

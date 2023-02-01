package SESSION1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
     ChromeDriver driver;
	
	public void open() {
		System.setProperty("Webdriver.Chrome.driver","D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();
	}	

	
	public static void main(String[] args) {
		Script2 o = new Script2();
		o.open();
		
		
	}

}

package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static WebDriver driver;
		public void Launch()
			{				
				System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http:\\localhost:4200\\petclinic\\welcome");
			//	driver.manage().window().maximize();
				
				driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[2]/a")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[2]/ul/li[2]/a/span[2]")).click();
				
				driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Vodafone_Team1");
				driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Vodafone_Team2");
				driver.findElement(By.xpath("//*[@id='address']")).sendKeys("EON");
				driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Pune");
				driver.findElement(By.xpath("//*[@id='telephone']")).sendKeys("0123456789");
				driver.findElement(By.xpath("/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")).click();
			
			}
		
		
		public void veterinrian()
		{
			driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[3]/ul/li[1]/a/span[2]")).click();
		}
		public void regression()
		{
			int i;
			for(i=0;i<=20;i++)
			{
				Test1 t1 = new Test1(); 
				t1.Launch();
			}
			
			
		}
}

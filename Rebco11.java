import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Rebco11 {
	WebDriver driver;
	String baseurl="https://www.rubcogroup.com/";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	}
	@BeforeMethod
	public void befset()
	{
		driver.get(baseurl);
	}
@Test
public void verifytitle()
{
String exp="Rebco";
String act=driver.getTitle();
Assert.assertEquals(exp, act);
}
@Test
public void verifylogo()
{
	boolean flag=driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/a/img")).isDisplayed();
	Assert.assertTrue(flag);
}

@Test
public void login()
{
	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/ul/li/a")).click();
	driver.findElement(By.id("username")).sendKeys("anagh321");
	driver.findElement(By.id("password")).sendKeys("Anagh*123@123*");
	driver.findElement(By.id("rememberme")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[1]/div/form/p[3]/button")).click();
}
@Test
public void verifyshop() {
	driver.findElement(By.xpath("//*[@id=\"menu-item-67\"]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"main\"]/nav[2]/ul/li[5]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/div[2]/h3")).click();
    driver.findElement(By.xpath("//*[@id=\"product-219\"]/div[2]/form/div/table/tbody/tr/td/ul/li[5]/div/span")).click();
    driver.findElement(By.xpath("//*[@id=\"Layer_1\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"product-219\"]/div[2]/form/div/div/div[2]/button")).click();
    
    
}
@Test
public void verify()
{
	driver.findElement(By.xpath("//*[@id=\"menu-item-61\"]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[4]/div[1]/nav/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div[2]/div/div/a")).click();
	driver.findElement(By.id("billing_address_1")).sendKeys("anish(h) jeppu mangalore karnataka");
	driver.findElement(By.id("billing_city")).sendKeys("mangalore");
	WebElement state=driver.findElement(By.xpath("//*[@id=\"billing_state\"]"));
	Select stateelement=new Select(state) ;
	stateelement.selectByValue("KA");
	driver.findElement(By.id("billing_postcode")).sendKeys("575002");
	driver.findElement(By.id("billing_phone")).sendKeys("9587458545");
	
	
	
	
	}

}

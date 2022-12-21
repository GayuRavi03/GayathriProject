package org.junit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample extends BaseClass{
     static WebDriver driver;
	@BeforeClass
     public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Gayu\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		System.out.println("Before Class");
	}
    @AfterClass
	public static void afterClass() {
       quit();
       System.out.println("After Class");
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("Test Start.."+d);
      System.out.println("Before");
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("Test end.."+d);
       System.out.println("After");
	}
	@Test
	public void test2() {
		urlLaunch("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Gayu");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("12345");
        WebElement btnclick = driver.findElement(By.name("login"));
        btnclick.click();
		System.out.println("Test 2");
	}
	@Test 
	public void test1() {
		driver.get("https://www.facebook.com/");
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Gayu");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Ravi");
	    System.out.println("Test 1");
	}}

package org.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 return driver;
	}
	
	static WebDriver driver2;
	
	public static WebDriver edgeBrowser() { 
     WebDriverManager.edgedriver().setup();
     driver2=new EdgeDriver();
     return driver2;
      
	}
	
	static WebDriver driver3;
	
	public static WebDriver firefoxBrowser() {
	 WebDriverManager.firefoxdriver().setup();
     driver3=new FirefoxDriver();
     return driver3;
      
	}
	//if condition
	public static WebDriver browserlaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")){
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}   
	    else if(bname.equalsIgnoreCase("firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
	    }	
		return driver;
	 }
	
	//switch case
	
	public static WebDriver browserLaunch2(String bname) {
	 switch(bname) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		     break;
	    case "edge":
		    WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
	        break;
	    case "firefox":
	    	WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		    break;
		 default:
			 System.out.println("Invalid Browser Name");
	   }
	return driver;
  }
	
	//url launch
	
	public  static void urlLaunch(String url) {
    driver.get(url);
    driver.manage().window().maximize();
	}
	
	//sendkeys
	
    public static void sendKeys(WebElement e,String value) {
	e.sendKeys(value);
        
	}
    
    //click
    
    public static void Click(WebElement e) {
    e.click();
    }
    
    //quit
    
    public static void quit() {
      driver.quit();
    }
    
    //get title
    
    public static String getTitle() {
    String title = driver.getTitle();
	return title;
    }
    
    //get current url
    
    public static String getCurrentUrl() {
    String currentUrl = driver.getCurrentUrl();
	return currentUrl;
    }
    
    //get text
    
    public static String getText(WebElement e) {
    String text = e.getText();
	return text;
	}
    
    //get attribute
    
    public static String getAttribute(WebElement e) {
    String attribute = e.getAttribute("value");
	return attribute;
	}
    
    //move to element
    
    public static void moveTOElement(WebElement target) {
    Actions a=new Actions(driver);
    a.moveToElement(target).perform();
    }
  
    //dran and drop  
    
    public static void dragAndDrop(WebElement src,WebElement tar) {
    Actions a=new Actions(driver);
    a.dragAndDrop(src, tar).perform();
	}
    
    //double click
    
    public  static void doublelick(WebElement e) {
    Actions a=new Actions(driver);
    a.doubleClick().perform();
	}
    
    //select by index 
    
    public static void slectByIndex(WebElement e,int index) {
    Select s=new Select(e);
    s.selectByIndex(index);
	}
    
    //select by value
    
    public static void slectByValue(WebElement e,String name) {
    Select s=new Select(e);
    s.selectByValue("name");
    }
    
    //select by visible text
    
    public static void selecyByVisibletext(WebElement e,char name) {
    Select s=new Select(e);
    s.selectByVisibleText("name");
    }
  
    //screenshot
//    
//    public static void takeScreenshot() {
//    TakesScreenshot tk=(TakesScreenshot)driver;
//    tk.getScreenshotAs(Output.FILE);
//	}
//    
     //refresh
    
//    public static void refresh() {
//    driver.navigate().refresh();
//	}
//   
   
   
   
   
   
   
   
   
   
   
}




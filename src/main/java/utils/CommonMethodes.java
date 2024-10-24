package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethodes {
	
	
	
	static String resourcePath = null;
	static Boolean isflag = false;
	public static void Takescreenshot(WebDriver driver,String name) throws IOException
	{
		  String generatedString = RandomStringUtils.randomAlphabetic(5);
		 File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("C:\\Users\\ADMIN\\libs\\sourceFile\\kavita"+generatedString+".jpg");
		 
		 FileHandler.copy(srs, dest);	
		 
		 
		 
	}
	
	
	public static void ScrollingView(WebDriver driver,WebElement Elements)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",Elements);
		
	}
	
	public static void wait1(WebDriver driver,int wait)
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		 
	}
	
	public static String Readexcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\ADMIN\\libs\\UPSTOK.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
	 String value = sheet.getRow(Row).getCell(Cell).getStringCellValue();
	return value;
		
		
	}
	
	public static String  readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();

		System.out.println("AA  " + System.getProperty("user.dir"));
		System.out.println("My OS is "+System.getProperty("os.name"));
		System.out.println(resoursePath());
		System.out.println("My Flag is :"+isflag);

		FileInputStream myfile = new FileInputStream(
				System.getProperty("user.dir") + resoursePath() + "myproperty.properties");
System.out.println(resoursePath());
		prop.load(myfile);

		String value = prop.getProperty(key);

		return value;
		 	
	}
	
	   public static void waitForElementToBeVisible(WebDriver driver,WebElement element,int timeout) 
	   {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		   WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		   element1.click();

	        
	        
	        
	    }
	   
	   public static String Excelpath() throws IOException
	   {
			//String excelpath = System.getProperty("user.dir")+"/src/test/Resources/dbtravel.xlsx";
			String excelpath = System.getProperty("user.dir") + resoursePath() + "dbtravel.xlsx";

			return excelpath;

	   }
	   
	   public static void ScrollToElement(WebDriver driver,WebElement element)
	   {
			Actions act=new Actions(driver);
			
	act.scrollToElement(element).perform();
			
				
		  

	   }
	   
	
	  
	     
	   public static void scrollDown(WebDriver driver) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);");
	    }
	   
	 

	    public static void scrollUp(WebDriver driver) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, -500);");
	    }

	    public static boolean validateScrolling(WebDriver driver, String direction) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Get the current scroll position
	        long initialScrollPosition = (long) js.executeScript("return window.scrollY;");

	        // Scroll again
	        if (direction.equalsIgnoreCase("down")) {
	            js.executeScript("window.scrollBy(0, 500);");
	        } else if (direction.equalsIgnoreCase("up")) {
	            js.executeScript("window.scrollBy(0, -500);");
	        }

	        // Wait for a moment (optional)
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Get the new scroll position
	        long scrolledPosition = (long) js.executeScript("return window.scrollY;");

	        // Validate scrolling direction
	        return (direction.equalsIgnoreCase("down") && scrolledPosition > initialScrollPosition)
	                || (direction.equalsIgnoreCase("up") && scrolledPosition < initialScrollPosition);
	    }
	
	    public static void nextPage(WebDriver driver) {
	    	driver.navigate().forward();
	    }
	    
	    public static void backPage(WebDriver driver,int tvalue) {
	    	driver.navigate().back() ;
	    }
	    
	    public static void refreshPage(WebDriver driver,int tvalue) {
	    	driver.navigate().refresh() ;
	    }
	   
	   
	

		
		public static void scrollUp4(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -400);");
		}	
		

		public static void scrollDown1(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 100);");
		}

		public static void scrollUp1(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -100);");
		}
		
		public static void scrollDown2(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200);");
		}

		public static void scrollUp2(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -200);");
		}
		
		public static void scrollDown3(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 300);");
		}

		public static void scrollUp3(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -300);");
		}
		
	

		public static void backPage(WebDriver driver) {
			driver.navigate().back();
		}

		public static void refreshPage(WebDriver driver) {
			driver.navigate().refresh();
		}

		public static void waitfForElements(WebDriver driver, int tvalue) {
			driver.manage().timeouts().implicitlyWait(tvalue, TimeUnit.SECONDS);

		}
	   
		public static String resoursePath() throws IOException {

			if (isflag) {
				//resourcePath = "/eclipse-workspace/Indigo_UI_Automation/target/";
				resourcePath = "/";
			} else {
				resourcePath = "/src/test/resources/";
			}

			return resourcePath;

		}
	   
		
		public static void Autosuggest(WebDriver driver,String city)
		{
			  // Wait for the autocomplete suggestions
		    List<WebElement> ORN = driver.findElements(By.xpath("//div[@class='theme4_flight_autocomplete_tag__Fhkr6']"));
		    
		    if (!ORN.isEmpty()) {
		        for (WebElement searchText : ORN) {
		            String text = searchText.getText();
		            if (text.equalsIgnoreCase(city)) {
		                //searchText.click();
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchText);

		                break;
		            }
		        }
		    } else {
		        System.out.println("The origin city is not available: " + city);
		    }
		
			
			
		}
	   
	   
	   
}

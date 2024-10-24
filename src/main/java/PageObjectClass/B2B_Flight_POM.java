package PageObjectClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import bsh.Console;
import utils.CommonMethodes;

public class B2B_Flight_POM {


	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")private WebElement Class;

	@FindBy(xpath = "//div[@id='Flight_From_0']//input[@id='myTextField']")private WebElement Origin;
	
	@FindBy(xpath = "(//input[@id='myTextField'])[2]")private WebElement searchorigin;
	
	@FindBy(xpath = "//div[@id='Flight_To_0']//input[@id='myTextField']")private WebElement Destination;
	
	@FindBy(xpath = "(//input[@id='myTextField'])[3]")private WebElement SearchDestination;
	
	@FindBy(xpath = "(//div[@id='flightData'])[1]")private WebElement OriginName;
	
	@FindBy(xpath = "(//div[@id='flightData'])[1]")private WebElement DestinationName;
	
	@FindBy(xpath = "(//div[@class='theme2_flight_autocomplete_name__Cj0JV'])[1]")private WebElement Internationaldestination;
	
	@FindBy(xpath = "//div[@class='theme4_calendar_wid_container__ooJdT' and label[contains(text(),'Departure')]]//div[@class='theme4_calendar_wid_main__BOEyJ']//input[@type='text']")private WebElement departureCalander;
	
	
	@FindBy(xpath = "(//div[@class='theme4_flight_search_column__1Xt5Y theme4_flight_search_depart_going_date__ssCDO'])[2]//div[@class='theme4_calendar_wid_main__BOEyJ']")private WebElement returnCalander;
	
	@FindBy(xpath = "//input[@type='radio' and @value='oneWay']")private WebElement oneWayRadioButton;
	
	@FindBy(xpath = "//input[@type='radio' and @value='roundTrip']")private WebElement roundTrip;
	@FindBy(xpath = "//input[@value='Multicity']")private WebElement Multicity;

	
	@FindBy(xpath = "//div[@class='theme4_calendar_head_right_side__o16VX']//span[@class='theme4_calendar_head_icon__Y4clh']//*[name()='svg']")private WebElement nextMonthLable;
	
	@FindBy(xpath = "(//span[contains(text(),'26')])[1]")private WebElement selectDate;
	
	@FindBy(xpath = "(//span[normalize-space()='30'])[1]")private WebElement selectRetunDate;

	@FindBy(xpath = "(//*[name()='svg'][@class='h-5 w-5'])[1]")private WebElement navigateoncalender;
	
	@FindBy(xpath = "//button[normalize-space()='Done']")private WebElement Apply;

	@FindBy(xpath = "//label[normalize-space()='Premium Economy']")private WebElement Premium_Economy;
	
	@FindBy(xpath = "//label[normalize-space()='First Class']")private WebElement First_Class;
	
	@FindBy(xpath = "//label[normalize-space()='Business']")private WebElement Business_Class;
	
	@FindBy(xpath = "//label[normalize-space()='Economy']")private WebElement Economy;

	@FindBy(xpath = "(//div[normalize-space()='First Class'])[2]")
	private WebElement First_Class1;
	
	@FindBy(xpath = "(//div[normalize-space()='Business'])[2]")
	private WebElement Business_Class1;
	@FindBy(xpath = "//div[contains(@class,'theme4_flight_trav_title__h1a56')]")
	private WebElement Passanger;
	@FindBy(xpath = "(//*[name()='svg'][@id='plus'])[1]")
	private WebElement Adult;
	@FindBy(xpath = "(//*[name()='svg'][@id='plus'])[2]")
	private WebElement child;
	@FindBy(xpath = "(//*[name()='svg'][@id='plus'])[3]")
	private WebElement infent;
	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement Flight_Search;
	@FindBy(xpath = "//label[normalize-space()='One Way']")
	private WebElement SelectOneWay;
	@FindBy(xpath = "//label[normalize-space()='Round Trip']")
	private WebElement SelectRoundWay;
	@FindBy(css = "div[class='theme5_flt_pasngrFlx__KkydQ'] div[class='theme5_flt_trav_label__kc5Sd']")
	private WebElement ValidateClass;
	@FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//button[1]")
	private WebElement Book;

	@FindBy(xpath = "//div[@class='theme4_fare_detail_box__9WckK']")
	private WebElement fareDetailsSection;


	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]")
	private WebElement Stopes;
	@FindBy(name = "Continue Booking")
	private WebElement ContinuBook;

	@FindBy(xpath = "(//a[normalize-space()='Flight Search'])[1]")
	private WebElement FlighSearch;

	@FindBy(xpath = "//input[@id='markup']")
	private WebElement markUpRadio;

	// input[@id='markup']
	@FindBy(xpath = "//input[@id='markdown']")
	private WebElement markDownRadio;

	@FindBy(xpath = "//p[text()='Local Taxes (if applicable)']")
	private WebElement localTaxTextLocator;

	@FindBy(xpath = "//div[@class='theme4_flight_base_ticket_price__OWEX3']//input[@placeholder='Enter Amount']")
	private WebElement localTaxLocator;

	@FindBy(xpath = "//input[@value='Multicity']")private WebElement Selectmulticity;

	@FindBy(xpath = "//span[contains(text(),'Flights')]")private WebElement ClickFlight;
	
	@FindBy(xpath="//div[@class='MuiBox-root jss1']//span[3]")private WebElement DragStart;
	@FindBy(xpath="//div[@class='MuiBox-root jss1']//span[4]")private WebElement DragEnd;
	
	@FindBy(xpath="//div[@class='theme4_filter_trip_duration__gkOGQ']//span[3]")private WebElement DurationStart;
	@FindBy(xpath="//div[@class='theme4_filter_trip_duration__gkOGQ']//span[4]")private WebElement DurationEnd;

	
	@FindBy(xpath="(//div[@id='onwardDetails-departure'])[1]")private WebElement departTimeFrom;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/label[1]/span[1]")private WebElement OnwardAirlines;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[9]/div[2]/label[1]/span[1]")private WebElement LayoversOnward;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[14]/div[2]/label[1]/span[1]")private WebElement LayoversReturn;

	@FindBy(xpath="//button[@id='advanceSearchButton']//img")private WebElement advanceSearchButton;
	@FindBy(xpath="//div[@class='theme4_icon_Rbd_advInputnw__UB2ho']//span[@class='theme4_dropdown_Flx__4d_Xw']//span//*[name()='svg']")private WebElement RBDClasses;
	@FindBy(xpath="//div[@id='rbdCabinErrMsg1']//span[@class='theme4_dropdown_Flx__4d_Xw']")private WebElement RetunRBDClasses;

	@FindBy(xpath="//div[@class='theme4_flight_cabin_arrowMn__7tLFb']//*[name()='svg']")private WebElement Cabin;
	@FindBy(xpath="//div[@id='Flight_cabin_1']//div[@class='theme4_cabin_cont_flx__BtMbR']")private WebElement RetunCabin;

	@FindBy(xpath="//input[@placeholder='Select Supplier']")private WebElement Supplier;
	@FindBy(xpath="//div[@class='theme4_dropdown_container__BqGlp']//div//span[@class='theme4_dropdown_Flx__4d_Xw']")private WebElement DepartureTime;
	@FindBy(xpath="(//span[@class='theme4_dropdown_Flx__4d_Xw'])[5]")private WebElement ReturnDepartureTime;





	public B2B_Flight_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}



	public void ClickFlightModule(WebDriver driver) throws InterruptedException {
		ClickFlight.click();
		Thread.sleep(4000);

	}


	public void Selecttrippassoriginanddestination(WebDriver driver, String way, String origin, String destination)throws InterruptedException {
	

		System.out.println("The Current trip is :"+way);
		System.out.println("The origin is "+origin);
		System.out.println("The destination is "+destination);

		
			if (way.contentEquals("Round-Way")||way.equalsIgnoreCase("Half-Round-Trip")||way.contentEquals("One-Way")) 
			{
				
				if(way.contentEquals("Round-Way")||way.equalsIgnoreCase("Half-Round-Trip"))
				{
			   // click on round trip radio button
				roundTrip.click(); 
				}
				
				Thread.sleep(1000);		
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				
	
			    wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Add Client(s)']")));
				Thread.sleep(1000);		


					try {
					    // Wait for the origin field to be visible and interact
					    
					
					    
					    // Locate the element again just before sending keys to avoid stale reference
					    WebElement originLocator = driver.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']"));
					    originLocator.sendKeys(origin);
						Thread.sleep(3000);		

					    CommonMethodes.Autosuggest(driver, origin);			    

					} catch (Exception e) {
					    e.printStackTrace();
					}
					
					Thread.sleep(1000);	
					



					try {
					
					    
					    // Locate the element again just before sending keys to avoid stale reference
					    WebElement destinationLocator = driver.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']"));
					    destinationLocator.sendKeys(destination);
						Thread.sleep(3000);		

					    CommonMethodes.Autosuggest(driver, destination);

					} catch (Exception e) {
					    e.printStackTrace();
					}


			} 
					
			else if(way.equalsIgnoreCase("Multicity"))
			{
				// click on round trip radio button
				Multicity.click(); 
				Thread.sleep(1000);		

				
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				
	
			    wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Add Client(s)']")));
				Thread.sleep(1000);		


					try {
					    // Wait for the origin field to be visible and interact
					    
					
					    
					    // Locate the element again just before sending keys to avoid stale reference
					    WebElement originLocator = driver.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']"));
					    originLocator.sendKeys(origin);
		    
					    CommonMethodes.Autosuggest(driver, origin);			    

					} catch (Exception e) {
					    e.printStackTrace();
					}
					
				
					Thread.sleep(1000);		

				
				
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(20));

					WebElement DestinationLocator = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));
					DestinationLocator.sendKeys("MCT");
					Thread.sleep(1000);		

				    CommonMethodes.Autosuggest(driver, "MCT");			    

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				
				Thread.sleep(1000);	
				



				try {
				
				    
				    // Locate the element again just before sending keys to avoid stale reference
				    WebElement destinationLocator = driver.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']"));
				    destinationLocator.sendKeys(destination);
					Thread.sleep(3000);		

				    CommonMethodes.Autosuggest(driver, destination);

				} catch (Exception e) {
				    e.printStackTrace();
				}
				
					

			
				
				
				Thread.sleep(2000);	
				
			
			}
			

	


	}

	public void SelectDatefortrip(WebDriver driver, String way, String month, String rmonth, String departureDate,
			String returnDate,boolean searchType) throws InterruptedException {
		
		Random random = new Random();

		int min = 1;
		int max = 15;
		int min1 = 16;
		int max1 = 30;
		int randomNumberInRange = random.nextInt(max - min) + min;
		int randomNumberInRange1 = random.nextInt(max1 - min1) + min1;
		
		String strNumber = String.valueOf(randomNumberInRange);
		String strNumber1 = String.valueOf(randomNumberInRange1);
		
		
		
		System.out.println("current Journey is --- " + way);
       if(searchType) {
    	   if(way.equalsIgnoreCase("Round-Way")||way.equalsIgnoreCase("Half-Round-Trip")||way.equalsIgnoreCase("Multicity"))
    	   {


   			CommonMethodes.waitForElementToBeVisible(driver, departureCalander, 1);
   			Thread.sleep(1000);
   			selectDate(driver, month, strNumber, way);

   			
   			Thread.sleep(1000);
   			CommonMethodes.waitForElementToBeVisible(driver, returnCalander, 3);
   			Thread.sleep(500);
   			CommonMethodes.scrollDown1(driver);
   			Thread.sleep(500);
   			selectDate(driver, rmonth, strNumber1, way);
   		
    	   }
    	   else {
   			CommonMethodes.waitForElementToBeVisible(driver, departureCalander, 1);
   			Thread.sleep(1000);
   			selectDate(driver, month, strNumber, way);
   			Thread.sleep(1000);
   		}
	

      }else if (way.equalsIgnoreCase("Round-Way")||way.equalsIgnoreCase("Half-Round-Trip")||way.equalsIgnoreCase("Multicity")) {

			CommonMethodes.waitForElementToBeVisible(driver, departureCalander, 1);
			Thread.sleep(1000);
			selectDate(driver, month, strNumber, way);
			Thread.sleep(1000);

			Thread.sleep(1000);
			CommonMethodes.waitForElementToBeVisible(driver, returnCalander, 3);
//			Thread.sleep(1000);
			selectDate(driver, rmonth, strNumber1, way);
		} else {
			CommonMethodes.waitForElementToBeVisible(driver, departureCalander, 1);
			Thread.sleep(1000);
			selectDate(driver, month, strNumber, way);
			Thread.sleep(1000);
		}

		Thread.sleep(1000);
	}

	public static int getIndexOfMatchingElement(List<WebElement> elements, String month) {
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equalsIgnoreCase(month)) {
				return i;
			}
		}
		return -1; // return -1 if no matching element is found
	}

	private void selectDate(WebDriver driver, String month, String date, String way) throws InterruptedException {

		System.out.println("Trip type is " + way);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		int index;
		while (true) {
			System.out.println("checking while loop");
			String text = driver.findElement(By.xpath("//h3")).getText();
			System.out.println("while current month is " + text);

			List<WebElement> monthYearLabels = driver
					.findElements(By.xpath("//div[@class='theme4_calendar_head_center_side__4_Yqx']//h3"));

			boolean isMonthFound = monthYearLabels.stream().anyMatch(ele -> ele.getText().equalsIgnoreCase(month));

			System.out.println("while given input month is " + month);
			System.out.println("isMonthFound staus is " + isMonthFound);

			index = getIndexOfMatchingElement(monthYearLabels, month);
			System.out.println("index value is " + index);

			if (isMonthFound) {
				break;
			} else {
				// next forward check for month and year if no date Available

				System.out.println(driver.findElements(By.xpath(
						"//div[@class='theme4_calendar_head_right_side__o16VX']//span[@class='theme4_calendar_head_icon__Y4clh']//*[name()='svg']"))
						.size());
				CommonMethodes.waitForElementToBeVisible(driver, nextMonthLable, 3);
			}

		}

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");

		if (index == 0) {
			List<WebElement> letftSideDates = driver.findElements(By.xpath(
					"//div[@class='theme4_calendar_whole_body__ZTJsd'][1]//div[@class='theme4_calendar_day_list__MByr8'][1]//div[@class='theme4_day_cell_center__bpS9l' or 'theme4_day_cell_center__bpS9l theme4_selected_calendar_date__z_ZjS']//span[@class='']"));
			System.out.println("user given date is 1 option " + date);

//			alldepartureDates.stream().filter(ele -> ele.getText().contentEquals(date)).findFirst()
//					.ifPresent(WebElement::click);

			letftSideDates.stream().filter(ele -> ele.getText().contentEquals(date)).findFirst().ifPresent(element -> {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait1.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
			});

		} else {
			List<WebElement> rightSideDates = driver.findElements(By.xpath(
					"//div[@class='theme4_calendar_whole_body__ZTJsd'][2]//div[@class='theme4_calendar_day_list__MByr8'][1]//div[@class='theme4_day_cell_center__bpS9l' or 'theme4_day_cell_center__bpS9l theme4_selected_calendar_date__z_ZjS']//span[@class='']"));

			System.out.println("user given date is 2 option " + date);
//			allReturnDates.stream().filter(ele -> ele.getText().contentEquals(date)).findFirst()
//					.ifPresent(WebElement::click);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait for up to 30 seconds

			rightSideDates.stream().filter(ele -> ele.getText().contentEquals(date)).findFirst().ifPresent(element -> {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait2.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
			});

		}



	}

	public void selectClassforTrip(WebDriver driver, String way, String Classess) throws InterruptedException {

		if (Classess.equalsIgnoreCase("Economy")) {
			System.out.println("11111111");
			System.out.println("The selected Class is :" + Economy.getText());
			WebElement element1 = Economy;
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Apply);

		} else if (Classess.equalsIgnoreCase("Business")) {
			System.out.println("2222222");
			System.out.println("The selected Class is :" + Business_Class.getText());
			WebElement element1 = Business_Class;
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Apply);

		} else if (Classess.equalsIgnoreCase("First Class")) {
			System.out.println("3333333");
			System.out.println("The selected Class is :" + First_Class.getText());
			WebElement element1 = First_Class;
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Apply);

		} else if (Classess.equalsIgnoreCase("Premium Economy")) {
			System.out.println("444444444");
			System.out.println("The selected Class is :" + Premium_Economy.getText());
			WebElement element1 = Premium_Economy;
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Apply);
		}

	}

	public void selectClassforTripandValidaetheclass(WebDriver driver, String way, String Classess)
			throws InterruptedException {

		if (way.contentEquals("Round-Way")) {
			if (Classess.equalsIgnoreCase("Economy")) {
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
				System.out.println("we select  Economy class");

			} else if (Classess.equalsIgnoreCase("Business")) {
				Business_Class.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);

				System.out.println("The selected Class is :" + Business_Class);

			} else if (Classess.equalsIgnoreCase("First Class")) {
				First_Class.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);

				System.out.println("The selected Class is :" + First_Class);

			} else if (Classess.equalsIgnoreCase("Premium Economy")) {
				Premium_Economy.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);

				System.out.println("The selected Class is :" + Premium_Economy);

			}
		} else if (way.equals("One-Way")) {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
			if (Classess.equalsIgnoreCase("Economy")) {
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
				System.out.println("we select  Economy class");

				Flight_Search.click();
				Thread.sleep(4000);

				String text = Class.getText();
				Assert.assertEquals(text, "Economy");

			} else if (Classess.equalsIgnoreCase("Business")) {
				Business_Class.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
				Flight_Search.click();

				Thread.sleep(4000);

				System.out.println("The selected Class is :" + Business_Class);
				String text = Class.getText();
				Assert.assertEquals(text, "Business");

			} else if (Classess.equalsIgnoreCase("First Class")) {
				First_Class.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
				Flight_Search.click();

				Thread.sleep(4000);

				System.out.println("The selected Class is :" + First_Class);
				String text = Class.getText();
				Assert.assertEquals(text, "First Class");

			} else if (Classess.equalsIgnoreCase("Premium Economy")) {

				Premium_Economy.click();
				CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
				Flight_Search.click();

				Thread.sleep(4000);
				System.out.println("The selected Class is :" + Premium_Economy);
				String text = Class.getText();
				Assert.assertEquals(text, "Premium Economy");
			}
		}

	}

	public void Selectpassangerfortrip(WebDriver driver, String AdultString, String childString, String InfentString)
			throws InterruptedException {
		
		
           CommonMethodes.scrollDown2(driver);
   		Thread.sleep(500);
		CommonMethodes.waitForElementToBeVisible(driver, Passanger, 2);

		String stringadult = AdultString;
		Integer adult = Integer.valueOf(stringadult);

		String stringchild = childString;
		Integer Child = Integer.valueOf(stringchild);

		String stringinfent = InfentString;
		Integer Infent = Integer.valueOf(stringinfent);
		Thread.sleep(500);

		for (int i = 1; i < adult; i++) {

			CommonMethodes.waitForElementToBeVisible(driver, Adult, 10);

		}
		Thread.sleep(500);
		for (int i = 0; i < Child; i++) {

			CommonMethodes.waitForElementToBeVisible(driver, child, 10);

		}
		Thread.sleep(500);
		for (int i = 0; i < Infent; i++) {

			CommonMethodes.waitForElementToBeVisible(driver, infent, 10);

		}
		Thread.sleep(1000);

	}

	public void click_Search(WebDriver driver, String way) throws InterruptedException {
	

		Flight_Search.click();

	}

	public void selectDepartureTimeFrom(WebDriver driver) throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	  	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
	    WebElement elemnet = popup.findElement(By.xpath("(//div[@id='onwardDetails-departure'])[1]"));
	    Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);
	


	}

	public void selectAirlineFromOnwards(WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	  	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
	    WebElement elemnet = popup.findElement(By.xpath("((//div[@class='theme4_airline_inner__s_mmh'])[1]//label[@class='theme4_checkbox_common__tRblA'])[1]"));
	    Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);


		


	}

	public void selectAirlineFromReturns(WebDriver driver) throws InterruptedException {
	
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
  	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
    WebElement elemnet = popup.findElement(By.xpath("((//div[@class='theme4_airline_inner__s_mmh'])[2]//label[@class='theme4_checkbox_common__tRblA'])[1]"));
    Thread.sleep(500);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);


	

	}

	public void selectLayoverOnward(WebDriver driver) throws InterruptedException 
	{	
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
  	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
    WebElement elemnet = popup.findElement(By.xpath("(//div[@class='theme4_airport_inner__H4y1H'])[1]//label[@class='theme4_checkbox_common__tRblA'][1]"));
    Thread.sleep(500);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);


	
	}

	public void selectLayoverreturns(WebDriver driver) throws InterruptedException {
		
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
  	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
    WebElement elemnet = popup.findElement(By.xpath("(//div[@class='theme4_airport_inner__H4y1H'])[2]//label[@class='theme4_checkbox_common__tRblA'][1]"));
    Thread.sleep(500);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);


    

	}

	public void clickBook(WebDriver driver, String way, String Flight) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Book);
		Thread.sleep(5000);

	}
	
	public void clickAdvancebooking(WebDriver driver) throws InterruptedException {
		

	 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));   	 
	   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='advanceSearchButton']//img")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", advanceSearchButton);

		Thread.sleep(1000);
	}
	
	
	
	public void SelectRBDClases(WebDriver driver,String RBD,String way) throws InterruptedException {
		
		
		
		
		
		if(way.contains("One-Way"))
		{
			RBDClasses.click();
			Thread.sleep(500);
	        System.out.println("The Currrant RBD is :"+RBD);
	        
				   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   	 
				   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name-input']")));
				   	 		
						//All Checkbookes
						List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

						// All RBD Names
						List<WebElement> RBDName= driver.findElements(By.xpath("//span[@class='theme4_advTitle__GzPon']"));

						
						
						if (RBDName.size() > 0) {
							// Iterate through the list and find the matching fare type
							for (int i = 0; i < RBDName.size(); i++) {
								WebElement searchText = RBDName.get(i);
								String current_dt = searchText.getText();
								if (current_dt.equalsIgnoreCase(RBD)) {
									checkbox.get(i).click();
									RBDClasses.click();
									break;
								}
							}
						} else {
							System.out.println("The Current RBD is not available");
						}
		}
		else if(way.contains("Round-Way")||way.contains("Half-Round-Trip")||way.contains("Multicity"))
		{
			RBDClasses.click();
			Thread.sleep(500);
	        System.out.println("The Currrant RBD is :"+RBD);
	        
				   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   	 
				   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name-input']")));
				   	 		
						//All Checkbookes
						List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

						// All RBD Names
						List<WebElement> RBDName= driver.findElements(By.xpath("//span[@class='theme4_advTitle__GzPon']"));

						
						
						if (RBDName.size() > 0) {
							// Iterate through the list and find the matching fare type
							for (int i = 0; i < RBDName.size(); i++) {
								WebElement searchText = RBDName.get(i);
								String current_dt = searchText.getText();
								if (current_dt.equalsIgnoreCase(RBD)) {
									checkbox.get(i).click();
									RBDClasses.click();
									break;
								}
							}
						} else {
							System.out.println("The Current RBD is not available");
						}
			
						
						Thread.sleep(1000);

			RetunRBDClasses.click();
			Thread.sleep(500);
	        System.out.println("The Currrant RBD is :"+RBD);
	        
			
				   	 		
						//All Checkbookes
						List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@type='checkbox']"));

						// All RBD Names
						List<WebElement> RBDName1= driver.findElements(By.xpath("//span[@class='theme4_advTitle__GzPon']"));

						
						
						if (RBDName1.size() > 0) {
							// Iterate through the list and find the matching fare type
							for (int i = 0; i < RBDName1.size(); i++) {
								WebElement searchText = RBDName1.get(i);
								String current_dt = searchText.getText();
								if (current_dt.equalsIgnoreCase("D")) {
									checkbox1.get(i).click();
									RBDClasses.click();
									break;
								}
							}
						} else {
							System.out.println("The Current RBD is not available");
						}
		}
		
		
		
	
					
			     
		Thread.sleep(1000);
	}
	
	

	public void SelectCabin(WebDriver driver,String Cabinclass,String way) throws InterruptedException {
		
		
		if(way.contains("One-Way"))
		{
			Cabin.click();
			Thread.sleep(500);
			
			System.out.println("The current Cabinclass is :"+Cabinclass);
	 		
			//All Checkbookes
			List<WebElement> rediobutton = driver.findElements(By.xpath("//div[@class='theme4_flight_cabin_class_list__tLDeD']//input[@type='radio']"));

			// All RBD Names
			List<WebElement> cabinclasses= driver.findElements(By.xpath("//label[@class='theme4_flight_cabin_class_ele__hsTDk theme4_CabinLabel__9y5cf']"));

			
			
			if (cabinclasses.size() > 0) {
				// Iterate through the list and find the matching fare type
				for (int i = 0; i < cabinclasses.size(); i++) {
					WebElement searchText = cabinclasses.get(i);
					String current_dt = searchText.getText();
					if (current_dt.equalsIgnoreCase(Cabinclass)) {
						cabinclasses.get(i).click();
						break;
					}
				}
			} else {
				System.out.println("The Current cabin  is not available");
			}

		}
		
		else if(way.contains("Round-Way")||way.contains("Half-Round-Trip")||way.contains("Multicity"))
		{
			
			Cabin.click();
			Thread.sleep(500);
			
			System.out.println("The current Cabinclass is :"+Cabinclass);
		

			// All RBD Names
			List<WebElement> cabinclasses= driver.findElements(By.xpath("//div[@class='theme4_flight_cabin_class_list__tLDeD']//label[@class='theme4_flight_cabin_class_ele__hsTDk theme4_CabinLabel__9y5cf']"));

			
			
			if (cabinclasses.size() > 0) {
				// Iterate through the list and find the matching fare type
				for (int i = 0; i < cabinclasses.size(); i++) {
					WebElement searchText = cabinclasses.get(i);
					String current_dt = searchText.getText();
					if (current_dt.equalsIgnoreCase(Cabinclass)) {
						cabinclasses.get(i).click();
						break;
					}
				}
			} else {
				System.out.println("The Current cabin  is not available");
			}

		Thread.sleep(2000);
		
		RetunCabin.click();

		Thread.sleep(500);
        System.out.println("The Currrant Cabin is :"+Cabinclass);
		Thread.sleep(500);

	
 		
				
					// All RBD Names
					List<WebElement> cabinclasses1= driver.findElements(By.xpath("//div[@class='theme4_flight_cabin_class_list__tLDeD']//label[@class='theme4_flight_cabin_class_ele__hsTDk theme4_CabinLabel__9y5cf']"));

					
					
					if (cabinclasses1.size() > 0) {
						// Iterate through the list and find the matching fare type
						for (int i = 0; i < cabinclasses1.size(); i++) {
							WebElement searchText = cabinclasses1.get(i);
							String current_dt = searchText.getText();
							if (current_dt.equalsIgnoreCase(Cabinclass)) {
								cabinclasses1.get(i).click();
								break;
							}
						}
					} else {
						System.out.println("The Current cabin  is not available");
					}
			
		}
		
		
					
			     
		Thread.sleep(1000);
	}
	
	
	public void SelectSupplier(WebDriver driver,String Suppliers) throws InterruptedException {
		
		
		
		Supplier.click();
		Thread.sleep(500);
        System.out.println("The Currrant Supplier is :"+Suppliers);
        
        CommonMethodes.scrollDown1(driver);
			   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   	 
			   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name-input']")));
			   	 		
					//All Checkbookes
					List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='multiSelectDropDown_dropdown_container__eVuyi']//input[@type='checkbox']"));

					// All RBD Names
					List<WebElement> Suppliername= driver.findElements(By.xpath("//span[@class='multiSelectDropDown_advTitle__Wk02T']"));

					
					
					if (Suppliername.size() > 0) {
						// Iterate through the list and find the matching fare type
						for (int i = 0; i < Suppliername.size(); i++) {
							WebElement searchText = Suppliername.get(i);
							String current_dt = searchText.getText();
							System.out.println("The Suppliesr check :"+current_dt);
							if (current_dt.equalsIgnoreCase(Suppliers)) {
								Suppliername.get(i).click();
								CommonMethodes.scrollDown1(driver);
								Supplier.click();
								break;
							}
						}
					} else {
						System.out.println("The Current Supplier is not available");
					}
					
			     
		Thread.sleep(1000);
	}
	
	
public void SelectDepartureTime(WebDriver driver,String Departure,String way) throws InterruptedException {
	
		
	if(way.contains("One-Way"))
	{		
	DepartureTime.click();
	Thread.sleep(500);
    System.out.println("The Currrant Departure Time is :"+Departure);
	// All RBD Names
	List<WebElement> AllDeparture= driver.findElements(By.xpath("//ul[@class='theme4_dropdown_value_container__UAQJN']//span[@class='theme4_advTitle__GzPon']"));
	if (AllDeparture.size() > 0) {
		// Iterate through the list and find the matching fare type
		for (int i = 0; i < AllDeparture.size(); i++) {
			WebElement searchText = AllDeparture.get(i);
			String current_dt = searchText.getText();
			System.out.println("The Departure check :"+current_dt);
			if (current_dt.equalsIgnoreCase(Departure)) {
				AllDeparture.get(i).click();
				break;
			}
		}
	} else {
		System.out.println("The Current Supplier is not available");
	}
	
	}
	else if(way.contains("Round-Way")||way.contains("Half-Round-Trip")||way.contains("Multicity"))
	{		
		DepartureTime.click();
		Thread.sleep(500);
	    System.out.println("The Currrant Departure Time is :"+Departure);
		// All RBD Names
		List<WebElement> AllDeparture= driver.findElements(By.xpath("//ul[@class='theme4_dropdown_value_container__UAQJN']//span[@class='theme4_advTitle__GzPon']"));
		if (AllDeparture.size() > 0) {
			// Iterate through the list and find the matching fare type
			for (int i = 0; i < AllDeparture.size(); i++) {
				WebElement searchText = AllDeparture.get(i);
				String current_dt = searchText.getText();
				System.out.println("The Departure check :"+current_dt);
				if (current_dt.equalsIgnoreCase(Departure)) {
					AllDeparture.get(i).click();
					break;
				}
			}
		} else {
			System.out.println("The Current Supplier is not available");
		}
		Thread.sleep(1000);

		ReturnDepartureTime.click();
		Thread.sleep(500);
	    System.out.println("The Currrant Departure Time is :"+Departure);
		// All RBD Names
		List<WebElement> AllDeparture1= driver.findElements(By.xpath("//ul[@class='theme4_dropdown_value_container__UAQJN']//span[@class='theme4_advTitle__GzPon']"));
		if (AllDeparture1.size() > 0) {
			// Iterate through the list and find the matching fare type
			for (int i = 0; i < AllDeparture1.size(); i++) {
				WebElement searchText = AllDeparture1.get(i);
				String current_dt = searchText.getText();
				System.out.println("The Departure check :"+current_dt);
				if (current_dt.equalsIgnoreCase(Departure)) {
					AllDeparture1.get(i).click();
					break;
				}
			}
		} else {
			System.out.println("The Current Supplier is not available");
		}
		
		
	}

	
	
	
	
					
			     
		Thread.sleep(1000);
	}

public void checksearchresult(WebDriver driver) throws InterruptedException
{
	
	Thread.sleep(1000);
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Search']")));
   	 
   CommonMethodes.scrollDown2(driver);

	WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/h1[1]"));


	    if(	ele.getText().contentEquals("0 Results"))
	    {
	    	
			WebElement refresh = driver.findElement(By.xpath("//button[normalize-space()='Reset filter']"));

	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",refresh);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",refresh );
	    	
	    }
	    
		Thread.sleep(1000);

}

	

	public void selectFareTypeFlight(WebDriver driver, String fareType,Boolean SearchType,String way) throws InterruptedException {
		
		
		System.out.println("Current fare Type is :"+fareType);
		System.out.println("Current Trip Type is :"+way);

		
		
		if(SearchType) {
			
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Search']")));
		    Thread.sleep(500);
		    CommonMethodes.scrollDown3(driver);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Airlines']")));
			
		}
		else {
			
			
				if(way.contains("One-Way")||way.contains("Round-Way")||way.contains("Multicity")) {
					
				 try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
					 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='theme4_btn_primary__aMZOB theme4_booknow_btn_mg__f0haC'][normalize-space()='Book'])[1]")));
					Thread.sleep(100);
					CommonMethodes.scrollDown2(driver);
					Thread.sleep(100);
					
					} catch (InterruptedException e) {
						  System.err.println("Error: No results found" + fareType);
					        // Fail the test case
					        Assert.fail("Error: No results found " + fareType);
					        driver.close();
					}
				
				}
				
		
		    
		 
			
		    }
		
		
		
	

		    	
			if(way.contains("One-Way")||way.contains("Round-Way")||way.contains("Multicity")) 
			{

			
				// Find all elements for refundable and non-refundable flights
				List<WebElement> FareType = driver.findElements(By.xpath("//div[@class='theme4_refundflight__Tk_cD']"));

				// Find all book flight buttons
				List<WebElement> BookButton= driver.findElements(By.xpath("//button[@class='theme4_btn_primary__aMZOB theme4_booknow_btn_mg__f0haC']"));

				
				// Check if there are any refundable or non-refundable flights found	
				if (FareType.size() > 0) {
				    boolean isMatchFound = false; // Flag to check if a match is found

					// Iterate through the list and find the matching fare type
					for (int i = 0; i < FareType.size(); i++) {
						WebElement searchText = FareType.get(i);
						String current_dt = searchText.getText();
						if (current_dt.equalsIgnoreCase(fareType)) {
							System.out.println("Fare type match condition true for: " + current_dt);
							
							if(i==0) {	
								
								((JavascriptExecutor) driver).executeScript("arguments[0].click();", BookButton.get(i));
							}
							else {
								
							// Click the corresponding book flight button
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",BookButton.get(i));
							((JavascriptExecutor) driver).executeScript("arguments[0].click();", BookButton.get(i));
							
							}
							
						    isMatchFound = true;
							break;
						
						}
					
					}
					
					   if (!isMatchFound) {
					        System.err.println("Error: No matching fare type found for: " + fareType);
					        // Fail the test case
					        Assert.fail("Error: No matching fare type found for: " + fareType);
					        driver.close();
					    }
				}
				

				
				
				Thread.sleep(5000); // Pause to observe the click action (optional)

			
			}
			else if(way.contains("Half-Round-Trip")){
				

			   	 
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
					 WebElement radio1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_leftWd__BLl63']//div[1]//div[1]//div[1]//div[2]//input[1]")));
					 Thread.sleep(1000);
					 
					 if(fareType.contentEquals("Refundable")) {
					 WebElement elemnet = radio1.findElement(By.xpath("((//div[@class='theme4_depart_from__IwDfX'])[5]//label[@class='theme4_checkbox_common__tRblA'])[1]"));
					 Thread.sleep(500);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);
					 Thread.sleep(2000);
					 }
					  else if (fareType.contentEquals("Non Refundable")) {
						 
						   WebElement elemnet = radio1.findElement(By.xpath("((//div[@class='theme4_depart_from__IwDfX'])[5]//label[@class='theme4_checkbox_common__tRblA'])[2]"));
						     Thread.sleep(500);
						 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
						 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);
						     Thread.sleep(2000);
					 }
					 
					    driver.findElement(By.xpath("//div[@class='theme4_leftWd__BLl63']//div[1]//div[1]//div[1]//div[2]//input[1]")).click();
					     Thread.sleep(500);
					        driver.findElement(By.xpath("//div[@class='theme4_rightWd__kjlGu']//div[1]//div[1]//div[1]//div[2]//input[1]")).click();
					     Thread.sleep(1000);
                       driver.findElement(By.xpath("//button[normalize-space()='Book Now']")).click();
					 
					 Thread.sleep(5000);
				
			
			}
	
			
	}
	
	

	public void selectFareTypeFlighthalfroundtrip(WebDriver driver, String fareType) throws InterruptedException {
		
		
		
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement radio1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_leftWd__BLl63']//div[1]//div[1]//div[1]//div[2]//input[1]")));
		     Thread.sleep(1000);
		     
		     if(fareType.contentEquals("Refundable")) {
		     WebElement elemnet = radio1.findElement(By.xpath("((//div[@class='theme4_depart_from__IwDfX'])[5]//label[@class='theme4_checkbox_common__tRblA'])[1]"));
		     Thread.sleep(500);
		 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
		 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);
		     Thread.sleep(2000);
		     }
		      else if (fareType.contentEquals("Non Refundable")) {
		    	 
		    	   WebElement elemnet = radio1.findElement(By.xpath("((//div[@class='theme4_depart_from__IwDfX'])[5]//label[@class='theme4_checkbox_common__tRblA'])[2]"));
				     Thread.sleep(500);
				 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemnet);
				 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemnet);
				     Thread.sleep(2000);
		     }
		     
	            driver.findElement(By.xpath("//div[@class='theme4_leftWd__BLl63']//div[1]//div[1]//div[1]//div[2]//input[1]")).click();
			     Thread.sleep(500);
		            driver.findElement(By.xpath("//div[@class='theme4_rightWd__kjlGu']//div[1]//div[1]//div[1]//div[2]//input[1]")).click();
			     Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='Book Now']")).click();
		     
		     Thread.sleep(5000);

		    
	}

	public void checkFareDetails(WebDriver driver) throws InterruptedException {
		




		// Extract fare details
		Map<String, Double> fareDetails = new HashMap<>();
		String[] fareLabels = { "Total Base Fare", "My Earning (Incl. of Taxes)", "Total Taxes", "Seats", "Mealss",
				"Baggage", "Platform Fees:", "GST:" };

		// below line used for to get fare details all lable list
		List<WebElement> lableList = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_flight_base_fare__pLY6w']//div[1]//p"));
		int labelSize = lableList.size();

		List<WebElement> priceList = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_flight_base_fare__pLY6w']//div[2]//p"));
		int priceSize = priceList.size();

		List<WebElement> lableListone = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_taxes_gst_service__9W1Da']//div[1]//p"));
		int labelSizeone = lableListone.size();

		List<WebElement> priceListone = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_taxes_gst_service__9W1Da']//div[2]//p"));
		int priceSizeone = priceListone.size();



		for (int i = 0; i < labelSize; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableList.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceList.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		for (int i = 0; i < labelSizeone; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableListone.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceListone.get(i).getText().trim().replace(",", "")));

//					fareDetails.put(label, Double.parseDouble(priceListone.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		if (driver.findElements(By.xpath("//p[normalize-space()='Local Taxes (if applicable)']")).size() > 0) {

			WebElement localTaxElement = driver.findElement(By.xpath(
					"//div[@class='theme4_flight_base_ticket_price__OWEX3']//input[@placeholder='Enter Amount']"));
			System.out.println("local taxes if applicable--" + localTaxElement.getText());
			fareDetails.put("Local Taxes (if applicable)", Double.parseDouble(localTaxElement.getAttribute("value").trim().replace(",", "")));

		}

		double finalTotalAmount = fareDetails.values().stream().mapToDouble(Double::doubleValue).sum();

		// Print the fare details and total amount
		System.out.println("Fare Details:");
		fareDetails.forEach((label, value) -> System.out.println(label + ": " + value));
		System.out.println("Final Total Amount: " + finalTotalAmount);

		// this line check total amount calculation
		if (driver.findElements(By.xpath("//b[normalize-space()='Total Amount']")).size() > 0) {

			WebElement totalElement = driver.findElement(By.xpath("//span[@id='final_flight_amt']"));
			double totalAmt = Double.parseDouble(totalElement.getText().trim().replace(",", ""));
			

			System.out.println("Final Amount after all calculation :" + finalTotalAmount);
			System.out.println("Total amount is : " + totalAmt);

			  BigDecimal value = new BigDecimal(finalTotalAmount);
		        value = value.setScale(3, RoundingMode.HALF_UP);
			        System.out.println("finalTotalAmount : " + value);
			        
			        BigDecimal value1 = new BigDecimal(totalAmt);
			        value1 = value1.setScale(3, RoundingMode.HALF_UP);
				        System.out.println("totalAmt  : " + value1);
				
				        double Diff = finalTotalAmount-totalAmt;
				        System.out.println("The Value Differance is :"+Diff);

			assertEquals(value, value1,"The final calculated amount  "+value+"  and total amount  "+value1+"  to paid are not matching getting differance "+Diff+" The test cases is failed ");

		}

	}

	public void select_supplier(WebDriver driver) throws InterruptedException {

		// input[@placeholder='Select Supplier']
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement supplierCheckBox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select Supplier']")));
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)", supplierCheckBox);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", supplierCheckBox);

//		CommonMethodes.ScrollingView(driver, supplierCheckBox);
		supplierCheckBox.click();
//		List<WebElement> allsupplierlist = driver
//				.findElements(By.xpath("//ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li"));

//		List<WebElement> checkBoxList = driver.findElements(
//				By.xpath("//ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li//span[2]"));
//		int checkBoxListSize = checkBoxList.size();
//
//		List<WebElement> supplierNames = driver.findElements(
//				By.xpath("//ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li//span[2]"));
//		int supplierNameSize = supplierNames.size();

		List<WebElement> checkBoxList = driver.findElements(
				By.xpath("//ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li//span[2]"));
		int checkBoxListSize = checkBoxList.size();

		List<WebElement> supplierNames = driver.findElements(
				By.xpath("//ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li//span[2]"));
		int supplierNameSize = supplierNames.size();

		// ul[@class='multiSelectDropDown_dropdown_value_container__vWFcB']//li//span[1]//input[@type='checkbox']

		for (int i = 0; i < supplierNameSize; i++) {
			String name = supplierNames.get(i).getText();

			if (name.equalsIgnoreCase("galileobah_37TN")) {
				System.out.println("Supplier Name Match Founds !.");
				checkBoxList.get(i).click();
				Thread.sleep(3000);
				break;
			} else {
				System.out.println("Supplier Name Match Not Founds !.");
			}

		}

//		
//		WebElement wb1 = driver.findElement(
//				By.xpath("//input[@id='galileobah_37TN']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb1);
//		Thread.sleep(1000);

	}

	public void selectFareType(WebDriver driver, String fareType) throws InterruptedException {


		if (fareType.equalsIgnoreCase("Refundable")) {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Book')])[2]")));
			WebElement Refundable = checkbox.findElement(By.xpath("//label[normalize-space()='Refundable']"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Refundable);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Refundable);
			
		


		} else {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Book')])[2]")));
			WebElement NonRefundable = checkbox.findElement(By.xpath("//label[normalize-space()='Non - Refundable']"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NonRefundable);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",NonRefundable);


		}

	}

	public void loaderLoading(WebDriver driver, String markType) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Book);

		if (markType.equalsIgnoreCase("markup")) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", "//input[@id='markup']");
		} else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", "//input[@id='markdown']");
		}

	}

	public void selectMarkType(WebDriver driver, boolean markType) throws InterruptedException {

	 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='markdown']")));
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		
		if(markType) 
		{
			
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", markDownRadio);
        }
	

	}

	public void selectStops(WebDriver driver, String noStops) throws InterruptedException {

		System.out.println("------ user select number of stops ----------");
		
		
		
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Search']")));
		    Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		    Thread.sleep(1000);
		    
			if (noStops.equalsIgnoreCase("0")) {
				WebElement selectStops = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='0']")));
				selectStops.click();
			    Thread.sleep(1000);

			} else if (noStops.equalsIgnoreCase("1")) {
				WebElement selectStops = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='1']")));
				selectStops.click();
			    Thread.sleep(1000);

			} else if (noStops.equalsIgnoreCase("2+")) {
				WebElement selectStops = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='2+']")));
				selectStops.click();
			    Thread.sleep(1000);

			}
		     
			
		

		
	


	}
	
	public void HandelThePriceChangeAlert(WebDriver driver) {

		
		
		
		   	 try {
		 		System.out.println("------ user handel the Price Change Alert Popup ----------");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_alertbutton__BBU3G']")));
				 popup.findElement(By.xpath("//div[@class='theme4_alertbutton__BBU3G']")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	
		     
			
		

		
	


	}

	public void selectPriceRange1(WebDriver driver, int low, int high) throws InterruptedException {

		try {
			Thread.sleep(5000);
			System.out.println("---- Price Range Low-High value is ----" + low + " " + high);
			// Wait for the price filter element to be visible
//			WebElement priceFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("price-filter")));

			// Interact with the price filter slider (assuming it's a range slider)
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement minPriceSlider = wait1.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='MuiBox-root jss1']//span[3]")));

//			System.out.println("minPriceSlider Location: " + minPriceSlider.getLocation());
//			System.out.println("minPriceSlider Size: " + minPriceSlider.getSize());
//			System.out.println("minPriceSlider Size width: " + minPriceSlider.getSize().getWidth());

			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
			WebElement maxPriceSlider = wait2.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='MuiBox-root jss1']//span[4]")));

//			System.out.println("maxPriceSlider Location: " + maxPriceSlider.getLocation());
//			System.out.println("maxPriceSlider Size: " + maxPriceSlider.getSize());
//			System.out.println("maxPriceSlider Size width: " + maxPriceSlider.getSize().getWidth());

//			WebElement minPriceSlider = driver.findElement(By.xpath("//div[@class='MuiBox-root jss1']//span[3]"));
//			WebElement maxPriceSlider = driver.findElement(By.xpath("//div[@class='MuiBox-root jss1']//span[4]"));

			// Adjust the sliders (this will depend on the implementation of your price
			// filter)
			// Example: move the sliders to desired positions
			// This might involve sending keys or using Actions class to drag and drop
			// sliders

			int minSlider = minPriceSlider.getSize().width;
			int maxSlider = maxPriceSlider.getSize().width;

			System.out.println("min-max slider value are" + " " + minSlider + " " + "maxSlider" + maxSlider);
			// Example using Actions class to drag sliders
			Actions move = new Actions(driver);
			move.dragAndDropBy(minPriceSlider, minSlider * 11, 0).perform(); // Move min slider to the right
			move.dragAndDropBy(maxPriceSlider, maxSlider * 101, 0).perform(); // Move max slider to the left

//			Thread.sleep(500000000);

			/*
			 * This line chekcs for list flight available
			 */
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
			WebElement filteredResults = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_tile_main__Eivwa']")));

			// Verify the filtered results are displayed
			assert (filteredResults.isDisplayed());
		} catch (Exception e) {

			System.out.println("selectPriceRange error :" + e);
		}

	}

	public void selectPriceRange2(WebDriver driver, int low, int high) throws InterruptedException {
		try {
			Thread.sleep(5000); // This should ideally be replaced with an explicit wait
			System.out.println("---- Price Range Low-High value is ---- " + low + " " + high);

			// Wait for the price filter sliders to be visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

			// Find the minimum price slider element
			WebElement minPriceSlider = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='MuiBox-root jss1']//span[3]")));

			// Find the maximum price slider element
			WebElement maxPriceSlider = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='MuiBox-root jss1']//span[4]")));

			// Get slider width (we're assuming both sliders have the same width here)
			int sliderWidth = minPriceSlider.getSize().width;
			System.out.println("Slider width: " + sliderWidth);

			// Calculate offsets (adjust these based on your specific UI requirements)
			int minSliderOffset = (int) (sliderWidth * (low / 100.0)); // Move percentage-wise
			int maxSliderOffset = (int) (sliderWidth * (high / 100.0)) - sliderWidth; // Adjust for max slider

			// Scroll sliders into view if necessary
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", minPriceSlider);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", maxPriceSlider);

			// Use Actions to drag the sliders
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(minPriceSlider, minSliderOffset, 0).perform(); // Adjust low price
			actions.dragAndDropBy(maxPriceSlider, maxSliderOffset, 0).perform(); // Adjust high price

			// Wait for the filtered results to appear
			WebElement filteredResults = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_tile_main__Eivwa']")));

			// Verify that filtered results are displayed
			if (filteredResults.isDisplayed()) {
				System.out.println("Filtered results displayed successfully.");
			} else {
				System.out.println("Filtered results not displayed.");
			}
		} catch (Exception e) {
			System.out.println("selectPriceRange error: " + e);
		}
	}

	public void selectDynamicPriceRange(WebDriver driver) throws InterruptedException {
		
		
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Search']")));
		     Thread.sleep(500);
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");	
		     Thread.sleep(500);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiBox-root jss1']//span[3]")));
		     Thread.sleep(500);
		     DragStart.getLocation();

				int xside=DragStart.getSize().width;
				int xside1=DragEnd.getSize().width;

			Actions act=new Actions(driver);
			act.dragAndDropBy(DragStart, xside*6, 0).build().perform();
				     
		     Thread.sleep(1000);
		     
		 

		     
		
		  
	}

	public void selectDynamicTimeRange(WebDriver driver) throws InterruptedException {
		
		
	   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Search']")));
	     Thread.sleep(500);
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");	
	     Thread.sleep(500);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_filter_trip_duration__gkOGQ']//span[3]")));
	     Thread.sleep(500);
	     
	     DurationStart.getLocation();

			int xside=DurationStart.getSize().width;
			int xside1=DurationEnd.getSize().width;

		Actions act=new Actions(driver);
		act.dragAndDropBy(DurationStart, xside*6, 0).build().perform();
			     
	     Thread.sleep(1000);
	     
	 

	     
	
	  
}

	public void enterLocalTaxes(WebDriver driver, String localTax) throws InterruptedException {

		System.out.println("---- enterLocalTaxes value is ----" + localTax);
		localTaxLocator.click();
		localTaxLocator.sendKeys(localTax);

	}

	public void selectPercentOrFlat(WebDriver driver, boolean isPercentToggle,String Percentage) throws InterruptedException {

		System.out.println("Is Percentage : " + isPercentToggle);
		
		if(!isPercentToggle)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='theme4_btnDay___Bbbt']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='markValue']")).sendKeys(Percentage);
			Thread.sleep(500);

		
			
		}
		else if(isPercentToggle) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='markValue']")).sendKeys(Percentage);
			Thread.sleep(500);
			
		}
		
		
	}



	public void enterFlatValue(WebDriver driver, String flat) throws InterruptedException {

		System.out.println("---- enterFlatValue value is ----" + flat);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement percentageValueElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='markValue']")));
		percentageValueElement.click();
		percentageValueElement.sendKeys(flat);

	}

	public void waitLoadingLogo(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
				"//img[@src='https://services-api.vetravel.io/shared/api/media/6543a1e263f366794276a368/989707634DDBHLoader.gif']")));

	}

	public void waitDataLoadingBar(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//div[@class='theme4_loader_main__MBAGK undefined']")));

	}

}

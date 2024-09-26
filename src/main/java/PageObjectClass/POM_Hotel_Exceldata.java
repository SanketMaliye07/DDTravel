package PageObjectClass;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

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


import utils.CommonMethodes;

public class POM_Hotel_Exceldata {
	

	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="//button[normalize-space()='Sign In']")private WebElement Login;
	@FindBy(xpath="//span[@class='Desktop_serv_flx__tLpIp']//li[@class='Desktop_inactive__VefRT']")private WebElement clickHotel;
	@FindBy(xpath="(//input[@id='myTextField'])[1]")private WebElement SearchCity;
	@FindBy(xpath="(//input[@id='myTextField'])[1]")private WebElement SearchCityname;
	@FindBy(xpath="(//div[@id='hotelData'])[1]")private WebElement selectCity;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement calander;
	@FindBy(xpath="(//span[@class='theme4_vt_country_select_container__vp3GT'])[1]")private WebElement Select_Nationality;
	@FindBy(xpath="//span[normalize-space()='Indian']")private WebElement indian;

	
	
	@FindBy(xpath="(//div[@class='theme4_hotel_search_column__a47HJ theme4_hotel_search_accomodation__20HyS'])[1]")private WebElement Passanger;	


	@FindBy(xpath="//tbody/tr/td[2]/div[1]/span[2]//*[name()='svg']")private WebElement Adult;
	@FindBy(xpath="//tbody/tr/td[2]/div[1]/span[1]//*[name()='svg']")private WebElement Adultsubtract;
    @FindBy(xpath="//tbody/tr/td[3]/div[1]/span[2]//*[name()='svg']")private WebElement child;
    @FindBy(xpath="//input[@placeholder='Child 1 Age']")private WebElement Room1chilage1;
	@FindBy(xpath="//input[@placeholder='Child 2 Age']")private WebElement Room1chilage2;	
	@FindBy(xpath="//input[@placeholder='Child 3 Age']")private WebElement Room1chilage3;
	@FindBy(xpath="//input[@placeholder='Child 4 Age']")private WebElement Room1chilage4;
	@FindBy(xpath="(//div[@class='theme4_age_list_ele__qEwZi'])[3]")private WebElement ChildAgeRoom1;

	
    
	@FindBy(xpath="//p[normalize-space()='ADD ROOM']")private WebElement AddRoom2;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[2]/*[name()='svg'][1]")private WebElement Room2Adult;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[2]/*[name()='svg'][1]")private WebElement Room2child;
    @FindBy(xpath="(//input[@placeholder='Child 1 Age'])[2]")private WebElement Room2chilage1;
    @FindBy(xpath="(//input[@placeholder='Child 2 Age'])[2]")private WebElement Room2chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[6]")private WebElement Room2chilage3;
	@FindBy(xpath="(//div[@class='theme4_age_list_ele__qEwZi'])[2]")private WebElement Room2selectAge;
	
	
	@FindBy(xpath="//p[normalize-space()='ADD ROOM']")private WebElement AddRoom3;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[2]/*[name()='svg'][1]")private WebElement Room3Adult;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[2]/*[name()='svg'][1]")private WebElement Room3child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[7]")private WebElement Room3chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[8]")private WebElement Room3chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[9]")private WebElement Room3chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement Room3selectAge;
	
	 
	@FindBy(xpath="//p[normalize-space()='ADD ROOM']")private WebElement AddRoom4;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[2]")private WebElement Room4Adult;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[2]/*[name()='svg'][1]")private WebElement Room4child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[10]")private WebElement Room4chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[11]")private WebElement Room4chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[12]")private WebElement Room4chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement Room4selectAge;
	
	@FindBy(xpath="(//p[normalize-space()='ADD ROOM'])[1]")private WebElement AddRoom5;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[31]")private WebElement Room5Adult;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[33]")private WebElement Room5child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[34]")private WebElement Room5chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[35]")private WebElement Room5chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[36]")private WebElement Room5chilage3;
	@FindBy(xpath="(//div[@class='theme2_age_list_ele__CRcn3'])[4]")private WebElement Room5selectAge;

	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[8]")private WebElement selectchaildAge2;
	@FindBy(xpath="(//div[@class='theme2_age_list_ele__CRcn3'])[4]")private WebElement ChildAge2;


	@FindBy(xpath="//input[@value='Done']")private WebElement Done;
	@FindBy(xpath="//button[normalize-space()='Search']")private WebElement Search;
	
	@FindBy(xpath="(//button[@class='theme4_srp_desktop_btn__a_Cdn theme4_srp_tab_btn__K3_7j'][normalize-space()='Select'])[1]")private WebElement selectHotel;
	@FindBy(xpath="(//button[@class='theme4_srp_desktop_btn__aQOWM theme4_srp_tab_btn__slXIC'][normalize-space()='Select'])[1]")private WebElement selectRoom;
	
	@FindBy(xpath="(//button[normalize-space()='Continue'])[1]")private WebElement Continue_Booking;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")private WebElement continubutton;
	@FindBy(xpath="//span[@class='theme2_ax_checkmark__qkZ7Y']")private WebElement chekmarkterms;
	@FindBy(xpath="//button[@id='payment_btn']")private WebElement proceedpayment;
	
	
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[1]")private WebElement AdultFoeRoom1;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[2]")private WebElement AdultFoeRoom2;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[3]")private WebElement AdultFoeRoom3;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[4]")private WebElement AdultFoeRoom4;
	
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[1]")private WebElement SelectAdult1;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[2]")private WebElement SelectAdult2;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[3]")private WebElement SelectAdult3;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[4]")private WebElement SelectAdult4;
	
	@FindBy(xpath="(//input[@id='pan_no_0'])[1]")private WebElement PassPAN1;
	@FindBy(xpath="(//input[@id='pan_no_1'])[1]")private WebElement PassPAN2;
	@FindBy(xpath="(//input[@id='pan_no_2'])[1]")private WebElement PassPAN3;
	@FindBy(xpath="(//input[@id='pan_no_3'])[1]")private WebElement PassPAN4;


	@FindBy(xpath="(//input[@id='title_0'])[1]")private WebElement Title1;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr1;
	@FindBy(xpath="(//input[@id='first_name_0'])[1]")private WebElement first_name_01;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[1]")private WebElement LastName1;
	@FindBy(xpath="(//input[@id='email_0'])[1]")private WebElement email_01;
	@FindBy(xpath="(//input[@id='phone_no_0'])[1]")private WebElement phone_no_01;
	@FindBy(xpath="(//input[@id='pan_no_0'])[1]")private WebElement pan_no_01;


	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[3]")private WebElement Title2;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr2;
	@FindBy(xpath="(//input[@id='first_name_1'])[1]")private WebElement first_name_02;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[2]")private WebElement LastName2;
	@FindBy(xpath="(//input[@id='email_1'])[1]")private WebElement email_02;
	@FindBy(xpath="(//input[@id='phone_no_1'])[1]")private WebElement phone_no_02;
	@FindBy(xpath="(//input[@id='pan_no_1'])[1]")private WebElement pan_no_02;


	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[5]")private WebElement Title3;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr3;
	@FindBy(xpath="(//input[@id='first_name_2'])[1]")private WebElement first_name_03;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[3]")private WebElement LastName3;
	@FindBy(xpath="(//input[@id='email_2'])[1]")private WebElement email_03;
	@FindBy(xpath="(//input[@id='phone_no_2'])[1]")private WebElement phone_no_03;
	@FindBy(xpath="(//input[@id='pan_no_2'])[1]")private WebElement pan_no_03;
	
	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[7]")private WebElement Title4;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr4;
	@FindBy(xpath="(//input[@id='first_name_3'])[1]")private WebElement first_name_04;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[4]")private WebElement LastName4;
	@FindBy(xpath="(//input[@id='email_3'])[1]")private WebElement email_04;
	@FindBy(xpath="(//input[@id='phone_no_3'])[1]")private WebElement phone_no_04;
	@FindBy(xpath="(//input[@id='pan_no_3'])[1]")private WebElement pan_no_04;
	
	@FindBy(xpath="(//button[contains(text(),'Continue')])[1]")private WebElement ContinueAlertButton;

	@FindBy(xpath="(//button[@type='button'])[3]")private WebElement Advanced_Search;
	@FindBy(xpath="(//div[@class='theme4_adv_flx__TVnxV'])[1]")private WebElement Select_Fare_Type;
	@FindBy(xpath="(//input[@name='room_type'])[1]")private WebElement refundable;
	@FindBy(xpath="(//input[@name='room_type'])[2]")private WebElement Nonrefundable;
	
	@FindBy(xpath="//span[@id='percent']")private WebElement selectpercent;
	@FindBy(xpath="//label[normalize-space()='Mark Down']")private WebElement selectMarkdown;

	@FindBy(xpath="//input[@id='0']")private WebElement passpercent;
	@FindBy(xpath="//input[@id='inputId']")private WebElement passlocaltaxes;


	@FindBy(xpath="(//div[@class='theme4_adv_main_bx__K7XQ5'])[2]")private WebElement select_Brekfast;
	@FindBy(xpath="(//input[@name='breakfast'])[2]")private WebElement withBrekfast;
	@FindBy(xpath="(//input[@name='breakfast'])[3]")private WebElement withoutBrekfast;

	@FindBy(xpath="(//div[@class='theme4_adv_main_bx__K7XQ5'])[3]")private WebElement SelectStarRating;
	
	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[1]")private WebElement Free_Breakfast;
	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[2]")private WebElement Free_Cancellation;

	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[3]")private WebElement selectstar;
	
	@FindBy(xpath="(//span[@aria-label='Temperature range'])[1]")private WebElement DragStart;
	@FindBy(xpath="(//span[@aria-label='Temperature range'])[2]")private WebElement DragEnd;
	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[8]")private WebElement Amenities;
	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[45]")private WebElement Vacation_Type;
	@FindBy(xpath="(//span[@class='theme4_ax_checkmark__bNgax'])[51]")private WebElement Property_Type;
	
	@FindBy(xpath = "//div[@class='theme4_calendar_wid_main__oD3NA']//input[@id='myTextField']")private WebElement departureCalander;
	
	
	@FindBy(xpath = "//div[@class='theme4_calendar_wid_main__oD3NA']//input[@id='myTextField']")private WebElement returnCalander;
	@FindBy(xpath = "//div[@class='theme4_calendar_head_right_side__1vhml']//span[@class='theme4_calendar_head_icon__x6qAQ']//*[name()='svg']")private WebElement nextMonthLable;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]")private WebElement HotelName;

	


	public POM_Hotel_Exceldata(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	
	public void ValidLogin(String environment,WebDriver driver) throws InterruptedException, IOException
	{
		
		  switch (environment.toLowerCase()) {
       
        
          case "prodb2b2": WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                        	WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        	              email.sendKeys(CommonMethodes.readDataFromPropertyFile("usernameB2B2"));
                          Thread.sleep(100);
                          pass.sendKeys(CommonMethodes.readDataFromPropertyFile("passB2B2"));
	                      Thread.sleep(100);
	                      Login.click();
	                      Thread.sleep(5000);	
              break;
              
          case "prodb2b": 
        	  
        	            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
     	            	WebElement popup1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
     		
        	            email.sendKeys(CommonMethodes.readDataFromPropertyFile("usernameB2B"));
                        Thread.sleep(100);
                        pass.sendKeys(CommonMethodes.readDataFromPropertyFile("passB2B"));
      		            Thread.sleep(100);
      		            Login.click();
      		            Thread.sleep(5000);	  
              break;
              
          case "uatb2b":
        	            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
           	            WebElement popup2= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        	            email.sendKeys(CommonMethodes.readDataFromPropertyFile("usernameB2BUAT"));
                        Thread.sleep(100);
                        pass.sendKeys(CommonMethodes.readDataFromPropertyFile("passB2BUAT"));
                        Thread.sleep(100);
                        Login.click();
                        Thread.sleep(5000);	  
break;
              
          default:
              throw new IllegalArgumentException("Unsupported environment: " + environment);
      }
		
		
	

		
		
	}
	
	public void Select_the_Nationality(WebDriver driver) throws InterruptedException
	{
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='theme4_vt_country_select_container__vp3GT'])[1]")));
			Thread.sleep(1000);		
	   	 popup.click();	
		Thread.sleep(2000);		
		List<WebElement> autosuggest = driver.findElements(By.xpath("//div[@class='theme4_country_name_code__J6kfh']"));
		 for(WebElement Country: autosuggest)
		 {
			 System.out.println(Country.getText());
			 
			 if (Country.getText().contains("Indian")) {
				 Country.click();
                 break;
             }
		 }

			Thread.sleep(1000);		

	}
	
	public void Select_Advanced_Search(WebDriver driver) throws InterruptedException
	{
		Advanced_Search.click();
		Thread.sleep(500);		

	}
	
	
	public void Select_the_FareType(WebDriver driver,String Fare_Type) throws InterruptedException
	{
		Select_Fare_Type.click();
		Thread.sleep(500);
		
		if(Fare_Type.contentEquals("Refundable"))
		{
			refundable.click();
			Thread.sleep(500);		

		}
		else {
			
			Nonrefundable.click();
			Thread.sleep(500);
		}

		

	}
	
	public void Select_the_Brekfastoption(WebDriver driver) throws InterruptedException
	{
	
		select_Brekfast.click();
		Thread.sleep(500);
		withBrekfast.click();
		Thread.sleep(500);


	}
	
	public void Select_the_rating(WebDriver driver,String STAR_RATING) throws InterruptedException
	{	
		Thread.sleep(500);
		SelectStarRating.click();
		Thread.sleep(500);
		
		List<WebElement> starrating = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement rating:starrating)
		{
			String Star = rating.getAttribute("id");
			
			if(Star.equals(STAR_RATING))
			{
				rating.click();
			}
			else {

				for(WebElement checkbox:starrating)
				{
					checkbox.click();}
			}
			
		}

		
		
		

	}
	
	
	public void clickOnHotel(WebDriver driver) throws InterruptedException
	{
		
		clickHotel.click();
		Thread.sleep(1000);
	}
	
	
	public void Search_selectCity(WebDriver driver,String city) throws InterruptedException
	{
		
		SearchCity.click();
		Thread.sleep(1000);
		SearchCityname.sendKeys(city);	
		Thread.sleep(2000);
		 
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));   	 
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_hotel_autocomplete_name__d_Rwx']")));
			List<WebElement> autosuggest = driver.findElements(By.xpath("//div[@class='theme4_hotel_autocomplete_name__d_Rwx']"));
			 for(WebElement Citys: autosuggest)
			 {
				 System.out.println(Citys.getText());
				 
				 if (Citys.getText().contains(city)) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", Citys);
	                 break;
	             }
				 
			     Thread.sleep(200);
 
			 }
		     

		     
		
		
		
//		SearchCity.click();
//		Thread.sleep(2000);
//		SearchCityname.sendKeys(city);
//		Thread.sleep(3000);
//		selectCity.click();
//		Thread.sleep(1000);
		


	System.out.println("The city name is :"+city);
	}
	
	
	
	 
	
	public void SelectDatefortrip(WebDriver driver, String month, String rmonth, String departureDate,
			String returnDate) throws InterruptedException {
		
		Random random = new Random();

		int min = 1;
		int max = 15;
		int min1 = 16;
		int max1 = 30;
		int randomNumberInRange = random.nextInt(max - min) + min;
		int randomNumberInRange1 = random.nextInt(max1 - min1) + min1;
		
		String strNumber = String.valueOf(randomNumberInRange);
		String strNumber1 = String.valueOf(randomNumberInRange1);
		
		
	


   			CommonMethodes.waitForElementToBeVisible(driver, departureCalander, 1);
   			Thread.sleep(1000);
   			selectDate(driver, month, departureDate);

   			
   			Thread.sleep(1000);
   			CommonMethodes.waitForElementToBeVisible(driver, returnCalander, 3);
   			Thread.sleep(500);
   			selectDate(driver, rmonth, returnDate);
   		
    	  

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

	private void selectDate(WebDriver driver, String month, String date) throws InterruptedException {

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		int index;
		while (true) {
			System.out.println("checking while loop");
			String text = driver.findElement(By.xpath("//h3")).getText();
			System.out.println("while current month is " + text);

			List<WebElement> monthYearLabels = driver
					.findElements(By.xpath("//div[@class='theme4_calendar_head_center_side__nSZEn']//h3"));

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
					"//div[@class='theme4_calendar_whole_body__8QLJU'][1]//div[@class='theme4_calendar_day_list__fSlRj']//div[@class='theme4_day_cell_center__uTvYe']//span[@class='']"));
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
					"//div[@class='theme4_calendar_whole_body__8QLJU'][2]//div[@class='theme4_calendar_day_list__fSlRj']//div[@class='theme4_day_cell_center__uTvYe']//span[@class='']"));

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
	
	

	
	public void Select_1Room_1Pass(WebDriver driver,String AdultString,String childString,String RoomString) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Passanger, 1);
		String stringadult =AdultString;
		Integer adult = Integer.valueOf(stringadult);
		System.out.println("No of  Adult is :"+stringadult);
		
		String stringchild = childString;
		Integer Child = Integer.valueOf(stringchild);
		System.out.println("No of  Child is :"+stringchild);

		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		System.out.println("No of  Room is :"+stringRoom);

		
		if(Room==1)
		{
			
		if(adult<=1)
		{for (int i = 0; i < adult; i++) 
		{
						 Adultsubtract.click();	
							
				        }}
		
	 else if(adult>=2)
	{for (int i = 0; i < adult-1; i++) 
					 {
						 Adult.click();	
							
				        }}
		
		for (int i = 0; i < Child; i++) {
		child.click(); 
			
        }
		
		if(Child==1)
		{
			Room1chilage1.click();
			Thread.sleep(100);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(300);
			
		}
		else if(Child==2)
		{
			Room1chilage1.click();
			Thread.sleep(100);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(100);
			Room1chilage2.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			
		}
		else if(Child==3)
		{
			Room1chilage1.click();
			Thread.sleep(100);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
			Thread.sleep(100);
			element1.click();
			Room1chilage2.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			Thread.sleep(100);
			Room1chilage3.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();

		}
		
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(1000);
		
		}
			
		else if(Room==2)
		{
			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-1; i++) 
		{Adult.click();	}}
			Thread.sleep(200);

			for (int i = 0; i < Child; i++) 
			{
			child.click(); 
			Thread.sleep(200);
}
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(300);
				
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}
			
			AddRoom2.click();
			Thread.sleep(100);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);

		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
			
			Room2child.click();
			
			Thread.sleep(100);			

	        }

	   
	   if(Child==1)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			
		}
		else if(Child==2)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
	
		}
		else if(Child==3)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
			Room1chilage3.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);

		}
		Thread.sleep(500);
		WebElement element1 = Done;
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(1000);
		
	   
		}
		else if(Room==3)
		{

			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-1; i++) 
		{Adult.click();	}}
			Thread.sleep(200);

			for (int i = 0; i < Child; i++) 
			{
			child.click(); 
			Thread.sleep(200);
}
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(300);
				
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}
			
			AddRoom2.click();
			Thread.sleep(100);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);

		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
			
			Room2child.click();
			
			Thread.sleep(100);			

	        }

	   
	   if(Child==1)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			
		}
		else if(Child==2)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
	
		}
		else if(Child==3)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
			Room1chilage3.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);

		}
	
   
			
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  
  if(Child==1)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(500);
		
	}
	else if(Child==2)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	else if(Child==3)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);
		Room1chilage3.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	   
	   
	   
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(1000);
		
	   
		
			
			
		}
		else if(Room==4)
		{

			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-1; i++) 
		        {Adult.click();	}}
			Thread.sleep(200);

			for (int i = 0; i < Child; i++) 
			{
			child.click(); 
			Thread.sleep(200);
}
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(300);
				
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=100");
				Thread.sleep(100);
				element1.click();
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}
			
			AddRoom2.click();
			Thread.sleep(100);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);

		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
			
			Room2child.click();
			
			Thread.sleep(100);			

	        }

	   
	   if(Child==1)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			
		}
		else if(Child==2)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(500);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
	
		}
		else if(Child==3)
		{
			Room1chilage1.click();
			Thread.sleep(1000);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(500);
			Room1chilage2.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);
			Room1chilage3.click();
			Thread.sleep(500);
			ChildAgeRoom1.click();
			Thread.sleep(500);

		}
	
   
			
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  
  if(Child==1)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(500);
		
	}
	else if(Child==2)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	else if(Child==3)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);
		Room1chilage3.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	   
	   
	AddRoom4.click();
	
	
for (int i = 0; i < adult-1; i++) 
				 {
	Room4Adult.click();	
						
			        }
	
for (int i = 0; i < Child; i++) {
 Room4child.click(); 
		
 }
	
if(Child==1)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
	}
	else if(Child==2)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	else if(Child==3)
	{
		Room1chilage1.click();
		Thread.sleep(1000);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme4_hotel_room_list_main__jYmrt\"]').scrollTop=500");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(500);
		Room1chilage2.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);
		Room1chilage3.click();
		Thread.sleep(500);
		ChildAgeRoom1.click();
		Thread.sleep(500);

	}
	   
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(1000);
		
	   
		
			
			
		
		}
		else if(Room==5)
		{



			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-2; i++) 
						 {
							 Adult.click();	
								
					        }}
			
			for (int i = 0; i < Child; i++) {
			child.click(); 
				
	        }
			
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}	
			
			AddRoom2.click();
			
		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
		   Room2child.click(); 
				
	        }
			
	   if(Child==1)
		{
		   Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
		}
		else if(Child==2)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			
		}
		else if(Child==3)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage3.click();
			Thread.sleep(100);
			Room2selectAge.click();

		}	
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  if(Child==1)
	{
	   Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
	}
	else if(Child==2)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		
	}
	else if(Child==3)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage3.click();
		Thread.sleep(100);
		Room3selectAge.click();

	}	
	   
	AddRoom4.click();
	
	
for (int i = 0; i < adult-1; i++) 
				 {
	Room4Adult.click();	
						
			        }
	
for (int i = 0; i < Child; i++) {
 Room4child.click(); 
		
 }
	
if(Child==1)
{
 Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
}
else if(Child==2)
{
	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	
}
else if(Child==3)
{
	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage3.click();
	Thread.sleep(100);
	Room4selectAge.click();

} 
	   
AddRoom5.click();


for (int i = 0; i < adult-1; i++) 
			 {
Room5Adult.click();	
					
		        }

for (int i = 0; i < Child; i++) {
Room5child.click(); 
	
}

if(Child==1)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
}
else if(Child==2)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage2.click();
Thread.sleep(100);
Room5selectAge.click();

}
else if(Child==3)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage2.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage3.click();
Thread.sleep(100);
Room5selectAge.click();

} 
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
	   
		
			
			
		
			
		}
		
	
  
	}
	
	
	
	
	
	
	
	
	
	

	public void click_Search(WebDriver driver) throws InterruptedException
	{
		
		WebElement element = Search;
	     CommonMethodes.scrollUp(driver);
			Thread.sleep(500);	
			element.click();
		
		  
	}
	
	public void click_Quick_filter(WebDriver driver) throws InterruptedException
	{
		
		 
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
		  
			 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Free_Breakfast);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Free_Breakfast);
		     	     
			    	  
		
		  
	}
	
	public void click_Star_Rating(WebDriver driver) throws InterruptedException
	{
		
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
		   
			 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectstar);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectstar);
		     
		     

		     
			    	  } catch (Exception e) {System.out.println("The elemnet is not available for select Hotel");}
		
		  
	}
	
	public void click_Price_Range(WebDriver driver) throws InterruptedException
	{
		
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));

			 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",DragStart);
			     Thread.sleep(500);

		     DragStart.getLocation();

				int xside=DragStart.getSize().width;
				int xside1=DragEnd.getSize().width;

			Actions act=new Actions(driver);
			act.dragAndDropBy(DragStart, xside*6, 0).build().perform();
		     Thread.sleep(500);


		     
			    	  } catch (Exception e) {System.out.println("The elemnet is not available for select Hotel");}
		
		  
	}
	
	public void click_Price_Amenities(WebDriver driver) throws InterruptedException
	{
		
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Amenities);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Amenities);
	

		     
			    	  } catch (Exception e) {System.out.println("The elemnet is not available for select Hotel");}
		
		  
	}
	
	public void click_Price_Vacation_Type_filter(WebDriver driver) throws InterruptedException
	{
		
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
	
		 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Vacation_Type);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Vacation_Type);
		

		     
			    	  } catch (Exception e) {System.out.println("The elemnet is not available for select Hotel");}
		
		  
	}
	
	public void click_Price_Property_Type_filter(WebDriver driver) throws InterruptedException
	{
		
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
		  	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Property_Type);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Property_Type);
		
		

		     
			    	  } catch (Exception e) {System.out.println("The elemnet is not available for select Hotel");}
		
		  
	}
	
	
	public void click_Search_For_Rounttrip(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Search, 1);		
		Thread.sleep(5000);	 
		  
	}
	
	public void selectHotel(WebDriver driver) throws InterruptedException
	{
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='theme4_ax_hotels_result_number__S7di4'])[1]")));
		     
		 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectHotel);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectHotel);
		     
			    	  } catch (Exception e) {
			    		  
			    		  System.err.println("Error: No matching fare type found for");
					        // Fail the test case
					        Assert.fail("Error: No matching fare type found for: ");
					        driver.close();				    		  
			    	  }
}

	
	public void Handel_Room_not_available_Popup(WebDriver driver) throws InterruptedException
	{
		 try {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme4_alertbutton__8zRK0']")));
		   
		 driver.findElement(By.xpath("//div[@class='ModalPopupComponent_modal_close__fOtZP']//*[name()='svg']")).click();
		    

		     
			    	  } catch (Exception e) {System.out.println("The popup is not Available");}
}
	
	
	public void selectRoom(WebDriver driver,String FareType) throws InterruptedException
	{
    
    Set<String> handel = driver.getWindowHandles();  
    Iterator<String> it = handel.iterator();   
    String parantwindow = it.next();
    String childwindow = it.next(); 
    driver.switchTo().window(childwindow);
    Thread.sleep(500);
    

	
	   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='calender'])[1]")));
	     Thread.sleep(500);
	     String Name = HotelName.getText();
	     System.out.println("The Currant Hotel Name is :"+Name);

	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,850)", "");
	    // selectRoom.click();
	    Thread.sleep(2000);

	     
	     // Locate the list of rooms
	     List<WebElement> rooms = driver.findElements(By.xpath("//*[text()='Starting From']"));

	     System.out.println("Number of rooms: " + rooms.size());

	     boolean ticketFound = false;

	     // Define a loop control variable for the main room iteration
	     boolean continueIteration = true;

	     while (continueIteration) {
	         // Iterate through each room
	         for (WebElement room : rooms) {
	             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", room);
	             room.click();
	             wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'theme4_fully_refundable__BXoIe')]"))); // Ensure the room details are fully expanded

	             // Re-locate the select buttons and tickets after expanding room details
	             List<WebElement> selectors = driver.findElements(By.xpath("//button[@class='theme4_srp_desktop_btn__aQOWM theme4_srp_tab_btn__slXIC'][normalize-space()='Select']"));
	             List<WebElement> tickets = driver.findElements(By.xpath("//div[@class='theme4_fully_refundable__BXoIe']//p[1]"));

	             // Interact with the tickets
	             for (int i = 0; i < tickets.size(); i++) {
	                 WebElement ticket = tickets.get(i);
	                 WebElement selectButton = selectors.get(i);

	                 String text = ticket.getText();
	                 System.out.println("The ticket Fare Type is: " + text);
	                 System.out.println("The ticket Fare Type from the excel sheet is: " + FareType);

	                 if (text.equals(FareType)) {
	                     try {
	                    	 
	                         if (i == 0) {
	                             // Directly click the select button if i == 0
		 							((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectors.get(i));
	                         } else {
	                        	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectors.get(i));
	 							((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectors.get(i));
	                         }
	                         ticketFound = true;
	                         continueIteration = false; // Stop the outer loop
	                         break; // Exit the  inner loop if the ticket is found
	                     } catch (Exception e) {
	                         System.out.println("Failed to click the select button: " + e.getMessage());
	                     }
	                 }
	             }

	             if (ticketFound) {
	                 break; // Exit the outer loop if the ticket is found
	             }
	         }

	         if (!ticketFound) {// Store the flag to check if the first XPath has been used
	        	 boolean firstXPathUsed = false;

	        	 while (!ticketFound && continueIteration) {
	        	     try {
	        	         String nextButtonXPath;

	        	         if (!firstXPathUsed) {
	        	             // Use the first XPath only once
	        	             nextButtonXPath = "//div[@class='theme4_hotel_room_types__2d_mQ theme4_hotel_details_body__Y607w']//img[@alt='arrow']";
	        	             firstXPathUsed = true;
	        	         } else {
	        	             // Use the second XPath for all subsequent clicks
	        	             nextButtonXPath = "(//img[@alt='arrow'])[3]";
	        	         }

	        	         try {
	        	             WebElement nextButton = driver.findElement(By.xpath(nextButtonXPath));
	        	             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
	        	             nextButton.click();

	        	             try {
	        	                 // Wait for the new elements to load after clicking the next button
	        	                 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()='Starting From']")));

	        	                 // Re-locate the list of rooms after clicking next
	        	                 List<WebElement> room = driver.findElements(By.xpath("//*[text()='Starting From']"));

	        	                 System.out.println("Number of rooms after clicking next: " + room.size());
	        	             } catch (Exception e) {
	        	                 System.out.println("Failed to find rooms after clicking next: " + e.getMessage());
	        	                 continueIteration = false; // Stop the loop if rooms are not found after clicking next
	        	             }
	        	         } catch (Exception e) {
	        	             System.out.println("Failed to find or click the next button using XPath: " + nextButtonXPath);
	        	             continueIteration = false; // Stop the loop if next button is not found or fails to click
	        	         }

	        	     } catch (Exception e) {
	        	         System.out.println("Exception occurred: " + e.getMessage());
	        	         continueIteration = false; // Stop the loop in case of an exception
	        	     }
	        	 }
}
	     }

	     if (ticketFound) {
	         System.out.println("Ticket matching the Fare Type found and clicked.");
	     } else {
	    	  System.err.println("Error: No matching fare type found for: " + FareType);
		        // Fail the test case
		        Assert.fail("Error: No matching fare type found for: " + FareType);
		        driver.close();	     }
     
	     Thread.sleep(2000);

     
	   

	    }
	
	public void AddMarkupinpercentage(WebDriver driver,boolean isMark_Down) throws InterruptedException
	{
		
		if(isMark_Down)
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/h2[1]")));
		     Thread.sleep(500);
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectMarkdown);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectMarkdown);
			
				Thread.sleep(1000);
		}
		
		
	
	}
	
	
	public void AddMarkupinFixedtype(WebDriver driver,boolean ispersent,String percentflatvalue) throws InterruptedException
	{	 
		
		if(ispersent) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/h2[1]")));
		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectpercent);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectpercent);	
		     passpercent.sendKeys(percentflatvalue); 

		}
		else {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		   	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/h2[1]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectpercent);
		     passpercent.sendKeys(percentflatvalue); 

			
		}
		
	

	}
	
	public void Addlocaltaxes(WebDriver driver,String LOCAL_TAX) throws InterruptedException
	{ WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
  	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/h2[1]")));
	   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",passlocaltaxes);
		passlocaltaxes.sendKeys(LOCAL_TAX);
		
	}
	
	public void Calculate_the_AmountOnReviewPage(WebDriver driver) throws InterruptedException
	{


		// This line scroll to fare detail section
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)","");

		// Extract fare details	
		java.util.Map<String,Double> fareDetails=new java.util.HashMap<>();
		
		//We add all lables in String 
		String[] fareLabels = { "Hotel Charges", "My Earning (Incl. of Taxes)", "Taxes", "Seats", "Mealss",
				"Baggage", "Platform Fees:", "GST:" };
		

		// below line used for to get Hotel Charges
		List<WebElement> lableList = driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//p[normalize-space()='Hotel Charges']"));
		int labelSize = lableList.size();
		
		// below line used for to get Hotel Charges Amount
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_person_count__JUIb8']"));
		int priceSize = priceList.size();

		// below line used for to get Taxes
		List<WebElement> lableList1 = driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_taxes_1__uDttO']"));
		int labelSize1 = lableList1.size();

		// below line used for to get Taxes Amount
		List<WebElement> priceList1 = driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_tax_amount__dKcnP']"));
		int priceSize1 = priceList1.size();
		
		// below line used for to get My Earning (Incl. of Taxes)
		List<WebElement> lableList2 = driver.findElements(By.xpath("(//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_hotel_base_ticket_fare__rDSQG'])[2]"));
		int labelSize2 = lableList2.size();
		
		// below line used for to get My Earning (Incl. of Taxes) Amount
		List<WebElement> priceList2 = driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_flight_base_ticket_price__5HTvF']"));
		int priceSize2 = priceList2.size();



		for (int i = 0; i < labelSize; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableList.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceList.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		for (int i = 0; i < labelSize1; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableList1.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceList1.get(i).getText().trim().replace(",", "")));

				}
			}
		}
		
		for (int i = 0; i < labelSize2; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableList2.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceList2.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		// Get the Value of local Taxes 
		if (driver.findElements(By.xpath("//p[normalize-space()='Local Taxes (if applicable)']")).size() > 0) {
			double localTax = Double.parseDouble(driver.findElement(By.xpath(
					"//div[@class='theme4_booking_summary_grid_container__nXlBT']//input[@id='inputId']"))
					.getAttribute("value"));

			fareDetails.put("Local Taxes (if applicable)", localTax);

		}
		
		

		// Calculate total amount
		double finalTotalAmount = fareDetails.values().stream().mapToDouble(Double::doubleValue).sum();
		
		

		// Print the fare details and total amount
		System.out.println("Fare Details:");
		fareDetails.forEach((label, value) -> System.out.println(label + ": " + value + " BHD"));
		System.out.println("Final Total Amount: " + finalTotalAmount + " BHD");

		
		
		// this line check total amount calculation
		if (driver.findElements(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//p[normalize-space()='Total :']")).size() > 0) {
			
			double totalAmt = Double.parseDouble(driver.findElement(By.xpath("//div[@class='theme4_booking_summary_grid_container__nXlBT']//div[@class='theme4_total_amount_1__p6YOz']")).getText().trim().replace(",", "").replace("BHD", ""));
			System.out.println("Final Amount after all calculation : " + finalTotalAmount);
			System.out.println("Total amount is : " + totalAmt);

//			  BigDecimal value = new BigDecimal(finalTotalAmount);
//		        value = value.setScale(3, RoundingMode.HALF_UP);
		        
		       BigDecimal value = new BigDecimal(finalTotalAmount);
	        value = value.setScale(3, RoundingMode.HALF_UP);
		        System.out.println("finalTotalAmount : " + value);
		        
		        BigDecimal value1 = new BigDecimal(totalAmt);
		        value1 = value1.setScale(3, RoundingMode.HALF_UP);
			        System.out.println("totalAmt  : " + value1);
			   				
					        double Diff = finalTotalAmount-totalAmt;
					        System.out.println("The Value Differance is :"+Diff);
			
			
			Assert.assertEquals(value1, value);

		}
}
	
	public void Calculate_the_AmountOn_ConformationPage(WebDriver driver) throws InterruptedException
	{
		
		WebElement RoomCharges = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/span[2]"));
        String roomCharges = RoomCharges.getText();
        String roomCharges1 = roomCharges.replace("₹", "").replace(",", "").trim();		
        double RoomAmount = Double.parseDouble(roomCharges1);
        System.out.println("RoomAmount :"+RoomAmount);
        
        Thread.sleep(1000);
        
    	WebElement Taxes = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/span[2]"));
        String Taxes1 = Taxes.getText();
        String Taxes2 = Taxes1.replace("₹", "").replace(",", "").trim();		
        double TaxesAmount = Double.parseDouble(Taxes2);
        System.out.println("TaxesAmount :"+TaxesAmount);

        Thread.sleep(1000);

        
        WebElement TotalPayable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[2]/span[2]"));
        String TotalPayable1 = TotalPayable.getText();
        String TotalPayable2 = TotalPayable1.replace("₹", "").replace(",", "").trim();		
        double TotalPayableAmount = Double.parseDouble(TotalPayable2);
        System.out.println("TotalPayableAmount :"+TotalPayableAmount);
  
        Thread.sleep(1000);

        
       double TotalAmount = RoomAmount + TaxesAmount ;
       System.out.println("TotalAmount :"+TotalAmount);
       Thread.sleep(1000);

       
       Assert.assertEquals(TotalAmount, TotalPayableAmount);
       
        
		

	}
	
	
	
	public void selectadultforRoom(WebDriver driver,String RoomString) throws InterruptedException
	{
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		  
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme5_alertbutton__AHGSE']")));

		            popup.findElement(By.xpath("//div[@class='theme5_alertbutton__AHGSE']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		
		
		
		if(Room==1) {
			CommonMethodes.scrollDown(driver);
			Thread.sleep(300);

		  WebElement element= AdultFoeRoom1;
		     Thread.sleep(100);
		     element.click();
		     Thread.sleep(100);
		     SelectAdult1.click();
		 

		}
		
		else if(Room==2) 
			
		{			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757C");
	     Thread.sleep(500);
		}
		
		else if(Room==3) 
		
		{			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
		     //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757C");
	     Thread.sleep(300);
	     WebElement element2= AdultFoeRoom3;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element2.click();
	     Thread.sleep(100);
	     SelectAdult3.click();
	     Thread.sleep(100);
	     PassPAN3.sendKeys("HHJPK4757D");
	     Thread.sleep(500);
}
		
		else if(Room==4) 
		
		{ 			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757D");
	     Thread.sleep(300);
	     WebElement element2= AdultFoeRoom3;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element2.click();
	     Thread.sleep(100);
	     SelectAdult3.click();
	     Thread.sleep(100);
	     PassPAN3.sendKeys("HHJPK4757E");
	     Thread.sleep(300);
	     WebElement element3= AdultFoeRoom4;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element3.click();
	     Thread.sleep(100);
	     SelectAdult4.click();
	     Thread.sleep(100);
	     PassPAN4.sendKeys("HHJPK4757F");
	     Thread.sleep(500);
}

			 
	}
	
	public void selectadultforRoomwithoutLogin(WebDriver driver,String RoomString) throws InterruptedException
	{
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		if(Room==1) {
			CommonMethodes.scrollDown(driver);
			Thread.sleep(500);
			Title1.click();
			Thread.sleep(300);
			Mr1.click();
			Thread.sleep(300);
			first_name_01.sendKeys("Digambar");
			Thread.sleep(300);
			LastName1.sendKeys("Karande");
			Thread.sleep(300);
			email_01.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(300);
			phone_no_01.sendKeys("1561485648451");
			Thread.sleep(300);
			pan_no_01.sendKeys("HHJPK4959B");
			Thread.sleep(500);


		}
		
		else if(Room==2) 
			
		{	
			CommonMethodes.scrollDown(driver);
		Thread.sleep(300);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959B");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959C");
		Thread.sleep(300);
		
	     
		
}
		
		else if(Room==3) 
		
		{					CommonMethodes.scrollDown(driver);
		Thread.sleep(500);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959D");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959E");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);
			Title3.click();
			Thread.sleep(100);
			Mr3.click();
			Thread.sleep(100);
			first_name_03.sendKeys("Vinod");
			Thread.sleep(100);
			LastName3.sendKeys("Karande");
			Thread.sleep(100);
			email_03.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(100);
			phone_no_03.sendKeys("1561485648451");
			Thread.sleep(100);
			pan_no_03.sendKeys("HHJPK4959F");
			Thread.sleep(300);
	
}
		
		else if(Room==4) 
		
		{ 			CommonMethodes.scrollDown(driver);
		Thread.sleep(500);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959B");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("Omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959C");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);
			Title3.click();
			Thread.sleep(100);
			Mr3.click();
			Thread.sleep(100);
			first_name_03.sendKeys("Vinod");
			Thread.sleep(100);
			LastName3.sendKeys("Karande");
			Thread.sleep(100);
			email_03.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(100);
			phone_no_03.sendKeys("1561485648451");
			Thread.sleep(100);
			pan_no_03.sendKeys("HHJPK4959D");
			Thread.sleep(300);
			
		     
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(500);
				Title4.click();
				Thread.sleep(100);
				Mr4.click();
				Thread.sleep(100);
				first_name_04.sendKeys("Vinyak");
				Thread.sleep(100);
				LastName4.sendKeys("Karande");
				Thread.sleep(100);
				email_04.sendKeys("bhwbdbwwb@gmail.com");
				Thread.sleep(100);
				phone_no_04.sendKeys("1561485648451");
				Thread.sleep(100);
				pan_no_04.sendKeys("HHJPK4959E");
				Thread.sleep(300);
}

			 
	}
	
	public void clickoncontinuebutton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);

	CommonMethodes.scrollDown(driver);
	Thread.sleep(500);
	CommonMethodes.scrollDown(driver);
	//Thread.sleep(500);

	//CommonMethodes.waitForElementToBeVisible(driver, Continue_Booking, 20);
		Continue_Booking.click();	
		Thread.sleep(500);

			 
	}
	
	public void  clickcontinuebuttonAndProccedpayment(WebDriver driver,String RoomString) throws InterruptedException
	{
		
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		if(Room==1) {
			Thread.sleep(500);

		CommonMethodes.scrollDown2(driver);
		Thread.sleep(500);

		     continubutton.click();

			
		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     
		     Thread.sleep(15000);		
		}
		
		else if(Room==2) {
			
			
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);	
			
		}
		
		else if (Room==3)
		{
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);
		}
		else if(Room==4)
		{
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);

		}
		
		

	}
	

	
	
	
	
	
	
	
	
	

}

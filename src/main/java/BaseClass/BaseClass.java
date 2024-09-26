package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CommonMethodes;

public class BaseClass extends CommonMethodes {

	protected static WebDriver driver;
    ExtentReports extent;

    public void launchBrowser(String environment) throws IOException, InterruptedException {
    	
        String url;
        switch (environment.toLowerCase()) {
          
            case "uatb2b":
                url = CommonMethodes.readDataFromPropertyFile("UATB2BURL");
                break;
          
            case "prodb2b2":
                url = CommonMethodes.readDataFromPropertyFile("PRODB2BURL2");
                break;
            case "prodb2b":
                url = CommonMethodes.readDataFromPropertyFile("PRODB2BURL");
                break;
            default:
                throw new IllegalArgumentException("Unsupported environment: " + environment);
        }
        
        String browser = CommonMethodes.readDataFromPropertyFile("browser").toLowerCase();
       

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*","--headless=new");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--remote-allow-origins=*", "--disable-popup-blocking");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*", "--disable-popup-blocking");
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(url);
        System.out.println("User is on " + (environment.equalsIgnoreCase("prod") ? "PRODURL" : "UATURL"));
        System.out.println("Successfully launched the URL with " + browser);
    }
}

package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//xpath variables
		String baseurl = "https://www.truecaller.com/";
		String acceptcookies = "/html/body/div/div/div/div/div[2]/button[3]";
		String signinbutton =  "//*[@id=\"app\"]/nav/div/div/a[4]/span";
		String microsoftloginbutton = "/html/body/div/main/div/div/a[2]";
		String emailidinputbox = "loginfmt";
		String emailidvalue = "anandtruecaller@hotmail.com";
		String password = "Anand@123";
		String nextbutton = "idSIButton9";
		String passwordinputbox = "/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/input";
		String pwdsigninbutton = "/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[4]/div[2]/div/div/div/div/input";
		String stayloggedin = "/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input";
		
		
		
		driver.get(baseurl); //Open Truecaller
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.findElement(By.xpath(acceptcookies)).click();// Accept Cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath(signinbutton)).click(); // CLick on Sign In
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath(microsoftloginbutton)).click(); // Click on Sign in with Microsoft
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name(emailidinputbox)).sendKeys(emailidvalue);// enter email id to login
      	driver.findElement(By.id(nextbutton)).click(); // click on next
      	
      	driver.findElement(By.xpath(passwordinputbox)).sendKeys(password);// enter password
      	driver.findElement(By.xpath(pwdsigninbutton)).click();//click on sign in
      	
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      	
      	driver.findElement(By.xpath(stayloggedin)).click();
      	
      			
				
	}

}

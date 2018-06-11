package nurs;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/osmonov/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver nurs = new ChromeDriver();
		Random beka = new Random();
		int number = beka.nextInt(101);
		String[] names = { "Beka", "Aza", "Papi", "Runo", "Sova" };
		int ranNum = beka.nextInt(5);
		String zip = "";
		for (int i = 0; i < 5; i++) {
			zip = zip + beka.nextInt(9);
		}

		nurs.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		nurs.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		nurs.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		nurs.findElement(By.name("ctl00$MainContent$login_button")).click();
		nurs.findElement(By.linkText("Order")).click();
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).clear();
		String tilek = "" + number;
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(tilek);
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + names[ranNum] + " Smith");
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Fairfax");
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(zip);
		int a = beka.nextInt(2);
		
		nurs.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_" + a + "")).click();
		WebElement q = nurs.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
		WebElement w = nurs.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
		WebElement e = nurs.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));
		WebElement nnn= nurs.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		 String cardType="";
		 int random;
		if(a==0) {
			cardType="4";
			for (int i = 0; i <15; i++) {
				random=beka.nextInt(9);
				cardType+=random;
				}
			}else if(a==1) {
				cardType="5";
				for(int i=0; i<15;i++) {
					random=beka.nextInt(9);
					cardType+=random;
				}
			
		} else {
			cardType="3";
			for(int i=0;i<14;i++){
				random=beka.nextInt(9);
				cardType+=random;
				
			}
		}
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(cardType);
		nurs.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("05/2018");
		nurs.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		String element= "//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong";
		
		if(element.contains("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong")) {
			System.out.println("New order has been successfully added");
		}
		
		
		
	}
}

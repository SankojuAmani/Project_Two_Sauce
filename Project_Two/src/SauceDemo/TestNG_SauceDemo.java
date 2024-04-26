package SauceDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_SauceDemo {
		    WebDriver driver;
		    @BeforeTest
		    public void beforetest() throws Exception {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.saucedemo.com/");
		    }
		    @Test(priority =1)
		    public void VerifyInValidCredSignIn() throws Exception {
		    	TC_2_InvalidCredientials obj = new TC_2_InvalidCredientials (driver);
		        obj.signInToSauceDemoInvalidCred();
		    } 
		  
		    @Test(priority = 2)
		    public void VerifySignIn() throws Exception {
		    	TC_1_SignIn obj = new TC_1_SignIn (driver);
		        obj.SIgnIntoSauceDemo();
		    }
		    @Test(priority =3)
		    public void VerifyListOfProducts() throws Exception {
		    	TC_3_ListOfItems obj = new TC_3_ListOfItems (driver);
		        obj.listOfProducts();
		    } 
		    @Test(priority =4)
		    public void VerifyByClickingOntheProducts() throws Exception {
		    	TC_4_ClickOnProducts obj = new TC_4_ClickOnProducts (driver);
		        obj.ClickOnalltheProducts();

		    }
		    @Test(priority =5)
		    public void VerifyAddToCart() throws Exception {
		    TC_5_Add_To_Cart obj = new TC_5_Add_To_Cart (driver);
		    obj.AddToCart();

		    }
		    @Test(priority =6)
		    public void VerifyRemoveFromCart() throws Exception {
		    TC_6_RemoveFromCart obj = new TC_6_RemoveFromCart (driver);
		    obj.RemoveFromtheCart();
		    }
		    @Test(priority =7)
		    public void VerifyHamburgerMenu() throws Exception {
		    TC_7_Twittericon obj = new  TC_7_Twittericon (driver);
		    obj.TwitterOption(); 
		    }
		    @Test(priority =8)
		    public void VerifyAboutInSidbar() throws Exception {
		    TC_8_About_Sidebar obj = new  TC_8_About_Sidebar (driver);
		    obj.AboutInMenuSidebar(); 
		    }
		    @Test(priority =9)
		    public void VerifyFilterByOptions() throws Exception {
		    TC_9_FilterBy obj = new  TC_9_FilterBy (driver);
		    obj.FilterByOptions(); 
		    }
		    @Test(priority =10)
		    public void VerifyCartOption() throws Exception {
		    TC_10_Cart obj = new  TC_10_Cart (driver);
		    obj.CartOptions(); 
		    }
		    @Test(priority =11)
		    public void VerifyPageScrolling() throws Exception {
		    TC_11_PageScrollDown obj = new  TC_11_PageScrollDown (driver);
		    obj.ScrollthePageDown(); 
		    }
		    @Test(priority =12)
		    public void VerifyScreenshot() throws Exception {
		    TC_12_ScreenShot obj = new  TC_12_ScreenShot (driver);
		    obj.ScreenshotOfSauce(); 
		    }
		    @Test(priority =13)
		    public void VerifyPageTitle() throws Exception {
		    TC_13_PageTitle obj = new  TC_13_PageTitle (driver);
		    obj.PageTitle(); 
		    }
		    @Test(priority =14)
		    public void VerifyRequestDemo() throws Exception {
		    TC_14_RequestADemo obj = new  TC_14_RequestADemo (driver);
		    obj.AboutPageDemoRequest();
		    }
		    @Test(priority =15)
		    public void VerifyFooterlinks() throws Exception {
		    TC_15_TermsOfService obj = new  TC_15_TermsOfService (driver);
		    obj.Footerlinks();
		    }
		    @Test(priority =16)
		    public void VerifyCookiesLink() throws Exception {
		    TC_16_CookieSettings obj = new  TC_16_CookieSettings (driver);
		    obj.CookieSettingLink();
		    }
		    @Test(priority =17)
		    public void VerifySIgnIn() throws Exception {
		    TC_17_SignInOption obj = new  TC_17_SignInOption (driver);
		    obj.SignInHeader();
		    }
		    @Test(priority =18)
		    public void VerifyTryitFreeButton() throws Exception {
		    TC_18_TryItFree obj = new  TC_18_TryItFree (driver);
		    obj.TryItFreeOption();
		    }
		    @Test(priority =19)
		    public void VerifySearchIcon() throws Exception {
		    TC_19_SearchIcon obj = new  TC_19_SearchIcon (driver);
		    obj.SearchIcon();
		    }
		    @Test(priority =20)
		    public void VerifyLogout() throws Exception {
		    TC_20_Logout obj = new  TC_20_Logout (driver);
		    obj.LogoutOption();
		    }

		    @AfterTest
		    public void aftertest() {
		       driver.quit();
		    }

}

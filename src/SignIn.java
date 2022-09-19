import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn {
	@Test(description="user is able to login with valid username")
    public void signinginA() throws InterruptedException
   {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rajeswari.ps\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        String name =  "nivetha01@gmail.com";
        String password = "raju123";
        landingpage.goTo();
        landingpage.character3(name, password);
        
        
    }
	@Test(description="user is able to login with username having special characters")
     public void signinginB() throws InterruptedException
    {
        String name =  "nivetha@gmail.com";
        String password = "minu63";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        
    }
	@Test(description="user is not able to login with username containing only numericals")
    public void signinginC() throws InterruptedException
    {
        String name =  "123456789";
        String password = "nivy56";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
        
    }
	@Test(description="user is not able to login with empty username textfield")
    public void signinginD() throws InterruptedException
    {
        String name =  "";
        String password = "manu76";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
       
    }
	@Test(description="user is able to login with valid password")
    public void signinginE() throws InterruptedException
    {
        String name =  "nivetha08@gmail.com";
        String password = "raju123";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
       
    }
	@Test(description="user is not able to login with password containing only alphabetes")
    public void signinginF() throws InterruptedException
    {
        String name =  "nivetha072000@gmail.com";
        String password = "Nivetha";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
       
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
        
    }
	@Test(description="user is not able to login with password containing only numericals")
    public void signinginG() throws InterruptedException
    {
        String name =  "nibetha0720@gmail.com";
        String password = "123456789";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
      
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
  
    }
	@Test(description="user is not able to login with  empty password textfield")
    public void signinginH() throws InterruptedException
    {
        String name =  "nivi072000@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
      
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
       
    }
	@Test(description="user is not able to login with password containing special characters")
    public void signinginI() throws InterruptedException
    {
    	String name = "nibetha560@gmail.com";
    	String password = "!@#$%^";
    	WebDriver driver =new ChromeDriver();
    	LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
        
    }
	@Test(description="user is not able to login with password containing only 2 characters")
    public void signinginJ() throws InterruptedException
    {
    	String name = "nila190@gmail.com";
    	String password = "r2";
    	WebDriver driver =new ChromeDriver();
    	LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
      
    }
	@Test(description="user is not able to login with password containing 6 characters")
    public void signinginK() throws InterruptedException
    {
    	String name = "nileena5670@gmail.com";
    	String password = "nivu34";
    	WebDriver driver =new ChromeDriver();
    	LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
      
    }
	@Test(description="user is not able to login with password containing 11 characters")
    public void signinginL() throws InterruptedException
    {
    	String name = "nivetha07@gmail.com";
    	String password = "nivetha3456";
    	WebDriver driver =new ChromeDriver();
    	LandingPage landingpage = new LandingPage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        String expected="Error should be displayed below";
        String actual="driver.getCurrentURL";
        Assert.assertEquals(actual, expected);
    }

}
    
   
   
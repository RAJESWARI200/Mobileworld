import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUp{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\rajeswari.ps\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      
       driver.get("https://mobileworld.banyanpro.com/");
       driver.findElement(By.cssSelector("button[type='submit']")).click();
       driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
  }
       @Test(dataProvider = "datasets")
       public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
       {
       driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
    
       driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
       //Thread.sleep(1000);
       driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
       //Thread.sleep(500);
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
       //Thread.sleep(500);
       driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
       //Thread.sleep(500);
       driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
       //Thread.sleep(500);
       driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
       //Thread.sleep(500);
       driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
       //Thread.sleep(500);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       //Thread.sleep(500);
       driver.switchTo().alert().accept();
       driver.quit();
  }
       @DataProvider(name = "datasets")
       public Object[][] datasets(){
           Object[][] data = {{"Nivetha","Sree","Nivetha@gmail.com","rinu123","6238777453","06/14/2000","ghijklmnopqrstuv"},
                               {"","","Nivetha@gmail.com","rinu123","","06/14/2000","ghijklmnopqrstuv"},
                               {"Nivetha123","Sree456","Nivetha@gmail.com","rinu123","6238777453","12/12/2022","qwertyuiopaNivethafghjkl"},
                               {"123456","567","Nivethagmail.com","rinu123","6238777453","12/12/2022","qwertyuiopaNivethafghjkl"},
                               {"Nivetha","aabcdefghijklmnopqrs","Nivetha@gmail.com","rinu123","6238777453","12/12/2022","qwertyuiopaNivethafghjkl"},
                               {"Nivetha","Sree","Nivetha@gmail.com","rinu123","6238777453","12/12/2022","qwertyuiopaNivethafghjkl"},
                               {"Nivetha","Nivetha","Nivetha@gmail","Nivetha","dfghggffd","05/20/2000",""},
                               {"Nivetha","Sree","Nivetha@gmail.com","Sree@123","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","@gmail.com","Sree@123","6238777453","05/20/2000","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","05/20/2000","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@wh33h","12334444555","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@aw2@!wssssjjj","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","05/20/2021","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","05/20/2022","hai"},
                               {"Nivetha","Sree","Nivetha@gmail.com","s1@","6238777453","","hai"}};                               
           return data;
           
       }
   }
    
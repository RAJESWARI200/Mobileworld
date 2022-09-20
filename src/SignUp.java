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
       driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
       //Thread.sleep(500);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       //Thread.sleep(500);
       driver.switchTo().alert().accept();
       driver.quit();
  }
       @DataProvider(name = "datasets")
       public Object[][] datasets(){
           Object[][] data = {{"Nivetha","sree","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"","","nivetha032000@gmail.com","rinu123","","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha123","sree123","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"1234567888","45546","Nivethagmail.com","rinu123","6238777456","12/12/2022","hijklmnopqrstuvwxyz"},
                               {"@#$%%^","@#$%%^","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Ni","sr","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivethasruthihemamalin","sreegopiajaypunithars","Nivetha@gmail","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivethasruthiaja","sreehemamalinihu","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha","sree","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha","sree","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha","sree","","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha","sree","45678032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxyz"},
                               {"Nivetha","sree","nivetha032000@gmail.com","rinu123","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","rtyuhj","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","123245","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","@%^^^^","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","r1","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju12","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","nivetha1234","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","17/10/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","10//2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","10/17/","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","6238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju123","916238777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","^@#*#)&^^#","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","rtyh777456","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","rajrtyyuhh","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","623877745","10/17/2000","hijklmnopqrstuvwxy"},
                               {"Nivetha","sree","nivetha032000@gmail.com","raju1","62387774565","10/17/2000","hijklmnopqrstuvwxy"}};                               
           return data;
           
       }
   }
    
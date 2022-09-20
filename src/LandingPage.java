import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "username")
    WebElement  username;
    
    @FindBy(id= "password")
    WebElement passwords;
    
    @FindBy(xpath= "//a[class='btn btn-primary btn-block']")
    WebElement select;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement Select;
    
/*---- ContactUs -----*/
    @FindBy(xpath= "/html/body/nav/div/ul/li[4]/a")
    WebElement support;
    
    @FindBy(linkText = "Contact Us")
    WebElement contactus;
    
    @FindBy(xpath= "/html/body/div/div/div[2]/form/div[1]/input")
    WebElement Username;
    
    @FindBy(css = "input[placeholder='Email']")
       WebElement  Email;
    
    @FindBy(xpath= "//input[@type='tel']")
    WebElement phone;
    
    @FindBy(css = "textarea[placeholder='Message']")
       WebElement message;
    
    @FindBy(css = "input[type='submit']")
       WebElement submit;
    public void send(String uname,String emailid,String phoneno,String msg) throws InterruptedException {
        support.click();
        contactus.click();
        String parenthandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(!handle.equals(parenthandle)) {
                driver.switchTo().window(handle);
                Username.sendKeys(uname);
                Email.sendKeys(emailid);
                phone.sendKeys(phoneno);
                message.sendKeys(msg);
                Thread.sleep(2000);
                submit.click();
                Thread.sleep(2000);
                String expected="Error should be displayed below";
                String actual= "driver.get('https://mobileworld.banyanpro.com/index.html')";
                Assert.assertEquals(actual, expected);
                driver.quit();
            }
            }
            }
    
    public void character3(String name, String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
        }
    
    public void character20(String name, String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    public void character2(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    
    public void character21(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    
    public void validemail(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    public void unregisteremail(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    public void validdetails(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    public void pass2(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        driver.close();
    }
    public void goTo() {
        driver.get(" https://mobileworld.banyanpro.com/");
    }

	public void send1(String username2, String email, String phone, String message) {
		// TODO Auto-generated method stub
		
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
}
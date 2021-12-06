import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenijmartuhin/IdeaProjects/bin/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://bimlib.pro");
        WebElement button= driver.findElement(By.xpath("//button[contains(text(),'Принять')]"));
        button.click();


    }

}

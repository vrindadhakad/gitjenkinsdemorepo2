package seleniumprojects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\seleniumsoftware\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
        
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        /*driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
        Alert alt=driver.switchTo().alert();
        String message=driver.switchTo().alert().getText();
        System.out.println(message);
        alt.accept();*/
        
        
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm')]")).click();
        Alert alt2=driver.switchTo().alert();
        String message=driver.switchTo().alert().getText();
        System.out.println(message);
        Thread.sleep(3000);
        alt2.dismiss();
        
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demo')]")).click();
        Alert alt1=driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("Vrinda");
        Thread.sleep(3000);
        alt1.accept();
        
        driver.close();
        
    }

}

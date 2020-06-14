package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Inicio {
	static WebDriver driver;
	
	public Inicio (WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherEmail() {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com"); 
		
		WebElement proximaPagina = driver.findElement(By.id("enterimg"));
		proximaPagina.click();
		
	}
}

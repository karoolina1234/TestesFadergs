package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deletePages {

	static WebDriver driver;
	
	public deletePages(WebDriver driver) {
		this.driver = driver;
	}
	
	Actions action = new Actions(driver);
	
	public void deletarPrimeiroCadastro(){
		
		//esperar
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='1592111323787-0-uiGrid-000B-cell']//i[contains(@class,'fa fa-trash-o')]")));
		/*
		//Localiza 
		WebElement excluir = driver.findElement(By.xpath("//div[@id='1592111323787-0-uiGrid-000B-cell']//i[contains(@class,'fa fa-trash-o')]"));
		
		//deleta
		Actions action = new Actions(driver).contextClick(excluir);
		action.build().perform();
		
		WebElement btnExcluir = driver.findElement(By.xpath("//div[@id='1592111323787-0-uiGrid-000B-cell']//button[@class='btn btn-danger btn-xs'][contains(text(),'Delete')]"));
		btnExcluir.click();*/
		
		WebElement edit = driver.findElement(By.xpath("//b[contains(text(),'EDIT')]"));
		assertEquals("EDIT", edit);
	}
	
}

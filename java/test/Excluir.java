package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Cadastro;
import pages.Inicio;
import pages.deletePages;


public class Excluir {
	static WebDriver driver; 
	static Cadastro cadastro;
	static Inicio inicio;
	static deletePages deletar;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		deletar = new deletePages(driver);
		inicio = new Inicio(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void testeDeletar() {
		
		//espera
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'EDIT')]")));
		
		//localizar
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//div[@id='1592339739072-0-uiGrid-000B-cell']//i[contains(@class,'fa fa-trash-o')]"));
		action.contextClick(btn).perform();
		
		//Clicar
		WebElement btnDell = driver.findElement(By.xpath("//div[@id='1592339739072-0-uiGrid-000B-cell']//button[@class='btn btn-danger btn-xs'][contains(text(),'Delete')]"));
		btnDell.click();
		
		Alert alerta = driver.switchTo().alert();
		alerta.accept();
		
		
	}
	

}

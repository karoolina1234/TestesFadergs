package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Cadastro;
import pages.Inicio;


public class cadastrar_E_Validar{
	static WebDriver driver; 
	static Cadastro cadastro;
	static Inicio inicio;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		cadastro = new Cadastro(driver);
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
		driver.close();
	}

	@Test
	public void test1() {
		inicio.preencherEmail();
		cadastro.preencherCampo();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//cadastro.validarNumero();
		String funcionou = driver.findElement(By.xpath("//b[contains(text(),'DELETE')]")).getText();
		assertEquals("DELETE",funcionou);
	}

}

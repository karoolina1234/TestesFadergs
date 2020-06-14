package pages;

	
	import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Cadastro {

			static WebDriver driver;

			public Cadastro(WebDriver driver) {
				this.driver = driver;
			}
			
			public void preencherCampo() {
				WebElement nome = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				nome.sendKeys("Faculdade");
				
				WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastName.sendKeys("Fadergs"); 
				
				WebElement endereco = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
				endereco.sendKeys(" R. Riachuelo, 1257");
				
				
				WebElement email = driver.findElement(By.cssSelector("#eid > input"));
				email.sendKeys("testeauto2345@gmail.com"); 
				
				
				
				WebElement telefone = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
				telefone.sendKeys("0113679998");
				
				WebElement genero = driver.findElement(By.xpath("//label[2]"));
				genero.click();
				
				WebElement hobbies = driver.findElement(By.id("checkbox2"));
				hobbies.click();
				
				
				/*WebElement selectList  = driver.findElement(By.cssSelector("#msdd"));
				
				Select select = new Select(selectList);
				select.selectByVisibleText("Portuguese");*/
				
				WebElement selectLanguage = driver.findElement(By.id("msdd"));
				selectLanguage.click();
				WebDriverWait holdUpTwo = new WebDriverWait(driver, 10);
				holdUpTwo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Arabic')]")));
				driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
				
				Select skills =  new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
				skills.selectByVisibleText("Java");
				
				Select country =  new Select(driver.findElement(By.xpath("//select[@id='countries']")));
				country.selectByVisibleText("Brazil");
				
				WebElement countries = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
				countries.click();
				WebElement procura = driver.findElement(By.xpath("//li[contains(text(),'Japan')]"));
				procura.click();
								
				Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
				year.selectByValue("1986");
				
				Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
				month.selectByValue("June");
				
				Select day = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
				day.selectByValue("4");
				
				WebElement senha = driver.findElement(By.xpath("//input[@id='firstpassword']"));
				senha.sendKeys("C84jcjDVpcH@w7E");
				
				
				WebElement confirmarsenha = driver.findElement(By.xpath("//input[@id='secondpassword']"));
				confirmarsenha.sendKeys("C84jcjDVpcH@w7E");
				
				
				WebElement botaoSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
				botaoSubmit.click();
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui-grid-pager-next']")));

				
			}
			
			public void validarNumero() {
				String textoElement = driver.findElement(By.xpath("//div[@class='col-xs-offset-1 col-xs-4 ng-scope']")).getText();
				//WebElement textoElement = driver.findElement(By.xpath("//div[@class='col-xs-offset-1 col-xs-4 ng-scope']"));
				assertEquals("Phone number already exists",textoElement);
				
			}
			
			
			
			public String ValidarMensagem() {
				
				return driver.findElement(By.className("o6cuMc")).getText();
			}
	}




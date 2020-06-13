package pages;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class Cadastro {

			static WebDriver driver;

			public Cadastro(WebDriver driver) {
				this.driver = driver;
			}
			
			public void preencherCampo() {
				WebElement nome = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				nome.sendKeys("faculdade");
				
				WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastName.sendKeys("Fadergs"); 
				
				WebElement endereco = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
				endereco.sendKeys(" R. Riachuelo, 1257");
				
				
				WebElement email = driver.findElement(By.cssSelector("#eid > input"));
				email.sendKeys("admin@fadergs.edu.br"); 
				
				
				
				WebElement telefone = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
				telefone.sendKeys("0007678678");
				
				WebElement genero = driver.findElement(By.xpath("//label[2]"));
				genero.click();
				
				WebElement hobbies = driver.findElement(By.id("checkbox2"));
				hobbies.click();
				
				/*WebElement selectList  = driver.findElement(By.cssSelector("#msdd"));
				
				Select select = new Select(selectList);
				select.selectByVisibleText("Portuguese");*/
				
				
				
				Select skills =  new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
				skills.selectByVisibleText("Java");
				
				Select country =  new Select(driver.findElement(By.xpath("//select[@id='countries']")));
				country.selectByVisibleText("Brazil");
				
				//WebElement selectCountry = driver.findElement(By.className("//input[@class='select2-search__field']"));
				//selectCountry.sendKeys("Japan");
				
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
			}
			
			public String ValidarMensagem() {
				
				return driver.findElement(By.className("o6cuMc")).getText();
			}
	}




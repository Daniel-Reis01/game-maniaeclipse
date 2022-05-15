package gamemania;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testelogingamemania {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
     System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void testeNavegador() {
		driver.get("http://localhost:4200/login");
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
	
		
		String[] listaSenha = {"senha1", "outrasenha", "senhaerrada", "vaidarbom"};
		for(int tentativas = 0; tentativas < listaSenha.length; tentativas++) {
			try {
			inputEmail.clear();
			inputSenha.clear();
			
			inputEmail.sendKeys("daniel@email.com");
			inputSenha.sendKeys(listaSenha[tentativas]);
			botaoLogin.click();
		    Thread.sleep(3000);
			
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class VenderVehiculo {
	
	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
			driver.get(website); //Obtiene el website al que se va a ingresar
			driver.manage().window().maximize(); //Maximiza la ventana del navegador
			driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)

			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/a[1]")).click(); //Da click en iniciar sesion
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[1]/input")).sendKeys("cr7878.cc@gmail.com"); //ingresa el correo 
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[2]/input")).sendKeys("FASTOR12"); //Ingresa la contraseña
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/input[2]")).click(); //Da click en el boton de Iniciar Sesion
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/a")).click(); //Da click en el botón de Vender vehiculo
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/label[1]/input")).click(); //Selecciona la opcion de Autos
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[2]/div/div[1]/div/div/div[1]/div[2]/div/input")).sendKeys("Mitsubishi" +Keys.ENTER); //Selecciona la marca del vehiculo
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/input")).sendKeys("Lancer" +Keys.ENTER); //Selecciona el modelo
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[2]/div/div[3]/div/div/div[1]/div[2]/div/input")).sendKeys("Sedan" +Keys.ENTER); //Selecciona el estilo de carroceria
			driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input")).click(); //Da click en el botón de Siguiente
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/select")).click(); //Selecciona el año del vehiculo
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[2]/input")).sendKeys("189000"); //kilometraje
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[3]/input")).sendKeys("7"); //ultimo digito de la placa
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[4]/div[2]/div[2]/label[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[5]/div[2]/div[2]/label[1]/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[6]/div[2]/div[2]/label[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[7]/div[2]/div[2]/label[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[8]/div[2]/div[2]/label[1]/input")).click();

	}

	public static void main(String[] args) {
		
		VenderVehiculo Venta = new VenderVehiculo();
		Venta.launchbrowser();
		

	}

}

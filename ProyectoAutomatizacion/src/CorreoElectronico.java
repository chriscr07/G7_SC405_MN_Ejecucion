import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CorreoElectronico {

	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get(website); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
				System.out.println("Todas las Cookies se eliminaron");  
      
		        //Ingresamos un usuario y contraseña que sean validos para poder iniciar sesion en la pagina.
		        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/a[1]")).click(); //Da click en iniciar sesion
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/a")).click(); //Da click en Registrese
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/input[2]")).sendKeys("testaccount4@gmail.com"); //ingresa el correo 
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/input[3]")).sendKeys("test12"); //Ingresa la primer contraseña
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/input[4]")).sendKeys("test12"); //Ingresa la confirmacion de contraseña
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/div[2]/input")).click(); //Da click en el boton de registrarse
		       //driver.close();
	}
	
	public static void main(String[] args) {
		
		CorreoElectronico correo = new CorreoElectronico();
		correo.launchbrowser();

	}

}

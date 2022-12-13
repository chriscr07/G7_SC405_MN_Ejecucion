import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioSesion {
	
	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";

	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get(website); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
      
		        //Ingresamos un usuario y contraseña que sean validos para poder iniciar sesion en la pagina.
		        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/a[1]")).click(); //Da click en iniciar sesion
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[1]/input")).sendKeys("cr7878.cc@gmail.com"); //ingresa el correo 
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[2]/input")).sendKeys("fastor12"); //Ingresa la contraseña
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/input[2]")).click(); //Da click en el boton de Iniciar Sesion
		       //driver.close();
		       
		
	}
	
	public static void main(String[] args) {
		
		InicioSesion Sesion = new InicioSesion();
		Sesion.launchbrowser();

	}

}

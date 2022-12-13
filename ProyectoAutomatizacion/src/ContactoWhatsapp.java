import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ContactoWhatsapp {

	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get(website); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
				
				driver.findElement(By.linkText("Autos")).click(); //Selecciona la categoria y da click en el botón de "Buscar"
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div/a/div/div[1]/div")).click(); //Da click en la imagen del primer vehiculo listado
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div[3]/a")).click(); //Da click en el botón de "Contactar por Whatsapp" y abre una nueva ventana
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/section/div/div/div/div[2]/div[1]/a")).click(); //Da click en el botón en Whatsapp de "Ir al chat" 
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/section/div/div/div/div[3]/div/div/h4[2]/a/span")).click();
			
				
	}
	
	public static void main(String[] args) {
		
		ContactoWhatsapp Contacto = new ContactoWhatsapp();
		Contacto.launchbrowser();

	}

}

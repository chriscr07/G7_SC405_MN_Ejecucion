import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FiltrarBusqueda {
	
	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get(website); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
				
				driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/a/img")).click(); //Navega a la pagina de autos
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/form/div[1]/div/div/div[1]/div[2]/div/input")).sendKeys("Mitsubishi" +Keys.ENTER); //Da click en el dropdown de categorias y busca Mitsubishi
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/form/label[1]/button/div")).click(); //Selecciona el tipo de transmision. En este caso "automatico".
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/form/label[1]/div[2]/label/input")).click(); //Selecciona el tipo de transmision. En este caso "automatico".
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/form/div[9]/input")).click(); //Da click en el boton de buscar

	}
	
	public static void main(String[] args) {
	
		FiltrarBusqueda filtro = new FiltrarBusqueda();
		filtro.launchbrowser();

	}

}

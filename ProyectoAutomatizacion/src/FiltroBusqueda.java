import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class FiltroBusqueda {
	
	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;
	String website = "https://www.dunu506.com/?gclid=CjwKCAjw2OiaBhBSEiwAh2ZSP-WG9lg3LOrww-RehiQ03pYzX1YWp-O0cfM3xYis0YGLSk532RANuBoCiRMQAvD_BwE";
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get(website); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
				
				driver.findElement(By.linkText("Motocicletas")).click(); //Selecciona la categoria y da click en el botón de "Buscar"
				
				//Nota: El mismo comando realiza ambas acciones, por lo que no es necesario utilizar más código. Con esto evitamos que el programa sea lento o tenga código basura
				
	}

	public static void main(String[] args) {
	
		FiltroBusqueda Buscar = new FiltroBusqueda();
		Buscar.launchbrowser();
		
	}

}

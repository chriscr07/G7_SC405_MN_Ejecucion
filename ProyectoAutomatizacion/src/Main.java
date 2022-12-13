import java.util.Random;
import javax.swing.JOptionPane;


public class Main {
	

	public static void main(String[] args) {
		
		String cad;
		int  opc;
		
		do {
			
			//Enumera las funciones en la interfaz
			cad = JOptionPane.showInputDialog("Bienvenido" + 
			"\n 1.- Registro de Usuarios"+
			"\n 2.- Validacion del correo"+
			"\n 3.- Inicio de Sesion"+ 
			"\n 4.- Funciones de la cuenta"+
			"\n 5.- Filtros de busqueda"+
			"\n 6.- Imagen de vehiculos"+
			"\n 7.- Informacion de vehiculos"+
			"\n 8.- Contactar al vendedor por Whatsapp"+
			"\n 9.- Redireccion a inicio"+
			"\n 10.- Agregar un vehiculo a la venta"+
			"\n 11.- Cerrar Sesion"+
			"\n 12 .-Redirigir a redes sociales"+
			"\n 13.- Filtrar busqueda"+
			"\n 14.- Categorias"+
			"\n 15.- Ordenar Por"+
			"\n 16. Salir");
			
			opc=Integer.parseInt(cad);
			
			switch(opc) {
			
			//El switch sirve para elegir la funcion a realizar
			case 1: 
				RegistroUsuarios.main(args);
				System.exit(0);
				break;
				
			case 2: 	
				RegistroUsuarios.main(args);
				System.exit(0);
				break;
				
			case 3: 	
				InicioSesion.main(args);
				System.exit(0);
				break;
				
			case 4: 	
				FuncionesDeCuenta.main(args);
				System.exit(0);
				break;
				
			case 5: 	
				FiltroBusqueda.main(args);
				System.exit(0);
				break;
				
			case 6: 	
				ImagenVehiculos.main(args);
				System.exit(0);
				break;
				
			case 7: 	
				InformacionVehiculos.main(args);
				System.exit(0);
				break;
				
			case 8: 	
				ContactoWhatsapp.main(args);
				System.exit(0);
				break;
				
			case 9: 	
				RedireccionInicio.main(args);
				System.exit(0);
				break;
				
			case 10: 	
				VenderVehiculo.main(args);
				System.exit(0);
				break;
				
			case 11: 	
				CierreSesion.main(args);
				System.exit(0);
				break;
				
			case 12: 	
				RedesSociales.main(args);
				System.exit(0);
				break;
				
			case 13: 	
				FiltrarBusqueda.main(args);
				System.exit(0);
				break;
				
			case 14: 	
				Categorias.main(args);
				System.exit(0);
				break;
				
			case 15: 	
				OrdenarPor.main(args);
				System.exit(0);
				break;
				
			case 16:
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa!");
				System.exit(0);
			}
			
		}while(opc!=16); //Se sale del programa al ser la opcion de salir

	}

}

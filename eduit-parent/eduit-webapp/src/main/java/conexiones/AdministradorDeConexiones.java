package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws Exception{
		
		//Estableciendo el nombre del driver a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";
		
		//Estableciendo la url y base de datos a utilizar
		String dbConnString = "jdbc:mysql://localhost/jsweb";
		
		//Estableciendo el usuario de la base de datos
		String dbUser = "root";
		
		//Estableciendo la contraseña de la base de datos
		String dbPass = "root";
		
		//Estableciendo el driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Retornando la conexion
		Connection conn = DriverManager.getConnection(dbConnString, dbUser, dbPass);
		
		
		return conn;
	}
}

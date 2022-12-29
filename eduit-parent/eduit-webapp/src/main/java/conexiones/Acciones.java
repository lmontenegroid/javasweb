package conexiones;

import java.sql.Connection;
import java.sql.Statement;

import entidades.Administrativo;
import excepciones.FechaException;

public class Acciones {

	public static void agregar(Administrativo ad) throws Exception {

		Connection conexion = AdministradorDeConexiones.obtenerConexion();

		String sql = "insert into administrativo (nombre, apellido, tipoDoc, numDoc, fechaNac, fechaIng, sueldo) "
				+ "values ('" + ad.getNombre() + "', '" + ad.getApellido() + "', '"
				+ ad.getDocumento().getTipo().toString() + "', '" + ad.getDocumento().getNumero() + "', '"
				+ FechaException.formato(ad.getFechaNacimiento()) + "', '"
				+ FechaException.formato(ad.getFechaIngreso()) + "', " + ad.getSueldo() + ");";

		Statement st = conexion.createStatement();

		st.execute(sql);

		st.close();

		conexion.close();
	}

	public static void modificar(Administrativo ad, String numeroDoc) throws Exception {

		Connection conexion = AdministradorDeConexiones.obtenerConexion();

		String sql = "update administrativo set nombre = '" + ad.getNombre() + "', apellido = '" + ad.getApellido()
				+ "', tipoDoc = '" + ad.getDocumento().getTipo().toString() + "', numDoc = '"
				+ ad.getDocumento().getNumero() + "', fechaNac = '" + FechaException.formato(ad.getFechaNacimiento())
				+ "', fechaIng = '" + FechaException.formato(ad.getFechaIngreso()) + "', sueldo = " + ad.getSueldo()
				+ " where numDoc = " + numeroDoc;

		Statement st = conexion.createStatement();

		st.execute(sql);

		st.close();

		conexion.close();
	}

}

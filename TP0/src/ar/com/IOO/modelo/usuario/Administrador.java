package ar.com.IOO.modelo.usuario;

public class Administrador extends Rol {

	@Override
	public Boolean puedoRealizar(String unaTarea) {
		return Boolean.TRUE;
	}

}

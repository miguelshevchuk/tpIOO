package ar.com.IOO.modelo.usuario;

import java.util.List;

public class Recepcionista extends Rol {

	private List<String> tareasDisponibles;

	@Override
	public Boolean puedoRealizar(String unaTarea) {
		return this.tareasDisponibles.contains(unaTarea);
	}

	public List<String> getTareasDisponibles() {
		return tareasDisponibles;
	}

	public void setTareasDisponibles(List<String> tareasDisponibles) {
		this.tareasDisponibles = tareasDisponibles;
	}

}

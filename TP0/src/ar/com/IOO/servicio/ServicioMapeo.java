package ar.com.IOO.servicio;

import ar.com.IOO.dto.PacienteDTO;
import ar.com.IOO.dto.PeticionDTO;
import ar.com.IOO.modelo.Paciente;
import ar.com.IOO.modelo.peticion.Peticion;

public class ServicioMapeo {

	public Paciente mapear(PacienteDTO unPaciente){
		Paciente paciente = new Paciente();
		
		return paciente;
	}
	
	public Peticion mapear(PeticionDTO unaPeticion){
		Peticion peticion = new Peticion();
		
		return peticion;
	}
	
	
}

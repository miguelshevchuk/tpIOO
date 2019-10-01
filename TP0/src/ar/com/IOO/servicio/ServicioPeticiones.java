package ar.com.IOO.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.IOO.dto.PacienteDTO;
import ar.com.IOO.modelo.peticion.Peticion;

public class ServicioPeticiones extends ServicioBase{

	public Boolean tienePeticionesCompletas(PacienteDTO unPaciente){
		
		List<Peticion> peticionesDelPaciente = buscarPeticionesCompletasDe(unPaciente);
		
		return !filtrarPeticionesCompletas(peticionesDelPaciente).isEmpty();
		
	}
	
	private List<Peticion> filtrarPeticionesCompletas(List<Peticion> peticionesDelPaciente){
		
		return peticionesDelPaciente.stream().filter(peticion -> peticion.estaCompleta()).collect(Collectors.toList());

	}
	
	private List<Peticion> buscarPeticionesCompletasDe(PacienteDTO unPaciente){
		
		//Busco la lista de peticiones en la BBDD
		return new ArrayList<Peticion>();
	}
	
	
}

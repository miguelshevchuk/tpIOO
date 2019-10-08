package ar.com.IOO.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import ar.com.IOO.dao.PeticionDAO;
import ar.com.IOO.dto.PacienteDTO;
import ar.com.IOO.dto.PeticionDTO;
import ar.com.IOO.modelo.Sucursal;
import ar.com.IOO.modelo.peticion.Peticion;
import ar.com.IOO.modelo.peticion.Practica;
import ar.com.IOO.modelo.peticion.PracticaPeticion;

public class ServicioPeticiones extends ServicioBase{
	
	private PeticionDAO peticionDAO;

	public void altaPeticion(PacienteDTO unPaciente, List<Practica> unasPracticas){
		
			Peticion peticion = armarPeticion(unPaciente, unasPracticas);
			
			this.peticionDAO.altaPeticion(peticion);
			
	}
	
	public void bajaPeticion(String idPeticion){
		
		this.peticionDAO.bajaPeticion(idPeticion);
		
	}
	

	public void modificarPeticion(PeticionDTO unaPeticion){
		
		this.peticionDAO.modificarPeticion(this.servicioMapeo.mapear(unaPeticion));
		
	}

	private Peticion armarPeticion(PacienteDTO unPaciente, List<Practica> unasPracticas) {
		Peticion peticion = new Peticion();
		
		for(Practica practica : unasPracticas){
			PracticaPeticion practicaPeticion = new PracticaPeticion();
			practicaPeticion.setPractica(practica);
			
			peticion.getPracticas().add(practicaPeticion);
		}

		peticion.setPaciente(this.servicioMapeo.mapear(unPaciente));
		peticion.setFechaDeCarga(new Date());
		peticion.setObraSocial("OSDE");
		peticion.setIdPeticion(UUID.randomUUID().toString());
		peticion.setSucursal(new Sucursal());
		return peticion;
	}
	
	
	public Boolean tienePeticionesCompletas(PacienteDTO unPaciente){
		
		List<Peticion> peticionesDelPaciente = this.buscarPeticionesDe(unPaciente);
		
		return !filtrarPeticionesCompletas(peticionesDelPaciente).isEmpty();
		
	}
	
	private List<Peticion> filtrarPeticionesCompletas(List<Peticion> peticionesDelPaciente){
		
		return peticionesDelPaciente.stream().filter(peticion -> peticion.estaCompleta()).collect(Collectors.toList());

	}
	
	private List<Peticion> buscarPeticionesDe(PacienteDTO unPaciente){
		
		//Busco la lista de peticiones en la BBDD
		return new ArrayList<Peticion>();
	}
	
	
	
	
}

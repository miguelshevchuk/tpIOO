package ar.com.IOO.servicio;

import ar.com.IOO.dto.PacienteDTO;

public class ServicioPacientes extends ServicioBase{

	private ServicioPeticiones servicioPeticiones = new ServicioPeticiones();
	
	public void bajaPaciente(String dniPaciente){
		
		PacienteDTO paciente = new PacienteDTO();
		paciente.setDni(dniPaciente);
		
		if(this.servicioPeticiones.tienePeticionesCompletas(paciente)){
			//Se borra en la BBDD
		}else{
			//Excepcion
		}
		
	}
	
	public void modificarPaciente(String dniPaciente){
		
	}
	
	public void altaPaciente(PacienteDTO unPaciente){
		
	}
	
}

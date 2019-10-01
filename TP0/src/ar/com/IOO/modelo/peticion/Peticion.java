package ar.com.IOO.modelo.peticion;

import java.util.Date;
import java.util.List;

import ar.com.IOO.modelo.Paciente;
import ar.com.IOO.modelo.Sucursal;

public class Peticion {

	private Paciente paciente;
	private String obraSocial;
	private Date fechaDeCarga;
	private List<PracticaPeticion> practicas;
	private Date fechaEntrega;
	private Integer idPeticion;
	private String estado;
	private Sucursal sucursal;

	public Boolean estaCompleta(){
		return this.todasLasPracticasTienenUnResultado();
	}
	
	private Boolean todasLasPracticasTienenUnResultado(){
		return this.practicas.stream().allMatch(practica -> practica.getResultado() != null);

	}
	
	public Boolean esUnaPeticionReservada(){
		return tieneAlgunaPracticaConResultadoReservado();
	}
	
	public Boolean tieneAlgunaPracticaConResultadoReservado(){
		return this.practicas.stream().anyMatch(practica -> practica.tieneResultadoReservado());
	}
	
//	GETTERS Y SETTERS
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public Date getFechaDeCarga() {
		return fechaDeCarga;
	}

	public void setFechaDeCarga(Date fechaDeCarga) {
		this.fechaDeCarga = fechaDeCarga;
	}

	public List<PracticaPeticion> getPracticas() {
		return practicas;
	}

	public void setPracticas(List<PracticaPeticion> practicas) {
		this.practicas = practicas;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Integer getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(Integer idPeticion) {
		this.idPeticion = idPeticion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}

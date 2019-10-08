package ar.com.IOO.excepcion;

public class TienePeticionesCompletasException extends BaseException{

	private static final long serialVersionUID = 1L;

	public TienePeticionesCompletasException() {
		super("PETICIONES_COMPLETAS", "El paciente tiene peticiones completas");
	}

}
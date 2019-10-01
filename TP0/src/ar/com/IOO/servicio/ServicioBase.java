package ar.com.IOO.servicio;

import ar.com.IOO.excepcion.PermisoDenegadoException;

public abstract class ServicioBase {

	private SessionManager sessionManager;

	protected void puedeRealizar(String unaTarea) throws PermisoDenegadoException {	
		
		if(!this.sessionManager.getUsuarioLogueado().puedoRealizar(unaTarea)){
			throw new PermisoDenegadoException();
		}
		
	}

	public SessionManager getSessionManager() {
		return sessionManager;
	}

	public void setSessionManager(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

}

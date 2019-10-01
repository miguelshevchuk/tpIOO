package ar.com.IOO.servicio;

import ar.com.IOO.modelo.usuario.Usuario;

public class SessionManager {

	private Usuario usuarioLogueado;
	
	public Usuario getUsuarioLogueado() {
		return usuarioLogueado;
	}

	public void setUsuarioLogueado(Usuario usuarioLogueado) {
		this.usuarioLogueado = usuarioLogueado;
	}

}

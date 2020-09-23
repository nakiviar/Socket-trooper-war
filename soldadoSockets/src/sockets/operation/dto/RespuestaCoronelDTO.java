package sockets.operation.dto;

import java.io.Serializable;

public class RespuestaCoronelDTO implements Serializable  {

	private String idCoronel;
	private String respuesta;
	
	public String getIdCoronel() {
		return idCoronel;
	}
	public void setIdCoronel(String idCoronel) {
		this.idCoronel = idCoronel;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
}

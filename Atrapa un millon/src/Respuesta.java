
public class Respuesta {
	private String respuesta;
	private boolean correcta;
	
	Respuesta(String respuesta, boolean correcta){
		this.respuesta = respuesta;
		this.correcta = correcta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

	public String toString() {
		return respuesta;
	}
	
	
}

import java.util.ArrayList;

public class Pregunta {
	private String pregunta;
	private ArrayList <Respuesta> respuestas;
	
	Pregunta(String pregunta,ArrayList <Respuesta> respuestas){
		this.pregunta = pregunta;
		
		for(int i = 0; i<respuestas.size();i++) {
			this.respuestas.add(respuestas.get(i));
		}
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public String toString() {
		return pregunta;
	}
	
	
}

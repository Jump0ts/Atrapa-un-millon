import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DAO {
	private static HashMap <Categorias,ArrayList<Pregunta>> bdPreguntas;
	
	public static HashMap<Categorias,ArrayList<Pregunta>> retornaMap() {
		bdPreguntas = new HashMap <Categorias,ArrayList<Pregunta>>();
		bdPreguntas.put(Categorias.ARTE, rellenaPreg(Categorias.ARTE));
		bdPreguntas.put(Categorias.CIENCIA, rellenaPreg(Categorias.CIENCIA));
		bdPreguntas.put(Categorias.DEPORTES, rellenaPreg(Categorias.DEPORTES));
		bdPreguntas.put(Categorias.LITERATURA, rellenaPreg(Categorias.LITERATURA));
		bdPreguntas.put(Categorias.MUSICA, rellenaPreg(Categorias.MUSICA));
		
		return bdPreguntas;
	}
	
	private static ArrayList<Pregunta> rellenaPreg(Categorias cat){
		ArrayList<Pregunta> listaPregunta = new ArrayList<Pregunta>();
		
		switch(cat) {
		case ARTE:listaPregunta.add(new Pregunta("¿Fumas?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
				listaPregunta.add(new Pregunta("¿FumasOno?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
			break;
		case CIENCIA:listaPregunta.add(new Pregunta("¿Fumas?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
				listaPregunta.add(new Pregunta("¿FumasOno?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
			break;
		case DEPORTES:listaPregunta.add(new Pregunta("¿Fumas?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
				listaPregunta.add(new Pregunta("¿FumasOno?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
			break;
		case LITERATURA:listaPregunta.add(new Pregunta("¿Fumas?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
				listaPregunta.add(new Pregunta("¿FumasOno?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
			break;
		case MUSICA:listaPregunta.add(new Pregunta("¿Fumas?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
				listaPregunta.add(new Pregunta("¿FumasOno?",new ArrayList<>( Arrays.asList(new Respuesta("Si",false),new Respuesta("No",true),
				new Respuesta("Si",false),new Respuesta("Pueeze",false)))));
			break;
		default:
			break;
		}
		return listaPregunta;
	}
	
	
}

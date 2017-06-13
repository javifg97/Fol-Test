package Modelo;



public class DatosPreg {
	private Pregunta Preguntas[];

	public DatosPreg() {
			this.Preguntas = new Pregunta[20];
			Preguntas[0] = new Pregunta("preg", "res1","res2"," res3", "res4",1);
		
		
	
	}

	public Pregunta[] getPreguntas() {
		return Preguntas;
	}
	
	
	
}

package Modelo;



public class DatosPreg {
	private Pregunta Preguntas[];

	public DatosPreg() {
			this.Preguntas = new Pregunta[20];
			Preguntas[5] = new Pregunta("¿Cuál de estos bienestares no considera la ONU como salud ?", "Físico","Jurídico"," Psíquico", "Social",2);
			Preguntas[2] = new Pregunta("¿Cuál de estas condiciones de trabajo no influye de forma importante en la generacion de riesgos?", "Seguridad","Psicosociales","Materiales", "Medio-ambientales",3);
			Preguntas[3] = new Pregunta("Un profesor de instituto yendo a trabajar, pasa a dejar a su hija a la escuela, como todas las mañanas y se tropieza con las escaleras del colegio, ¿es considerado un daño profesional?", "Si, porque sucedió en su ruta habitual para ir a trabajar","No"," No, porque sucedió en el colegio no en el instituto", "Si, porque no pudo ir a trabajar",1);
			Preguntas[17] = new Pregunta("Según el tipo de sanción, ¿cuál de estas no es correcta?", "Administrativa","Seguridad social","Estructural", "Penal",3);
			Preguntas[7] = new Pregunta("¿Cuál de estos deberes no corresponde al empresario?", "Formar los trabajadores","Proteccion de embarazados"," Vigilancia periódica de la salud", "Informar de inmediato sobre una situacion perjudicial",4);
			Preguntas[9] = new Pregunta("¿Qué no debes hacer en caso de incendio?", "Abrir solo las puertas que esten calientes","Si se prende su ropa ruede por el suelo"," No se quede dentro del edificio en llamas ", "Procurar ir agachado",1);
			Preguntas[13] = new Pregunta("¿Cuáles son los pasos a seguien en una evaluacion de riesgos?", "Describir el riesgo, Estimar el riesgo e identificar el peligro","Identificar el peligro, describir el riesgo y estimar el riesgo"," Estimar el riesgo, describir el riesgo e identificar el peligro", "Describir el riego, identificar el peligro y estimar el riesgo",2);
			Preguntas[10] = new Pregunta("¿Qué aparato utilizarias para medir la iluminacion?", "Termómetro","Luxómetro","Sonómetro", "Fonómetro",2);
			Preguntas[16] = new Pregunta("¿Cuál de estas fatigas no pertenecen a las fatigas mas frecuentes desarrolladas por usuarios de pantallas?", "Física o muscualar","Emocional","Mental", "Visual",2);
			Preguntas[4] = new Pregunta("¿Cuál de estos tipos de medidas de protección no existe?", "Proteccion individual","Proteccion colectiva","Proteccion especializada en seguridad personal", "Proteccion especial a colectivos específicos",3);
			Preguntas[15] = new Pregunta("Si un trabajador de la construcción tiene una lesión por no ponerse el casco a pesar de las advertencias de su superior...", "...es accidente de trabajo","...no es accidente de trabajo","... no es accidente de trabajo porque no deberia trabajar sin casco", "Ninguna de las anteriores",4);
			Preguntas[1] = new Pregunta("¿Cuál de estos no es un principio básico de la prevención?", "Dar las instrucciones necesarias a los trabajadores","Arreglar tu mismo los posibles riesgos","Evitar los riesgos", "Combatir los riesgos en su origen",2);
			Preguntas[12] = new Pregunta("Si un repartidor tiene un accidente con la furgoneta al desviarse de la ruta que le indicaba el GPS por culpa de unas obras. ¿Se considera accidente de trabajo?", "Si, porque estaba en la furgoneta","no, porque no hizo la ruta que indicaba el trabajo ","Si, porque tambien estan cubiertas las desviaciones de las rutas", "no, por no estar en el centro de trabajo",3);
			Preguntas[14] = new Pregunta("¿Qué factores derivan de la organización del tiempo?", "Ciclos de trabajo breves","Presión en el tiempo de ejecución","nivel de Concentración", "la primera y la segunda",4);
			Preguntas[19] = new Pregunta("El envejecimiento prematuro es causado por", "No comer suficiente fruta","Estar demasiado expuesto al sol","Drogas", "Síndrome del quemado o Burnout",4);
			Preguntas[8] = new Pregunta("¿Qué debe contener un botiquín de una empresa?", "No es necesario tener un botiquín","Gasas estériles, vendas, esparadrapo, apósitos adhesivos, tijeras, pinzas, etc","Un bisturí y alcohol", "Medicamentos",2);
			Preguntas[18] = new Pregunta("¿Cuál de estos pasos son necesarios para elaborar un Plan de Emergencia Básico?", "Definir acciones y grupos de apoyo","Evaluar recursos","Analizar amenazas y riesgos", "Todas son correctas",4);
			Preguntas[11] = new Pregunta("¿la vigilancia de la salud la garantiza un empresario dentro de los riesgos del trabajo?", "Si, aunque puede ser voluntaria para el empresario","Sí, puesto que es su deber","Sí, porque el empresario deber hacer todo por el trabajador", "No, porque es algo que debe hacer el empleado",2);
			Preguntas[6] = new Pregunta("¿Cuál de estos riesgos laboreales no se corresponde con su daño?", "Exposición a ruido - Perdida de audicion","Caídas - Dermatitis","Vibraciones - Artrosis", "Radiaciones - Cirrosis",2);
			Preguntas[0] = new Pregunta("¿Con que puedes medir el sonido?", "Sonómetro","Dosimetro","Termómetro", "La primera y la segunda",4);
		
	
	}

	public Pregunta[] getPreguntas() {
		return Preguntas;
	}
	
	
	
}

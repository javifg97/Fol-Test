package Modelo;



public class DatosPreg {
	private Pregunta Preguntas[];

	public DatosPreg() {
			this.Preguntas = new Pregunta[20];
			Preguntas[0] = new Pregunta("�Cu�l de estos bienestares no considera la ONU como salud ?", "F�sico","Jur�dico"," Ps�quico", "Social",2);
			Preguntas[1] = new Pregunta("�Cu�l de estas condiciones de trabajo no influye de forma importante en la generacion de riesgos?", "Seguridad","Psicosociales","Materiales", "Medio-ambientales",3);
			Preguntas[2] = new Pregunta("Un profesor de instituto yendo a trabajar, pasa a dejar a su hija a la escuela, como todas las ma�anas y se tropieza con las escaleras del colegio, �es considerado un da�o profesional?", "Si, porque sucedi� en su ruta habitual para ir a trabajar","No"," No, porque sucedi� en el colegio no en el instituto", "Si, porque no pudo ir a trabajar",1);
			Preguntas[3] = new Pregunta("Seg�n el tipo de sanci�n, �cu�l de estas no es correcta?", "Administrativa","Seguridad social","Estructural", "Penal",3);
			Preguntas[4] = new Pregunta("�Cu�l de estos deberes no corresponde al empresario?", "Formar los trabajadores","Proteccion de embarazados"," Vigilancia peri�dica de la salud", "Informar de inmediato sobre una situacion perjudicial",4);
			Preguntas[5] = new Pregunta("�Qu� no debes hacer en caso de incendio?", "Abrir solo las puertas que esten calientes","Si se prende su ropa ruede por el suelo"," No se quede dentro del edificio en llamas ", "Procurar ir agachado",1);
			Preguntas[6] = new Pregunta("�Cu�les son los pasos a seguien en una evaluacion de riesgos?", "Describir el riesgo, Estimar el riesgo e identificar el peligro","Identificar el peligro, describir el riesgo y estimar el riesgo"," Estimar el riesgo, describir el riesgo e identificar el peligro", "Describir el riego, identificar el peligro y estimar el riesgo",2);
			Preguntas[7] = new Pregunta("�Qu� aparato utilizarias para medir la iluminacion?", "Term�metro","Lux�metro","Son�metro", "Fon�metro",2);
			Preguntas[8] = new Pregunta("�Cu�l de estas fatigas no pertenecen a las fatigas mas frecuentes desarrolladas por usuarios de pantallas?", "F�sica o muscualar","Emocional","Mental", "Visual",2);
			Preguntas[9] = new Pregunta("�Cu�l de estos tipos de medidas de protecci�n no existe?", "Proteccion individual","Proteccion colectiva","Proteccion especializada en seguridad personal", "Proteccion especial a colectivos espec�ficos",3);
			Preguntas[10] = new Pregunta("Si un trabajador de la construcci�n tiene una lesi�n por no ponerse el casco a pesar de las advertencias de su superior...", "...es accidente de trabajo","...no es accidente de trabajo","... no es accidente de trabajo porque no deberia trabajar sin casco", "Ninguna de las anteriores",4);
			Preguntas[11] = new Pregunta("�Cu�l de estos no es un principio b�sico de la prevenci�n?", "Dar las instrucciones necesarias a los trabajadores","Arreglar tu mismo los posibles riesgos","Evitar los riesgos", "Combatir los riesgos en su origen",2);
			Preguntas[12] = new Pregunta("Si un repartidor tiene un accidente con la furgoneta al desviarse de la ruta que le indicaba el GPS por culpa de unas obras. �Se considera accidente de trabajo?", "Si, porque estaba en la furgoneta","no, porque no hizo la ruta que indicaba el trabajo ","Si, porque tambien estan cubiertas las desviaciones de las rutas", "no, por no estar en el centro de trabajo",3);
			Preguntas[13] = new Pregunta("�Qu� factores derivan de la organizaci�n del tiempo?", "Ciclos de trabajo breves","Presi�n en el tiempo de ejecuci�n","nivel de Concentraci�n", "la primera y la segunda",4);
			Preguntas[14] = new Pregunta("El envejecimiento prematuro es causado por", "No comer suficiente fruta","Estar demasiado expuesto al sol","Drogas", "S�ndrome del quemado o Burnout",4);
			Preguntas[15] = new Pregunta("preg16", "res1","res2","res3", "res4",1);
			Preguntas[16] = new Pregunta("preg17", "res1","res2","res3", "res4",1);
			Preguntas[17] = new Pregunta("preg18", "res1","res2","res3", "res4",1);
			Preguntas[18] = new Pregunta("preg19", "res1","res2","res3", "res4",1);
			Preguntas[19] = new Pregunta("preg20", "res1","res2","res3", "res4",1);
		
	
	}

	public Pregunta[] getPreguntas() {
		return Preguntas;
	}
	
	
	
}

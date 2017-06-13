package Modelo;

public class Pregunta {
	
	private String pregunta;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private String respuesta4;
	private int correcta;
	
	public Pregunta(String preg,String res1,String res2,String res3,String res4, int correcta){
		setPregunta(preg);
		setRespuesta1(res1);
		setRespuesta2(res2);
		setRespuesta3(res3);
		setRespuesta4(res4);
		setCorrecta(correcta);
	}
	
	
	public int getCorrecta() {
		return correcta;
	}


	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}


	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public String getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public String getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public String getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}
	
	
	
	
	
}

package ejecucion;

import Modelo.DatosPreg;
import Vista.vista;

public class test {
	public static void main(String[] args) {
		DatosPreg modelo = new DatosPreg();
		vista vista = new vista();
		
		vista.setModelo(modelo);
		vista.setVisible(true);
		
	}
}

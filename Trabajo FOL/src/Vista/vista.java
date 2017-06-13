package Vista;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Modelo.DatosPreg;
import Modelo.Pregunta;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista extends JFrame {
	private DatosPreg Modelo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnRes4;
	private JRadioButton rdbtnRes3;
	private JRadioButton rdbtnRes2;
	private JRadioButton rdbtnRes1;
	private JLabel lblPregunta;
	public int numPreg;
	private Pregunta Preguntas[];
	private double puntuacion;
	private JLabel lblPuntuacion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public vista() {

		numPreg = -1;
		initialize();

	}

	public void setModelo(DatosPreg modelo) {
		Modelo = modelo;
		this.Preguntas = new Pregunta[20];
		this.Preguntas = Modelo.getPreguntas();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblPregunta = new JLabel("Pregunta1");
		lblPregunta.setBounds(10, 20, 414, 23);

		rdbtnRes1 = new JRadioButton("New radio button");
		rdbtnRes1.setBounds(10, 70, 414, 23);
		buttonGroup.add(rdbtnRes1);

		rdbtnRes2 = new JRadioButton("New radio button");
		rdbtnRes2.setBounds(10, 111, 414, 23);
		buttonGroup.add(rdbtnRes2);

		rdbtnRes3 = new JRadioButton("New radio button");
		rdbtnRes3.setBounds(10, 152, 414, 23);
		buttonGroup.add(rdbtnRes3);

		rdbtnRes4 = new JRadioButton("New radio button");
		rdbtnRes4.setBounds(10, 193, 414, 23);
		buttonGroup.add(rdbtnRes4);

		JButton btnAceptar = new JButton("Iniciar");
		btnAceptar.setBounds(328, 227, 96, 23);

		lblPregunta.setVisible(false);
		rdbtnRes1.setVisible(false);
		rdbtnRes2.setVisible(false);
		rdbtnRes3.setVisible(false);
		rdbtnRes4.setVisible(false);
		getContentPane().setLayout(null);
		getContentPane().add(rdbtnRes1);
		getContentPane().add(rdbtnRes2);
		getContentPane().add(rdbtnRes3);
		getContentPane().add(rdbtnRes4);
		getContentPane().add(lblPregunta);
		getContentPane().add(btnAceptar);

		lblPuntuacion = new JLabel("Puntuacion");
		lblPuntuacion.setBounds(39, 115, 308, 14);
		lblPuntuacion.setVisible(false);
		getContentPane().add(lblPuntuacion);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numPreg == -1) {
					lblPregunta.setVisible(true);
					rdbtnRes1.setVisible(true);
					rdbtnRes2.setVisible(true);
					rdbtnRes3.setVisible(true);
					rdbtnRes4.setVisible(true);

					btnAceptar.setText("Siguiente");

					numPreg = 0;

					setPregunta();
				} else if (numPreg == 19) {
					if (getRes() == 0) {

					} else if (getRes() == Preguntas[numPreg].getCorrecta()) {
						puntuacion = puntuacion + 0.5;
					} else {
						puntuacion = puntuacion - 0.25;
					}
					lblPregunta.setVisible(false);
					rdbtnRes1.setVisible(false);
					rdbtnRes2.setVisible(false);
					rdbtnRes3.setVisible(false);
					rdbtnRes4.setVisible(false);
					lblPuntuacion.setText("Tu puntuacion es: " + puntuacion);
					lblPuntuacion.setVisible(true);
				} else {
					if (getRes() == 0) {

					} else if (getRes() == Preguntas[numPreg].getCorrecta()) {
						puntuacion = puntuacion + 0.5;
					} else {
						puntuacion = puntuacion - 0.25;
					}
					numPreg++;
					setPregunta();
				}

			}
		});
	}

	public void setPregunta() {

		lblPregunta.setText(Preguntas[numPreg].getPregunta());
		rdbtnRes1.setText(Preguntas[numPreg].getRespuesta1());
		rdbtnRes2.setText(Preguntas[numPreg].getRespuesta2());
		rdbtnRes3.setText(Preguntas[numPreg].getRespuesta3());
		rdbtnRes4.setText(Preguntas[numPreg].getRespuesta4());

	}

	public int getRes() {
		if (rdbtnRes1.isSelected()) {
			return 1;
		} else if (rdbtnRes2.isSelected()) {
			return 2;
		} else if (rdbtnRes3.isSelected()) {
			return 3;
		} else if (rdbtnRes4.isSelected()) {
			return 4;
		} else {
			return 0;
		}
	}
}

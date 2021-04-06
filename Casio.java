package ventana;
/**
 * PROYECTO CALCULADORA
 * ENTORNOS DE DESARROLLO
 * DAM
 * 22/3/2021
 * @author ALEJANDRO PELAYO
 */
import java.awt.Color;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Casio extends JFrame{

	public JPanel panel1;  //Creación del panel
	
		public Casio() {
		this.setSize(400,500); 		//**Aqui le doy tamaño a la ventana*/
	    setTitle("Calculadora");	//**Se le da un nombre a la ventana*/
		setLocationRelativeTo(null); //**Aqui posiciono el panel en el centro de la pantalla*/
		this.iniciarComponentes();		//**Esto inicia el programa*/
		setDefaultCloseOperation(EXIT_ON_CLOSE); //**Esto evita dejar el programa abierto*/
	}
	
	private void iniciarComponentes() {			
	this.posicionPanel();//**Aqui creo los metodos*/
	this.posicionBoton();
	this.casilla();
		
	}
	
	private void posicionPanel() {

	panel1 = new JPanel(); //** Aqui he creado el panel*/
		
	panel1.setLayout(null); 			//**El diseño queda desactivado*/
	this.getContentPane().add(panel1); 	//**Agregamos el panel a la ventana*/
	panel1.setBackground(Color.BLUE);	//**Cambiamos el color del panel*/
	this.getContentPane().add(panel1); 	//**Agregamos el panel a la ventana*/
	}
	
	private void posicionBoton() {
		
		
		
		JLabel etiqueta = new JLabel();		//**Aqui se crea la etiqueta de texto//
		etiqueta.setText("calculadora");			//**Aqui se introduce el texto//
		
		JButton botoncoma = new JButton(",");	//**Aqui iniciamos el boton*/
		botoncoma.setBounds(280, 400, 100, 40);	//**Posicionamos el boton*/
		panel1.add(botoncoma);	//**Lo metemos en el panel*/
		
		JButton operadormas = new JButton("+");//**Aqui creamos los operadores */
		operadormas.setBounds(150, 300, 100, 40);
		panel1.add(operadormas);
		
		
		JButton operadormenos = new JButton("-");
		operadormenos.setBounds(150, 350, 100, 40);
		panel1.add(operadormenos);
		
		JButton multiplicacion= new JButton("x");
		multiplicacion.setBounds(280, 350, 100, 40);
		panel1.add(multiplicacion);
		
		JButton division = new JButton("/");
		division.setBounds(20, 350, 100, 40);
		panel1.add(division);
		
		JButton clean = new JButton("=");
		clean.setBounds(280, 300, 100, 40);
		panel1.add(clean);
		
		JButton igual = new JButton("c");
		igual.setBounds(20, 400, 230, 40);
		panel1.add(igual);
		
		
		JButton boton0 = new JButton("0");//Aqui se le da valor numerico a los botones//
		boton0.setBounds(20, 300, 100, 40);
		panel1.add(boton0);
		
		JButton numero1 = new JButton("1");
		numero1.setBounds(20, 250, 100, 40);
		panel1.add(numero1);

		JButton numero2 = new JButton("2");
		numero2.setBounds(150, 250, 100, 40);
		panel1.add(numero2);
		
		
		JButton numero3 = new JButton("3");
		numero3.setBounds(280, 250, 100, 40);
		panel1.add(numero3);
		
		JButton numero4 = new JButton("4");
		numero4.setBounds (20, 200, 100, 40);
		panel1.add(numero4);
		
		JButton numero5 = new JButton("5");
		numero5.setBounds(150, 200, 100, 40);
		panel1.add(numero5);
		
		JButton numero6 = new JButton("6");
		numero6.setBounds(280, 200, 100, 40);
		panel1.add(numero6);
		
		JButton numero7 = new JButton("7");
		numero7.setBounds(20, 150, 100, 40);
		panel1.add(numero7);
		
		JButton numero8 = new JButton("8");
		numero8.setBounds(150, 150, 100, 40);
		panel1.add(numero8);
		
		JButton numero9 = new JButton("9");
		numero9.setBounds(280, 150, 100, 40);
		panel1.add(numero9);
		
	
		
		
		
	}
	
	private void casilla() {
		
		TextField Pantalla = new TextField(); 	//**Aqui iniciamos la casilla donde van a ir los calculos*/
		Pantalla.setBounds(20,50, 350, 60);	//**Aqui la posicionamos y le damos tamaño*/
		panel1.add(Pantalla);					//**Aqui la introduciomos en el panel*/	
		
				
		
		
	}

	//**Aqui metemos los metodos para las operaciones*/
		
	public static int suma(int a, int b) { //**METODO PARA SUMA*/
		int suma=a+b ;
		
		return suma;
	}
	
	public static int Resta(int a, int b) { //**METODO PARA RESTA*/
		int Resta=a-b ;
			
		
		return Resta;
	}
	
	public static int multiplicacion(int a, int b) { //**METODO PARA MULTIPLICACION*/
		int multiplicacion=a*b ;
			
		
		return multiplicacion;
	}
	
	public static int division(int a, int b) {  //**METODO PARA DIVISION*/
		int division=a/b ;
			
		
		return division;
	}
}

	
	




package es.studium.AwtFlow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener,
ActionListener
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	Button btnCelsius = new Button("Celsius a Fahrenheit");
	Button btnFahrenheit = new Button("Fahrenheit a Celsius");


	public Ejercicio1()
	{
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnCelsius);
		ventana.add(btnFahrenheit);
		ventana.setSize(300,100);
		ventana.addWindowListener(this); // añadir la X
		ventana.addWindowListener(this); // añadir el Listener
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}


	public static void main(String[] args)
	{
		new Ejercicio1();
	}


	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource().equals(btnCelsius)) {
			
		}
		
	}


	@Override
	public void windowActivated(WindowEvent arg0)
	{}


	@Override
	public void windowClosed(WindowEvent arg0)
	{}


	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
		
	}


	@Override
	public void windowDeactivated(WindowEvent arg0)
	{}


	@Override
	public void windowDeiconified(WindowEvent arg0)
	{}


	@Override
	public void windowIconified(WindowEvent arg0)
	{}


	@Override
	public void windowOpened(WindowEvent arg0)
	{}

}

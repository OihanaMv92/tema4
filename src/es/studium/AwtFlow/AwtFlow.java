package es.studium.AwtFlow;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtFlow implements WindowListener,
ActionListener
{
	// Componentes
	Frame ventana = new Frame(); //Contenedor
	Button btnAceptar = new Button("Aceptar");
	Button btnCerrar = new Button("Cerrar");
	Button btnGuardar = new Button("Guardar");
	//Constructor
	public AwtFlow()
	{
		ventana.setTitle("Titulo");
		ventana.setLocationRelativeTo(null);//Que salga enmedio de la pantalla
		ventana.setSize(220,200);//Tamaño
		ventana.setResizable(false);//Asi no puede agrandar ni disminuir
		ventana.setLayout(new FlowLayout()); //Para que se vean los 3 botones si no queda uno encima de otro
		ventana.add(btnAceptar); //Botones
		ventana.add(btnCerrar); //Boton
		ventana.add(btnGuardar); //boton
		
		ventana.setVisible(true); //Siempre Ultimo
	}
	public static void main(String[] args)
	{
		new AwtFlow();
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0)
	{
	//System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}

package es.studium.AwtFlow;


import java.awt.*;
// Declaraci�n de la clase AwtBorder que hereda de la Clase Frame
public class AwtBorder extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnBotonN = new Button("Norte");
	Panel pnlNorte = new Panel();
	Button btnBotonS = new Button("Sur");
	Button btnBotonE = new Button("Este");
	Button btnBotonO = new Button("Oeste");
	Button btnBotonC = new Button("Centro");
	Panel pnlCentro = new Panel();
	// Constructor de la clase con el mismo nombre que ella
	public AwtBorder()
	{
		// Establecer la distribuci�n del Frame
		setLayout (new BorderLayout());
		// Establecer el t�tulo de la aplicaci�n
		setTitle ("BorderLayout");
		pnlNorte.add(btnBotonN);
		pnlCentro.add(btnBotonC);
		// A�adir los botones antes creados en posici�n indicada
		add( "North", pnlNorte);
		add( "South", btnBotonS);
		add( "East", btnBotonE);
		add( "West", btnBotonO);
		add( "Center", pnlCentro);
		// Establecer el tama�o del Frame
		setSize(200,200);
		// Centra la ventana en la pantalla
		setLocationRelativeTo(null);
		// Mostrar el Frame en pantalla
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args)
	{
		new AwtBorder();
	}
	
	// Fin del Main
}
// Fin de la Clase
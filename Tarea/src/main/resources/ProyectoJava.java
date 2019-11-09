import javax.swing.*;
import java.awt.event.*;

public class ProyectoJava {

	public ProyectoJava() {
		// TODO Auto-generated constructor stub
	}

	public class Boton extends JFrame implements ActionListener {
		JButton boton;
		JLabel texto;
	}
	public Boton() {
		setLayout(null);
		boton=new JButton("ABRIR");
		boton.setBounds(100,150,100,30);
		boton.addActionListener(this);
		add(boton);
		texto=new JLabel("Presione el botón para abrir.");
		texto.setBounds(50,50,220,40);
		add(texto);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==boton) {
		goToURL("JENKINS_URL/job/Proyecto-Tarea/build?token=TOKEN_NAME o /buildWithParameters?token=TOKEN_NAME");
	try{
	Thread.sleep(3000);
	System.exit(0);
	} catch(Exception excep) {
	System.exit(0);
	}
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boton ventana=new Boton();
		ventana.setBounds(500,250,300,250);
		ventana.setVisible(true);
		ventana.setResizable(false);
	}
	
	

}

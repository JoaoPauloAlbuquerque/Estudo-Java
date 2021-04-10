package intermediario.lotofacil_gui;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame{

	public Principal() {
		/*
		 * instanciando os paineis no frame
		 * */
		this.add(BorderLayout.NORTH,new  PainelTopo());
		
		this.add(BorderLayout.CENTER, new PainelCentro());
		
		this.add(BorderLayout.SOUTH, new PainelInferior());
		
		this.setTitle("Loto Facil");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
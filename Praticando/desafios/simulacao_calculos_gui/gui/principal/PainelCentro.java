package desafios.simulacao_calculos_gui.gui.principal;


import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import desafios.simulacao_calculos_gui.gui.globais.Globais;

public class PainelCentro extends JPanel{

	/*
	 * construtor
	 * */
	public PainelCentro() {
		this.setBackground(Globais.corPainelCentro);
		this.setLayout(new BorderLayout());
	}	
	
	/*
	 * metodo para pintar a logo no painelCentro
	 * */
	public void paintComponent(Graphics g) {
		try {
			super.paintComponent(g);
			ImageIcon imageIcon = new ImageIcon(getClass().getResource("/desafios/simulacao_calculos_gui/gui/img/logo_.png"));
			Image img = imageIcon.getImage();
			g.drawImage(img, (this.getWidth() / 2) - 200, (this.getHeight() / 2) - 200, 400, 400, this);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(this, "Erro inesperado: " + e); 
			return;
		}
	}
}

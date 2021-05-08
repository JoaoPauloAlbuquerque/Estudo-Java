package desafios.simulacao_calculos_gui.gui.categorias;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import desafios.simulacao_calculos_gui.gui.globais.Globais;
import desafios.simulacao_calculos_gui.gui.modelo_formulario.ModeloFormulario;

public class Autos extends JPanel {
    
    /*
	 * criando e instaciando o painel do titulo
	 * */
	private JPanel pTitulo = new JPanel();
	private JLabel lTitulo = new JLabel("Autos");
	
	/*
	 * criando a instancia da classe ModeloFormulario
	 * */
	private ModeloFormulario calculos;
	
	/*
	 * construtor
	 * */
	public Autos() {
		this.setLayout(new BorderLayout());
		
		/*
		 * configurando o painel de titulo
		 * */
		this.add(BorderLayout.NORTH, pTitulo);
		pTitulo.setLayout(new FlowLayout());
		pTitulo.setBackground(Globais.corPainelCentro);
		pTitulo.add(lTitulo);
		lTitulo.setFont(Globais.fontTitulo);
		lTitulo.setForeground(Color.white);
		
		/*
		 * instaciando o painel e configurando ele no painel pai
		 * */
		calculos = new ModeloFormulario();
		this.add(BorderLayout.CENTER, calculos);
		calculos.setBackground(Globais.corPainelCentro);
	}

}

package desafios.simulacao_calculos_gui.gui.principal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import desafios.simulacao_calculos_gui.gui.categorias.*;
import desafios.simulacao_calculos_gui.gui.painel_clientes.Clientes;
import desafios.simulacao_calculos_gui.gui.painel_tabelas.Tabelas;

public class Main extends JFrame {

    /*
	 * ScrollPane parar colocar o PainelCanto
	 * */
	private JScrollPane scroll;
	
	/*
	 * criando e instanciando os paineis principais da tela
	 * */
	private static PainelCanto painelCanto = new PainelCanto();
	public static PainelCentro painelCentro = new PainelCentro();
	
	/*
	 * criando os painceis a que vão ser colocados 
	 * em tempo de execução no frame
	 * */
	public static Autos autos;
	public static Pesados pesados;
	public static Imoveis imoveis;
	public static Tabelas tabelas;
	public static Clientes clientes;
	
	/*
	 * construtor
	 * */
	public Main() {
		/*
		 * configurando o frame
		 * */
		this.setTitle("SubMenus");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setMinimumSize(new Dimension(960, 600));
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		/*
		 * adicionando os componentes
		 * */
		scroll = new JScrollPane(painelCanto);
		
		this.add(BorderLayout.WEST, scroll);
		
		this.add(BorderLayout.CENTER, painelCentro);
		
		this.setVisible(true);
	}
	
	/*
	 * método estatico que vai adicionar os paineis 
	 * ao painelCentro
	 * */
	public static void addPanel(JPanel panel) {
		try {
			removePanel();
			painelCentro.add(BorderLayout.CENTER, panel);
			painelCentro.validate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * metodo estatico que remove todos os paineis 
	 * de dentro do painelCentor
	 * */
	public static void removePanel() {
		painelCentro.removeAll();
		painelCentro.repaint();
		painelCentro.validate();
	}
	
	/*
	 * main
	 * */
	public static void main(String[] args) {
		new Main();
	}

}
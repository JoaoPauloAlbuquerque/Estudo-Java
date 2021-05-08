package desafios.simulacao_calculos_gui.gui.painel_tabelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import desafios.simulacao_calculos_gui.gui.globais.Globais;
import desafios.simulacao_calculos_gui.gui.principal.Main;

public class Tabelas extends JPanel { 
    
    /*
	 * criando e instaciando o painel do titulo
	 * */
	private JPanel pTitulo = new JPanel();
	private JLabel lTitulo = new JLabel("Tabelas");
	
	/*
	 * criando e instaciando os componentes
	 * do painel central
	 * */
	private JPanel pCentro = new JPanel();

	private JComboBox<String> comboCategoria = new JComboBox<String>();
	private JComboBox<String> comboTabela = new JComboBox<String>();
	
	private JLabel lblCategoria = new JLabel("Categoria");
	private JLabel lblTabela = new JLabel("Tabelas");
	
	private JButton btnCancelar = new JButton("Cancelar");
	
	private JTable tblTabelas;
	private JScrollPane scroll;
	
	/*
	 * construtor
	 * */
	public Tabelas() {
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
		 * adicionando o painel centro no painel pai
		 * e congifurando ele 
		 * */
		this.add(BorderLayout.CENTER, pCentro);
		pCentro.setBackground(Globais.corPainelCentro);
		
		/*
		 * chamando o metodo de configuração dos elementos
		 * */
		configElements();
		
		/*
		 * configurando o layout dos componentes e adicionando-os 
		 * nas respectivas posições
		 * */
		GroupLayout layout = new GroupLayout(pCentro);
		pCentro.setLayout(layout);
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCategoria)
										.addComponent(comboCategoria,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTabela)
										.addComponent(comboTabela,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addGap(300, 500, 850)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCancelar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(scroll)));
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoria)
						.addComponent(lblTabela))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboCategoria,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(comboTabela,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scroll)));
		
		/*
		 * ação do botao cancelar
		 * */
		btnCancelar.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				Main.removePanel();
			}
		});
		
		comboCategoria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(comboCategoria.getSelectedItem().toString()) {
				case "Autos" :
					comboTabela.removeAllItems();
					for(String s : Globais.getComboTabelasAutos()) {
						comboTabela.addItem(s);
					}
					break;
				case "Pesados" :
					comboTabela.removeAllItems();
					for(String s : Globais.getComboTabelasPesados()) {
						comboTabela.addItem(s);
					}
					break;
				case "Imóveis" :
					comboTabela.removeAllItems();
					for(String s : Globais.getComboTabelasImoveis()) {
						comboTabela.addItem(s);
					}
					break;					
				}
			}
		});
	}
	
	
	private void configComoBox() {
		
		for(String s : Globais.getComboCategoria()) {
			comboCategoria.addItem(s);
		}
		
		for(String s : Globais.getComboTabelasAutos()) {
			comboTabela.addItem(s);
		}
		
	}
	
	/*
	 * metodo que cria a tabela
	 * */
	private void configTable() {
		String[] colunas = {"Col1", "Col2", "Col3", "Col4", "Col5"};
		String[][] dados = {};
		tblTabelas = new JTable(dados, colunas);
        Globais.configTable(tblTabelas);

		scroll = new JScrollPane(tblTabelas);
		
	}
	
	/*
	 * metodo que chama os metodos da classe Globais para 
	 * configurar os elemtentod do painel
	 * */
	private void configElements() {
		configTable();
		
		configComoBox();
		
		Globais.configButtons(btnCancelar);
		
		Globais.configLabel(lblCategoria);
		Globais.configLabel(lblTabela);
		
		Globais.configTextField(comboCategoria);
		Globais.configTextField(comboTabela);
	}

}

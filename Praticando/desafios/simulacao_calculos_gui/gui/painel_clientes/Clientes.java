package desafios.simulacao_calculos_gui.gui.painel_clientes;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import desafios.simulacao_calculos_gui.gui.globais.Globais;
import desafios.simulacao_calculos_gui.gui.principal.Main;

public class Clientes extends JPanel {
    
    /*
	 * componentes do painel que esta no topo
	 * */
	private JPanel pTitulo = new JPanel();
	private JLabel lTitulo = new JLabel("Clientes");
	
	/*
	 * componentes do painel central
	 * */
	private JPanel pCentro = new JPanel();
	 
	private JLabel lblPesquesa = new JLabel("Pesquisar por nome");
	private JLabel lblFiltro = new JLabel("Filtrar");
	
	private JTextField txtPesquisa = new JTextField();
	private JComboBox<String> comboFiltro = new JComboBox<String>();
	
	private JButton btnBuscar = new JButton("Buscar");
	private JButton btnAtualizar = new JButton("Atualizar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnAbrir = new JButton("Abrir");
	private JButton btnExcluir = new JButton("Excluir");
	
	private JScrollPane scroll;
	private JTable tbl;
	
	/*
	 * construtor
	 * */
	public Clientes() {
		this.setLayout(new BorderLayout());
		
		/*
		 * configurando o painel que esta no topo
		 * */
		this.add(BorderLayout.NORTH, pTitulo);
		pTitulo.setLayout(new FlowLayout());
		pTitulo.setBackground(Globais.corPainelCentro);
		pTitulo.add(lTitulo);
		lTitulo.setFont(Globais.fontTitulo);
		lTitulo.setForeground(Color.white);
		
		/*
		 * configurando o painel central
		 * */
		this.add(pCentro);
		pCentro.setBackground(Globais.corPainelCentro);
		GroupLayout layout = new GroupLayout(pCentro);
		pCentro.setLayout(layout);
		
		/*
		 * chamando o metodo que configura todo os 
		 * elementos da tela
		 * */
		configElements();
		
		/*
		 * configurando o GroupLayout e adicionando 
		 * os elementos nas suas devidas posições
		 * */
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPesquesa)
										.addComponent(txtPesquisa,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFiltro)
										.addComponent(comboFiltro,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAbrir,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addGap(200,200,240)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnBuscar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAtualizar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addGap(350, 500,900)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCancelar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnExcluir,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(scroll)));
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPesquesa))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPesquisa,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFiltro))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboFiltro,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAtualizar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAbrir,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExcluir,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scroll)));
		
		/*
		 * definindo que os botoes tenham sempre o mesmo tamanho
		 * */
		layout.linkSize(SwingConstants.CENTER, btnAbrir, btnAtualizar, btnBuscar, btnCancelar, btnExcluir);
		
		/*
		 * ação para o botao Cancelar
		 * */
		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.removePanel();
			}
		});
	}
	
	/*
	 * metodo que cria a tabela
	 * */
	private void createTable() {
		String[] colunas = {"Col1", "Col2", "Col3", "Col4", "Col5"};
		String[][] dados = {};
		tbl = new JTable(dados, colunas);
        Globais.configTable(tbl);

		scroll = new JScrollPane(tbl);
	}
	
	/*
	 * metodo que chama os metodo da classe Globais para configurar 
	 * todos os componentes da tela
	 * */
	private void configElements() {
		createTable();
		
		Globais.configLabel(lblPesquesa);
		Globais.configLabel(lblFiltro);
		
		Globais.configTextField(txtPesquisa);
		Globais.configTextField(comboFiltro);
		
		Globais.configButtons(btnAbrir);
		Globais.configButtons(btnAtualizar);
		Globais.configButtons(btnBuscar);
		Globais.configButtons(btnCancelar);
		Globais.configButtons(btnExcluir);
	}

}

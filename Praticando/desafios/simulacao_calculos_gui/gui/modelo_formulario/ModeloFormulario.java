package desafios.simulacao_calculos_gui.gui.modelo_formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import desafios.simulacao_calculos_gui.gui.globais.Globais;
import desafios.simulacao_calculos_gui.gui.principal.PainelCanto;
import desafios.simulacao_calculos_gui.gui.principal.Main;

public class ModeloFormulario extends JPanel {
    
    /*
	 * criando e instanciando os componentes
	 * do painel que vai estar o formulario 
	 * de calculo 
	 * */
	private JLabel lblValor = new JLabel("Valor");
	private JLabel lblEntrada = new JLabel("Entrada");
	private JLabel lblTabela = new JLabel("Tabela");
	private JLabel lblCarta = new JLabel("Carta");
	private JLabel lblReducao = new JLabel("Redução (%)");
	private JLabel lblMeses = new JLabel("Meses (Opcional)");
	private JLabel lblValores = new JLabel("Valores:");
	private JLabel lblResultados = new JLabel("Resultados:");
	
	private JTable tabelaValores;
	private JTable tabelaResultado;
	
	private JScrollPane scrollValores;
	private JScrollPane scrollResultados; 
	
	private JTextField txtValor = new JTextField();
	private JTextField txtEntrada = new JTextField();
	private JTextField txtCarta = new JTextField();
	
	private JComboBox<String> comboTabela = new JComboBox<String>();
	
	private JSpinner numericReducao = new JSpinner();
	private JSpinner numericMeses = new JSpinner();
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnResetar = new JButton("Resetar");
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnCancelar = new JButton("Cancelar");
	
	/*
	 * construtor
	 * */
	public ModeloFormulario() {
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		
		/*
		 * chamando os metodos de configurações 
		 * dos elementos do painel
		 * */
		
		configElements();
		
		/*
		 * configurando o layout do painel e adicionando 
		 * os componentes nas suas devidas posições
		 * */
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);

		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(0,40,150)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblValor)
										.addComponent(txtValor,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCarta)
										.addComponent(txtCarta,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addGap(150,230,270)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEntrada)
										.addComponent(txtEntrada,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblReducao)
										.addComponent(numericReducao,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addGap(150,230,270)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTabela)
										.addComponent(comboTabela,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMeses)
										.addComponent(numericMeses,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblValores)
						.addComponent(lblResultados)
						.addComponent(scrollValores)
						.addComponent(scrollResultados))
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalcular,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnResetar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)));
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValor)
						.addComponent(lblEntrada)
						.addComponent(lblTabela))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtValor,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEntrada,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(comboTabela,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCarta)
						.addComponent(lblReducao)
						.addComponent(lblMeses))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCarta,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(numericReducao,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(numericMeses,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValores))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollValores)
						.addGroup(layout.createSequentialGroup()
								.addGap(60,60,90)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCalcular,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResultados))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollResultados)
						.addGroup(layout.createSequentialGroup()
								.addGap(10,30,50)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnResetar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnSalvar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCancelar,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)))));
		
		/*
		 * definindo que os botões tenham sempre o mesmo tamanho
		 * */
		layout.linkSize(SwingConstants.HORIZONTAL, btnCalcular, btnSalvar, btnCancelar, btnResetar);
		
		/* ação do botao cancelar
		 * */
		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.removePanel();
			}
		});
	}
	
	/*
	 * metodo que crai a tabela dos valores
	 * */
	private void createTableValores() {

        String[] coluns = {"Col1", "Col2", "Col3", "Col4", "Col5"};
        String[][] data = {};

        tabelaValores = new JTable(data, coluns);
        Globais.configTable(tabelaValores);

        scrollValores = new JScrollPane(tabelaValores);

    }
	
	/*
	 * metodo que cria a tabela dos resultados
	 * */
	private void createTableResultado() {
		String[] colunas = {"Col1", "Col2", "Col3", "Col4", "Col5"};
		String[][] dados = {};
		tabelaResultado = new JTable(dados, colunas);
        Globais.configTable(tabelaResultado);

		scrollResultados = new JScrollPane(tabelaResultado);
	}
	
	/*
	 * metodo que chama os metodo de configuração da classe 
	 * Globais para os elementos da tela 
	 * */
	private void configElements() {	
		createTableValores();
		createTableResultado();
		
		Globais.configTextField(txtCarta);
		Globais.configTextField(txtEntrada);
		Globais.configTextField(numericReducao);
		Globais.configTextField(numericMeses);
		Globais.configTextField(comboTabela);
		Globais.configTextField(txtValor);
		
		Globais.configLabel(lblCarta);
		Globais.configLabel(lblEntrada);
		Globais.configLabel(lblMeses);
		Globais.configLabel(lblReducao);
		Globais.configLabel(lblResultados);
		Globais.configLabel(lblTabela);
		Globais.configLabel(lblValor);
		Globais.configLabel(lblValores);
		
		Globais.configButtons(btnCalcular);
		Globais.configButtons(btnCancelar);
		Globais.configButtons(btnResetar);
		Globais.configButtons(btnSalvar);
	}

}

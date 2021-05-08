package desafios.simulacao_calculos_gui.gui.globais;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Globais {
    
    /*
	 * Cor para configurar os botoes do menus da classe PainelCanto
	 * */
	public static final Color corButtonsMenus = new Color(25,25,112);
	
	/*
	 * cor para configurar os botoes do subMenu da classe PainelCanto
	 * */
	public static final Color corButtonsSubMenus = new Color(51,51,167);
	
	/*
	 * cor para configurara o painelCentro
	 * */
	public static final Color corPainelCentro = new Color(21,21,68);
	
	/*
	 * cor dos botoes de saida ou exclusão
	 * */
	public static final Color corFontButtonsSaida = new Color(255,99,71);
	
	/*
	 * Cor para configurar o cabeçalho das tabelas
	 * */
	public static final Color corHeaderTable = new Color(25,25,112);
	
	/*
	 * cor para configurar as células das tabelas
	 * */
	public static final Color corCellTable = new Color(51,51,167);
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * fonte para configurar os titulo dos paineis
	 * */
	public static final Font fontTitulo = new Font("Arial", Font.BOLD, 35);
	
	/*
	 * fonte para configurar os botoes do painelCanto
	 * */
	public static final Font fontButtons = new Font("Arial", Font.BOLD, 20);
	
	/*
	 * fonte para configurar os elementos do painel Calculos
	 * */
	public static final Font fontElements = new Font("Arial", Font.BOLD, 20);
	
	/*
	 * fonte para configurar os cabeçalhos das tabelas
	 * */
	public static final Font fontHeaderTable = new Font("Arial", Font.BOLD, 15);
	
	/*
	 * fonte para configurar as células das tabelas
	 * */
	public static final Font fontCellTable = new Font("Arial", Font.BOLD, 15);
	
	
	
	
	
	
	
	
	
	
	
	
	public static String[] getComboCategoria(){
		
		String[] comboCategoria = new String[3];
		
		comboCategoria[0] = "Autos";
		comboCategoria[1] = "Pesados";
		comboCategoria[2] = "Imóveis";
		
		return comboCategoria;
	}
	
	public static String[] getComboTabelasAutos(){
		String[] comboTabela1 = new String[5];
		
		comboTabela1[0] = "Autos 7.1";
		comboTabela1[1] = "Autos 5.6";
		comboTabela1[2] = "Autos 4.7";
		comboTabela1[3] = "Autos 3.7";
		comboTabela1[4] = "Autos 2.5";
		
		return comboTabela1;
	}
	
	public static String[] getComboTabelasPesados(){
		String[] comboTabela2 = new String[6];
		
		comboTabela2[0] = "Pesados 8";
		comboTabela2[1] = "Pesados 7";
		comboTabela2[2] = "Pesados 6.2";
		comboTabela2[3] = "Pesados 5.5";
		comboTabela2[4] = "Pesados 4.2";
		comboTabela2[5] = "Pesados 5.1";
		
		return comboTabela2;
	}
	
	public static String[] getComboTabelasImoveis(){
		String[] comboTabela3 = new String[6];
		
		comboTabela3[0] = "Imóveis 8";
		comboTabela3[1] = "Imóveis 6.9";
		comboTabela3[2] = "Imóveis 6.2";
		comboTabela3[3] = "Imóveis 5.5";
		comboTabela3[4] = "Imóveis 4.2";
		comboTabela3[5] = "Imóveis 3.1";
		
		return comboTabela3;
	}
	
	
	
	
	
	
	
	/*
	 * método padrão para configurar os JTextFields
	 * */
	public static void configTextField(JTextField txt) {
		txt.setPreferredSize(new Dimension(200, 30));
		txt.setHorizontalAlignment(txt.CENTER);
		txt.setFont(Globais.fontElements);
	}
	
	/*
	 * sobrecarga do metodo configTextField 
	 * para poder usar no JSpinner
	 * */
	public static void configTextField(JSpinner numeric) {
		numeric.setPreferredSize(new Dimension(200, 30));
		numeric.setFont(Globais.fontElements);
	}
	
	/*
	 * sobrecarga do metodo configTextField 
	 * para poder usar no JComboBox
	 * */
	public static void configTextField(JComboBox<String> combo) {
		combo.setPreferredSize(new Dimension(200, 30));
		combo.setFont(Globais.fontElements);
	}
	
	/*
	 * método padrão para configurar os JLabels
	 * */
	public static void configLabel(JLabel lbl) {
		lbl.setFont(Globais.fontElements);
		lbl.setForeground(Color.white);
	}
	
	/*
	 * método padrão para configurar os JButtons
	 * */
	public static void configButtons(JButton button) {
		button.setPreferredSize(new Dimension(150,40));
		button.setFont(Globais.fontButtons);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setBackground(Color.BLUE);
		if(button.getText() == "Sair" || button.getText() == "Excluir") {
			button.setForeground(Globais.corFontButtonsSaida);
		}else {
			button.setForeground(Color.WHITE);
		}
		button.setBorder(new LineBorder(Color.BLACK));
	}
	
	public static JTable configTable(JTable tbl) {
		tbl.setFillsViewportHeight(true);
		tbl.setRowHeight(30);	//define a altura da linha
		tbl.setFont(fontCellTable);
		tbl.setForeground(Color.WHITE);
		tbl.setBackground(corCellTable);
		tbl.getTableHeader().setReorderingAllowed(false);	//bloqueia para que o usuario nao possa mudar a coluna de lugar
		tbl.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//permite apenas uma celula selecionada por linha
		tbl.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//permite apenas uma celular selecionada por coluna
		tbl.setCellSelectionEnabled(true);	//permite que uma celula seja selecionada
		JTableHeader header = tbl.getTableHeader();
		header.setBackground(corHeaderTable);
		header.setForeground(Color.WHITE);
		header.setFont(fontHeaderTable);
		header.setResizingAllowed(false);	//bloqueia o redimensionamento das colunas
		if(tbl.getName() == "tblClientes") {
			header.setResizingAllowed(true);	//bloqueia o redimensionamento das colunas
			tbl.setFont(new Font("Arial", Font.BOLD, 10));
		}
		header.setSize(new Dimension(50,20));
		DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
		cellRender.setHorizontalAlignment(JLabel.CENTER);	//define o alinhamento centralizado das celulas
		for(int i = 0; i < tbl.getModel().getColumnCount(); i++) {
			tbl.getColumnModel().getColumn(i).setCellRenderer(cellRender);
		}
		return tbl;
	}
	public static JTable configTableResult(JTable tbl){
		tbl.setFillsViewportHeight(true);
		tbl.setRowHeight(30);	//define a altura da linha
		tbl.setFont(fontCellTable);
		tbl.setForeground(Color.WHITE);
		tbl.setBackground(corCellTable);
		tbl.getTableHeader().setReorderingAllowed(false);	//bloqueia para que o usuario nao possa mudar a coluna de lugar
		tbl.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//permite apenas uma celula selecionada por linha
		tbl.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//permite apenas uma celular selecionada por coluna
		tbl.setCellSelectionEnabled(true);	//permite que uma celula seja selecionada
		JTableHeader header = tbl.getTableHeader();
		header.setBackground(corHeaderTable);
		header.setForeground(Color.WHITE);
		header.setFont(fontHeaderTable);
		header.setResizingAllowed(false);	//bloqueia o redimensionamento das colunas
		header.setSize(new Dimension(50,20));
		DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
		cellRender.setHorizontalAlignment(JLabel.CENTER);	//define o alinhamento centralizado das celulas
		for(int i = 0; i < tbl.getModel().getColumnCount(); i++) {
			tbl.getColumnModel().getColumn(i).setCellRenderer(cellRender);
		}
		return tbl;
	}

}

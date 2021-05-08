package desafios.simulacao_calculos_gui.gui.principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import desafios.simulacao_calculos_gui.gui.painel_clientes.Clientes;
import desafios.simulacao_calculos_gui.gui.globais.Globais;
import desafios.simulacao_calculos_gui.gui.categorias.*;
import desafios.simulacao_calculos_gui.gui.painel_tabelas.Tabelas;

public class PainelCanto extends JPanel{
	
	
	
	/*
	 * Botões do painel esquerdo
	 **/
	private JButton bSimulacao = new JButton("Simulações");
	private JButton bAutos = new JButton("Autos");
	private JButton bPesados = new JButton("Pesados");
	private JButton bImoveis = new JButton("Imóveis");
	private JButton bTabelas = new JButton("Tabelas");
	private JButton bCliente = new JButton("Clientes");
	private JButton bSair = new JButton("Sair");
	private JButton home = new JButton();

	
	/*
	 * Label que recebe a logo do painelCanto
	 * */
	private JLabel logo = new JLabel();
	
	public PainelCanto() {
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		this.setBackground(Globais.corButtonsMenus);
		
		/*
		 * chamando os metodos de configurações do menu
		 * */
		configButtonsMenu();
		configButtonsSubMenus();
		setVisibleButtonsSubMenus(false);
		setCursorButtons();
		bSair.setForeground(Globais.corFontButtonsSaida);
		
		/*
		 * chamando o metodo que adiciona ventos ao botões
		 * do subMenu
		 * */
		addActionButtonSubMenus(bAutos);
		addActionButtonSubMenus(bPesados);
		addActionButtonSubMenus(bImoveis);
		
		addActionButtonMenus(home);
		addActionButtonMenus(bCliente);
		addActionButtonMenus(bTabelas);
		
		/*
		 * definindo a imagem ao botao home
		 * */
		try {
			ImageIcon img = new ImageIcon(getClass().getResource("/desafios/simulacao_calculos_gui/gui/img/home.png"));		
			home.setIcon(img);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar imagens: "+e.getMessage());
		}

		/*
		 * definindo a logo no painelCanto
		 * e definindo o tamanho para a logo
		 * */
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/desafios/simulacao_calculos_gui/gui/img/logo_.png"));
		logo.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(145, 145, Image.SCALE_SMOOTH)));
		
		/*
		 * adicionando os componentes do menu nas
		 * suas respectivas ordens
		 * */
		this.add(logo);
		this.add(home);
		this.add(bSimulacao);
		this.add(bAutos);
		this.add(bPesados);
		this.add(bImoveis);
		this.add(bCliente);
		this.add(bTabelas);
		this.add(Box.createGlue()); //adiciona um espaço em branco x ou no y
		this.add(bSair);
		
		/*
		 * adicionando o evento no botao simulação
		 * */
		bSimulacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisibleButtonsSubMenus();
			}
		});
		
		/*
		 * adicionando um evendo ao botao home para 
		 * remover todos os paineis do painelCentro
		 * */
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisibleButtonsSubMenus(false);
				Main.removePanel();
			}
		});
		
		
		/*
		 * evento para fechar a janela
		 * */
		bSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	/*
	 * este metodo chama para cada botão do menu o 
	 * metodo que configura a dimensão e as cores dele
	 * */
	private void configButtonsMenu() {
		setFontButtonsMenus(bSimulacao, Globais.corButtonsMenus);
		setFontButtonsMenus(bTabelas, Globais.corButtonsMenus);
		setFontButtonsMenus(bCliente, Globais.corButtonsMenus);
		setFontButtonsMenus(bSair, Globais.corButtonsMenus);
		setFontButtonsMenus(home, Globais.corButtonsMenus);
	}
	
	
	
	/*
	 * este metodo chama para cada botão do subMenu o metodo
	 * que configura as cores e a dimensão dos botões
	 * */
	private void configButtonsSubMenus() {
		setFontButtonsMenus(bAutos, Globais.corButtonsSubMenus);
		setFontButtonsMenus(bPesados, Globais.corButtonsSubMenus);
		setFontButtonsMenus(bImoveis, Globais.corButtonsSubMenus);
	}

	/*
	 * este é o metodo que configura a dimensão e as cores 
	 * dos botoes do menu
	 * */
	private void setFontButtonsMenus(JButton jButton, Color cor) {
		jButton.setFont(Globais.fontButtons);
		jButton.setBackground(cor);
		jButton.setForeground(Color.WHITE);
		jButton.setMaximumSize(new Dimension(150,50));
		jButton.setPreferredSize(new Dimension(150,50));
		jButton.setMinimumSize(new Dimension(150,50));
	}
	
	/*
	 * este metodo controla a visibilidade dos botões
	 * do subMenu
	 * */
	private void setVisibleButtonsSubMenus() {
		if(bAutos.isVisible()) {
			bAutos.setVisible(false);
			bPesados.setVisible(false);
			bImoveis.setVisible(false);
		}else {
			bAutos.setVisible(true);
			bPesados.setVisible(true);
			bImoveis.setVisible(true);
		}
	}
	
	/*
	 * sobrecarda do metodo setVisibleButtonsSubMenus
	 * */
	private void setVisibleButtonsSubMenus(boolean bool) {
		bAutos.setVisible(bool);
		bPesados.setVisible(bool);
		bImoveis.setVisible(bool);
	}
	
	/*
	 * este metodo define o cursor para todos os botões
	 * do painel 
	 * */
	private void setCursorButtons() {
		bSimulacao.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bAutos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bPesados.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bImoveis.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bTabelas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
		home.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	
	/*
	 * este metodo adiciona o evento para cada botão 
	 * do menu. Você vai definir o botao passando pelo parametro
	 * na chamada dele
	 * */
	private void addActionButtonSubMenus(JButton jButton) {
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jButton == bAutos) {
					try {
						new Thread() {
							public void run() {
								setVisibleButtonsSubMenus(false);
								Main.autos = new Autos();
								Main.addPanel(Main.autos);
							}
						}.start();
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Erro ao abrir formulario: " + erro);
					}
				} else if(jButton == bPesados) {
					try {
						new Thread() {
							public void run() {
								setVisibleButtonsSubMenus(false);
								Main.pesados = new Pesados();
								Main.addPanel(Main.pesados);
							}
						}.start();
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Erro ao abrir formulario: " + erro);
					}
				} else if(jButton == bImoveis) {
					try {
						new Thread() {
							public void run() {
								setVisibleButtonsSubMenus(false);
								Main.imoveis = new Imoveis();
								Main.addPanel(Main.imoveis);
							}
						}.start();
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Erro ao abrir formulario: " + erro);
					}
				}
				
			}
		});
	}
	
	
	/*
	 * adiciona eventos aos botoes do menus principal
	 * definido pelo parametro 
	 * */
	private void addActionButtonMenus(JButton jButton) {
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jButton == bTabelas) {
					try {
						new Thread() {
							public void run() {
								setVisibleButtonsSubMenus(false);
								Main.tabelas = new Tabelas();
								Main.addPanel(Main.tabelas);
							}
						}.start();
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Erro ao abrir formulario: " + erro);
					}
				} else if(jButton == bCliente) {
					try{
						new Thread() {
							public void run() {
								setVisibleButtonsSubMenus(false);
								Main.clientes = new Clientes();
								Main.addPanel(Main.clientes);
							}
						}.start();
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Erro ao abrir formulario: " + erro);
					}
				}
			}
		});
	}
}

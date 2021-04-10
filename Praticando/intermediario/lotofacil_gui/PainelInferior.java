package intermediario.lotofacil_gui;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PainelInferior extends JPanel{
	
	//criando os botões
	JButton btnGerar = new JButton("Gerar Numeros");
	JButton btnSair = new JButton("Sair");
	
	//configurações dos elementos
	Font fonte = new Font("Arial", Font.PLAIN, 20);
	Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	public PainelInferior() {
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		//configurando os elementos
		btnSair.setFont(fonte);
		btnSair.setCursor(cursor);
		btnGerar.setFont(fonte);
		btnGerar.setCursor(cursor);
		
		//adicionando os elementos no painel
		this.add(btnGerar);
		this.add(btnSair);
		
		//evento do botao Gerar
		btnGerar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				verificacao();
			}
		});
		
		//evento do botao Sair
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	//verificando os dados ja validades
	private void verificacao() {
		if(!(validacao(0, 15, 1))) {
			return;
		}
		if(!(validacao(15, 30, 2))) {
			return;
		}
		if(!(validacao(30, 45, 3))) {
			return;
		}
		if(!(validacao(45, 60, 4))) {
			return;
		}
		if(!(validacao(60, 75, 5))) {
			return;
		}
	}
	
	
	//validando os dados
	private boolean validacao(int inicio, int fim, int sorteio) {
		//variaveis de controle
		int n = 0;
		int v = 0;
		
		//for externo
		for(int j = inicio; j < fim; j++) {
			
			//validação de dados numericos
			try {
				n = Integer.parseInt(PainelCentro.campos.get(inicio).getText());
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Insira apenas numeros!");
				return false;
			}
			
			//for interno
			for(int i = inicio+1; i < fim; i++) {
				
				//validação de dados numericos
				try {
					v = Integer.parseInt(PainelCentro.campos.get(i).getText());
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Insira apenas numeros!");
					return false;
				}
				
				//validação de valores repetidos
				if(n==v) {
					JOptionPane.showMessageDialog(null, "valores repetidos no sorteio " + sorteio);
					return false;
				}
			}
			
			//verificação de valores invalidos
			if(n<1||n>25) {
				JOptionPane.showMessageDialog(null, "valores inválido no sorteio " + sorteio);
				return false;
			}
			inicio++;
		}
		return true;
	}
	
}
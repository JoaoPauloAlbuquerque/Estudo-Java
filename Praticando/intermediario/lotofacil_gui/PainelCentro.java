package intermediario.lotofacil_gui;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class PainelCentro extends JPanel{

	//array para armazenar os campos de textos
	public static ArrayList<JTextField> campos = new ArrayList<JTextField>();
	
	//fonte
	private Font fonte = new Font("Arial", Font.BOLD, 30);
	
	public PainelCentro() {
		
		this.setLayout(new GridLayout(5,10));
		
		//chamando o metodo para criar os campos de texto painel
		this.criarCampos(this);

	}
	
	//metodo para craição de campos de textos
	private void criarCampos(JPanel painel) {
		//variaveis de controle
		int contador = 0;
		int contadorLabel = 1;
		//loop para adicionar os campos de textos
		for(int i = 0; i < 75; i++) {
			campos.add(new JTextField(2));	//criando e adicionando os campos de textos no array
			campos.get(i).setFont(fonte);	//configurando a fonte dos campos de textos
			contador++;
			//verificação do index para poder colocar o nome do sorteio
			if(contador == 1 || contador == 16 || contador == 31 || contador == 46 || contador == 61) {
				painel.add(new JLabel("Sorteio " + contadorLabel));
				contadorLabel++;
			}
			//adicionando os campos de textos no painel
			painel.add(campos.get(i));
		}
	}	
}
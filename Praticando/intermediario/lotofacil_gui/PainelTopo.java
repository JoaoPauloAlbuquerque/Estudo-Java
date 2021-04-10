package intermediario.lotofacil_gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class PainelTopo extends JPanel{

	//frase do titulo
	JLabel titulo = new JLabel("Loto Fácil");
	//configuração a fonte do titulo
	Font fonte = new Font("Arial", Font.BOLD, 50);
	
	public PainelTopo() {
		//configurando o titilo
		titulo.setFont(fonte);
		titulo.setForeground(Color.white);
		//adicionando o titulo
		this.add(titulo);
		//mudando a cor do fundo
		this.setBackground(new Color(0,139,139));
	}
	
}

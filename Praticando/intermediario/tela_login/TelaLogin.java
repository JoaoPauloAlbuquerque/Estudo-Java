package intermediario.tela_login;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    public TelaLogin(){
        super("Teste");
        //configurando o inicio do frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        //criando os paineis
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        JPanel painel = new JPanel();
        JPanel pTitulo = new JPanel();
        
        
        //configurando os paineis
        pTitulo.setLayout(new FlowLayout());
        pTitulo.setBackground(Color.CYAN);
        pTitulo.setPreferredSize(new Dimension(400,50));
        //------------------------------
        painel.setLayout(null);
        painel.setBackground(Color.CYAN);
        painel.setPreferredSize(new Dimension(400,250));
        
        
        //criando os componentes
        JButton btn = new JButton("Sair");
        btn.setForeground(Color.RED);
        btn.setCursor(new Cursor(HAND_CURSOR));
        btn.setFont(new Font("Arial", Font.BOLD, 15));
        //------------------------------
        JButton btn1 = new JButton("Ok");
        btn1.setCursor(new Cursor(HAND_CURSOR));
        btn1.setFont(new Font("Arial", Font.BOLD, 15));
        //------------------------------
        JLabel lblTitulo = new JLabel("Tela de login");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        //------------------------------
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        //------------------------------
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        //------------------------------
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        //------------------------------
        JTextField txtSenha = new JTextField(20);
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        
        //adicionando os componentes nos paineis
        pTitulo.add(lblTitulo);
        painel.add(lblUsuario);
        painel.add(txtUsuario);
        painel.add(lblSenha);
        painel.add(txtSenha);
        painel.add(btn);
        painel.add(btn1);
        
        
        //adicionando os paineis no frame
        painelPrincipal.add(BorderLayout.CENTER, painel);
        painelPrincipal.add(BorderLayout.NORTH, pTitulo);
        this.add(BorderLayout.CENTER, painelPrincipal);
        
        
        //finalizando as configurações do frame
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        
        
        //configurando as posições dos componentes
        int a = painelPrincipal.getSize().height;
        int l = painelPrincipal.getSize().width;
        
        int a1 = painel.getSize().height;
        int l1 = painel.getSize().width;
        
        btn.setBounds(l1-80,a1-40,70,30);
        //------------------------------
        btn1.setBounds(l1-160,a1-40,70,30);
        //------------------------------
        lblUsuario.setBounds(65, 40, 80, 30);
        //------------------------------
        txtUsuario.setBounds((lblUsuario.getLocation().x + (lblUsuario.getSize().width)), 40, 200, 30);
        //------------------------------
        lblSenha.setBounds(65, 100, 80, 30);
        //------------------------------
        txtSenha.setBounds((lblSenha.getLocation().x + (lblSenha.getSize().width)), 100, 200, 30);
        
        
        //configurando os eventos dos botões
        //evendo de sair
        btn.addActionListener((ae) -> {
            System.exit(0);
        });
        //evento do botao OK
        btn1.addActionListener((ae) -> {
            if(txtUsuario.getText().length() < 1 || txtSenha.getText().length() < 1){
                return;
            }
            String usuario = txtUsuario.getText();
            String senha = txtSenha.getText();
            JOptionPane.showMessageDialog(null, "Usuario: " + usuario + "\nSenha: " + senha);
        });
        
        //iniciando o frame
        this.setVisible(true);
    } 
    
    public static void main(String[] args){
        TelaLogin t = new TelaLogin();
    }   
}

package intermediario.paineis;

import javax.swing.JFrame;

public class Principal extends JFrame{

    public Principal(){
        this.setTitle("Principal");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Principal();
    }
}

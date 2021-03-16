package basico.conversoes_numericas;

public class Conversoes{
    public static void main(String[] args){

        //CONVERTENDO DE INT PARA FLOAT
        int n1 = 10;
        float n2 = n1;
        
        //CONVERTENDO DE FLOAT PARA INT
        float n3 = 15.5f;
        int n4 = (int) n3;

        //CONVERTENDO DO INT PARA STRING
        int n5 = 10;
        String txt1 = Integer.toString(n5);

        //CONVERTENDO DE STRING PARA INT
        String txt2 = "10";
        int n6 = Integer.parseInt(txt2);
    }
}
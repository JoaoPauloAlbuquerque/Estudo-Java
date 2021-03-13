package estruturas_condicionais;

public class EstruturasDeDecisao {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 15;
        int maior = 0;

        //CONDICIONAL IF/ELSE
        if(n1>n2){
            maior = n1;
        }else{
            maior = n2;
        }
        
        
        //=========================================
        int n3 = 25;
        int n4 = 30;
        int maior1 = 0;
        
        //OPERADOR TERNÁRIO
        maior1 = n3>n4?n3:n4;

        System.out.println(maior);
        System.out.println(maior1);
    }
}

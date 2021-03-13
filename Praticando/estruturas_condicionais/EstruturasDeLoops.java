package estruturas_condicionais;

public class EstruturasDeLoops {
    public static void main(String[] args){
        //LOOP FOR
        int n1 = 0;
        for(int i = 0; i<10; i++){
            n1 += 1;
        }

        System.out.println("n1 = " + n1);

        //LOOP WHILE (FAZ A VERIFICAÇÃO PRIMEIRO)
        int n2 = 0;
        while(n2 < 20){
            n2 += 1;
        }

        System.out.println("n2 = " + n2);

        //LOOP DO-WHILE (FAZ A VERIFICAÇÃO POR ULTIMO)
        int n3 = 0;
        do{
            n3 += 1;
        }while(n3 < 30);

        System.out.println("n3 = " + n3);
    }
}

package basico.array;

public class Array {

    public static void main(String[] args){
        //CONSTATNE DE TAMANHO DO ARRAY
        final int tam = 5;

        //CRIANDO OS ARRAYs
        int[] num1 = {5, 2, 15, 19, 12, 0};
        int[] num = new int[tam];

        //POPULANDO O ARRAY NUM
        num[0] = 10;
        num[1] = 5;
        num[2] = 3;
        num[3] = 25;
        num[4] = 18;

        //IMPRIMINDO OS ARRAYs
        for(int i = 0; i < 5; i++){
            if(i == num.length - 1){
                System.out.println(num[i]);
            }else if(i == 0){
                System.out.print("Array num: " + num[i] + " - ");
            }else{
                System.out.print(num[i] + " - ");
            }
        }

        for(int i = 0; i < num1.length; i++){
            if(i == num1.length - 1){
                System.out.println(num1[i]);
            }else if(i == 0){
                System.out.print("Array numeros: " + num[i] + " - ");
            }else{
                System.out.print(num1[i] + " - ");
            }
        }
    }
}

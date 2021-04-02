package basico.classe_scanner;

import java.util.*;

public class LendoDoTeclado {
    public static void main(String[] args){

        //CRIANDO O OBJETO QUE SERVIRÁ PARA LER QUALQUER TIPO DE DADO DO TECLADO
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        float n1 = 0;
        float n2 = 0;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();  //LENDO String DO TECLDO
        System.out.print("Digite um numero: ");
        n1 = teclado.nextFloat();   //LENDO DADOS DO TIPO float 
        System.out.print("Digite outro numero: ");
        n2 = teclado.nextFloat();   //LENDO DADOS DO TIPO float

        float maior = (n1 + n2 + Math.abs(n1 - n2)) / 2;

        System.out.format("Olá %s, o maior numero foi %.2f!\n", nome, maior);
    }
}

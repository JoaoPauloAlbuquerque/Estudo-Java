package classe_scanner;

import java.util.*;
import java.math.*;

public class LendoDoTeclado {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        float n1 = 0;
        float n2 = 0;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite um numero: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite outro numero: ");
        n2 = teclado.nextFloat();

        float maior = (n1 + n2 + Math.abs(n1 - n2)) / 2;

        System.out.format("Olá %s, o maior numero foi %.2f!\n", nome, maior);
    }
}

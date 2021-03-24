
/*
*       PROVA DE MATEMÁTICA
*   SÃO DISPOSTO 4 QUESTÕES DE  MULTIPLA ESCOLA, 
*   O USUÁRIO DEVE ESCOLHER UMA ALTERNATIVA DE CADA QUESTÃO E AO FINAL
*   ELE RECEBERÁ UMA NOTA DE ACORDO COM AS ALTERNATIvAS ACERTADAS.
*/

package basico.array;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args){

        //CRIANDO OS ARRAYS
        char[] gabarito = {'b','b', 'c', 'c'};
        String[] questoes = {"1) Quanto é 1 + 1?", "2) quanto é 15 - 5? ", "3) Quanto é 5 x 5?", "4) Quanto é a raiz quadrada de 81?"};
        String[][] alternativas = {{"a) 1", "b) 2", "c) 3", "d) 4", "e) 5"}, {"a) 5", "b) 10", "c) 15", "d) 20", "e) 25"}, {"a) 15", "b) 20", "c) 25", "d) 30", "e) 35"},{"a) 3", "b) 6", "c) 9", "d) 12", "e) 15"}}; 
        char[] respostas = new char[gabarito.length];

        //CRIANDO E ATRIBUNDO VARAIVEIS DE CONTROLE DE NOTAS
        float nota = 0.0f;
        double incre = 1.0 / gabarito.length;

        //OBJETO DE SCANNER
        Scanner scan = new Scanner(System.in);

        //LOOP PARA MOSTRAR AS QUESTÕES
        for(int i = 0; i < questoes.length; i++){
            System.out.println(questoes[i]);
            for(int j = 0; j < alternativas[0].length; j++){
                System.out.println(alternativas[i][j]);
            }
            System.out.print("Qual a alternativa correta? > ");
            respostas[i] = scan.nextLine().charAt(0);
            int ope = 0;
            if(respostas[i] == 'a' || respostas[i] == 'b' || respostas[i] == 'c' || respostas[i] == 'd' || respostas[i] == 'e'){
                ope = 1;
            }
            while(ope == 0){
                System.out.println("Alternativa invalida!");
                System.out.print("Digite uma das alternativas acima!a > ");
                respostas[i] = scan.nextLine().charAt(0);
                if(respostas[i] == 'a' || respostas[i] == 'b' || respostas[i] == 'c' || respostas[i] == 'd' || respostas[i] == 'e'){
                    ope = 1;
                }
            }
            if(respostas[i] == gabarito[i]){
                nota += incre;
            }
        }

        //IMPRIMINDO AS NOTAS

        System.out.println("QUESTÕES CORRETAS:");
        for(int i = 0; i < gabarito.length; i++){
            if(gabarito[i] == respostas[i]){
                System.out.printf("Questão %d: %c - acertou\n", i + 1, respostas[i]);
            }else{
                System.out.printf("Questão %d: %c - errou | correta letra %c\n", i + 1, respostas[i], gabarito[i]);
            }
        }

        nota = nota * 10;
        System.out.printf("\nSua nota foi = %.1f\n\n", nota);
    }
}

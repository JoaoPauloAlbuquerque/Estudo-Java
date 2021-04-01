package desafios.jogo_lotofacil;

import java.util.*;

public class LotoFacil {
    
    final int TAM = 15;
    final int TAM1 = 25;

    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    private ArrayList<Integer> percentual = new ArrayList<Integer>();
    private ArrayList<Integer> primeriraSemana = new ArrayList<Integer>();
    private ArrayList<Integer> segundaSemana = new ArrayList<Integer>();
    private ArrayList<Integer> terceiraSemana = new ArrayList<Integer>();
    private ArrayList<Integer> indexMaior = new ArrayList<Integer>();
    private ArrayList<Integer> resultado = new ArrayList<Integer>();

    private Scanner t = new Scanner(System.in);

    //CONSTRUTOR DA CLASSE
    public LotoFacil(){
        addArrayList();
        addPorcentagem();
        lerDados();
        addResultado();
        imprimir();
    }

    //MÉTODO PARA INSERIR OS POSSIVEIS DADOS DA LOTOFACIL
    private void addArrayList(){
        for(int i = 0; i < TAM1; i++){
            numeros.add(i+1);
        }
    }

    //MÉTODO PARA INSERIR AS PORCENTAGENS DOS RESPECTIVOS NUMEMOS
    private void addPorcentagem(){
        for(int i = 0; i < TAM1; i++){
            percentual.add(10);
        }
    }

    //MÉTODO PARA LER DO TECLADO
    private void ler(ArrayList<Integer> array){
        int n;
        for(int i = 0; i < TAM; i++){
            n = t.nextInt();
            if(array.size() == 0){
                array.add(n);
            }
            while(percorrerArray(array, n) != 0){    //VERIFICANDO SE O NÚMERO JA FOI DIGITADO
                System.out.println("Numero já digitado!");
                n = t.nextInt();
            }
            while(n < 1 || n > 25){
                System.out.println("Número inválido!\nDgite um número entre 1 e 25!");
                n = t.nextInt();
            }
            array.add(n);
            int index = percorrerArray(numeros, n);
            percentual.set(index, percentual.get(index) - 1);
        }
    }

    //MÉTODO PARA LER OS DADOS DOS 3 ULTIMOS RESULTADOS
    private void lerDados(){
        System.out.println("Digite o resultado da primeira semana:");
        ler(primeriraSemana);
        System.out.println("Digite o resultado da segunda semana:");
        ler(segundaSemana);
        System.out.println("Digite o resultado da terceira semana: ");
        ler(terceiraSemana);
    }

    //MÉTODO PARA PERCORRER O ARRAYLIST E PEGAR O INDEX DO ELEMENTO N
    private int percorrerArray(ArrayList<Integer> array, int n){
        int index = 0;
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).equals(n)){
                index = i;
            }
        }
        return index;
    }

    //MÉTODO PARA SELECIONAR OS RESULTADOS
    private void addResultado(){

        for(int i = 0; i < TAM1; i++){
            if(percentual.get(i) == 10){                //
                indexMaior.add(i);
            }
        }
        for(int i = 0; i < TAM1; i++){
            if(percentual.get(i) == 9){                 //
                indexMaior.add(i);                  
            }                                                    //SELECIONANDO OS NUMEROS COM MENOR INDICES DE REPETIÇÃO
        }
        for(int i = 0; i < TAM1; i++){
            if(percentual.get(i) == 8){                 //
                indexMaior.add(i);
            }
        }
        for(int i = 0; i < TAM1; i++){   
            if(percentual.get(i) == 7){                 //
                indexMaior.add(i);
            }
        }

        //ADICIONANDOS OS NUMEROS NO RESULTADO
        for(int i = 0; i < TAM; i++){
            resultado.add(numeros.get(indexMaior.get(i)));
        }
    }

    //IMPTIMINO OS NUMEROS PREMIADOS
    private void imprimir(){
        Collections.sort(resultado); //COLOCANDO OS NUMEROS EM ORDEM
        System.out.print("\nEstes são os números do próximo sorteio: ");
        for(int i = 0; i < resultado.size(); i++){
            if(i == resultado.size() - 1){  //VERIFICANDO SE O INTEM É O ULTIMO DA POSIÇÃO
                System.out.printf("%d\n\n", resultado.get(i));
            }else{
                System.out.printf("%d - ", resultado.get(i));
            }
        }
    }    

    //MÉTODO main
    public static void main(String[] args){
        new LotoFacil();
    }
}

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
            array.add(n);
            int index = percorrerArray(numeros, n);
            percentual.set(index, percentual.get(index) - 1);
        }
    }

    //MÉTODO PARA LER OS DADOS DA PRIMEIRA E SEGUNDA SEMANA
    private void lerDados(){
        System.out.println("Digite o resultado da primeira semana:");
        ler(primeriraSemana);
        System.out.println("Digite o resultado da segunda semana:");
        ler(segundaSemana);
        System.out.println("Digite o resultado da terceira semana: ");
        ler(terceiraSemana);
    }

    //MÉTODO PARA PERCORRER O ARRAYLIST E PEGAR O INDEX
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

        //SELECIONANDO OS INDEXS DOS ELEMENTOS COM MAIS FRENQUENCIA
        /*int index = 0;
        for(int i = 0; i < 25; i++){
            if(percentual.get(i) >= percentual.get(index)){
                indexMaior.add(i);
                index++;
            }else{
                indexMaior.add(0, i);
            }
        }*/

        for(int i = 0; i < 25; i++){
            if(percentual.get(i) == 10){
                indexMaior.add(i);
            }
        }
        for(int i = 0; i < 25; i++){
            if(percentual.get(i) == 9){
                indexMaior.add(i);
            }
        }
        for(int i = 0; i < 25; i++){
            if(percentual.get(i) == 8){
                indexMaior.add(i);
            }
        }
        for(int i = 0; i < 25; i++){
            if(percentual.get(i) == 7){
                indexMaior.add(i);
            }
        }

        //ADICIONANDO OS ELEMENTOS NO RESULTADO
        //int j = 24;
        for(int i = 0; i < 15; i++){
            resultado.add(numeros.get(indexMaior.get(i)));
            //j--;
        }
    }

    //IMPTIMINO OS NUMEROS PREMIADOS
    private void imprimir(){
        //Collections.sort(resultado);
        for(int i:percentual){
            System.out.printf("%2d - ", i);
        }
        System.out.print("\n");
        for(int i:indexMaior){
            System.out.printf("%2d - ", i);
        }
        System.out.print("\n");
        System.out.print("\nEstes são os números do próximo sorteio: ");
        for(int i = 0; i < resultado.size(); i++){
            if(i == resultado.size() - 1){
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

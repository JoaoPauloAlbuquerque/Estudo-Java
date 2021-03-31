package desafios.jogo_lotofacil;

import java.util.*;

public class LotoFacil {
    
    final int TAM = 15;
    final int TAM1 = 25;

    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    private ArrayList<Integer> percentual = new ArrayList<Integer>();
    private ArrayList<Integer> primeriraSemana = new ArrayList<Integer>();
    private ArrayList<Integer> segundaSemana = new ArrayList<Integer>();
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

    //MÉTODO PARA LER OS DADOS DA PRIMEIRA E SEGUNDA SEMANA
    private void lerDados(){
        System.out.println("Digite o resultado da primeira semana:");
        for(int i = 0; i < TAM; i++){
            int n = t.nextInt();
            if(percorrerArray(primeriraSemana, n) != 0){    //VERIFICANDO SE O NÚMERO JA FOI DIGITADO
                System.out.println("Numero já digitado!");
            }else{
                primeriraSemana.add(n);
                int index = percorrerArray(numeros, n);
                percentual.set(index, percentual.get(index) - 1);
            }

        }
        
        System.out.println("Digite o resultado da segunda semana:");
        for(int i = 0; i < TAM; i++){
            int n = t.nextInt();
            if(percorrerArray(segundaSemana, n) != 0){      //VERIFICANDO SE O NÚMERO JA FOI DIGITADO
                System.out.println("Numero já digitado!");
            }else{
                segundaSemana.add(n);
                int index = percorrerArray(numeros, n);
                percentual.set(index, percentual.get(index) - 1);
            }
        }
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
        int index = 0;
        for(int i = 0; i < TAM1; i++){
            if(percentual.get(i) >= percentual.get(index)){
                indexMaior.add(i);
                index = i;
            }else{
                indexMaior.add(0, i);
            }
        }

        //ADICIONANDO OS ELEMENTOS NO RESULTADO
        int j = 24;
        for(int i = 0; i < TAM; i++){
            resultado.add(i, numeros.get(indexMaior.get(j)));
            j--;
        }
    }

    //IMPTIMINO OS NUMEROS PREMIADOS
    private void imprimir(){
        Collections.sort(resultado);
        System.out.println("\n");
        for(int i = 0; i < resultado.size(); i++){
            System.out.printf("%d - ", resultado.get(i));
        }
    }    

    //MÉTODO main
    public static void main(String[] args){
        new LotoFacil();
    }
}

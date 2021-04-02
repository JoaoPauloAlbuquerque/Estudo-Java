package basico.metodos;

public class Metodos {

    //MÉTODO SEM RETORNO E SEM PARAMETROS PARA IMPRIMIR "OLÁ MUNDO NA" TELA
    public static  void olaMundo(){
        System.out.println("Olá, mundo!");
    }

    //MÉTODO COM RETORNO SEM PARAMETROS PARA SOMAR OS NÚMEROS INTEIROS 5 + 5
    public static int somar(){
        return 5 + 5;   //UTILIZA-SE O "return" APENAS PARA MÉTODOS QUE RETORNAM ALGO, 
    }                   //OU SEJA, METÓDOS EM QUE O TIPO É DIFERENTE DE "void"

    //MÉTODO COM RETORNO E COM PARAMETROS PARA SOMAR DOIS NUMEROS INTEIROS QUAIS QUER
    public static int somarDoisNumeros(int numero1, int numero2){
        return numero1 + numero2;
    }

    //MÉTODO COM RETORNO E COM PARAMETROS PARA SOMAR Ns NÚMEROS INTEIROS
    public static int somarVariosNumeros(int... numeros){
        int resultado = 0;
        for(int n:numeros){
            resultado += n;
        }
        return resultado;
    }

    public static void main(String[] args){

        //CHAMANDO OS MÉTODOS

        olaMundo(); //PARA ESTE MÉTODO, NÃO É PRECISO PASSAR NENHUM PARAMETRO, ENTÃO É SO FAZER A CHAMADA 

        System.out.println(somar());    //COMO ESTE MÉTODO TEM RETORNO, EU PRECISO ADICIONAR ELE A UMA VARIAVEL, 
                                        //OU FAZER A IMPRESSÃO DO RETORNO, QUE FOI EXATAMENTE O QUE EU FIZ.

        int n = somarDoisNumeros(15, 5);    //COMO ESTE MÉTODO RETORNA ALGO E PRECISA DE PARAMETROS PARA QUE O PROGRAMA ENTENDA QUAIS 
                                            //NÚMEROS VÃO SER SOMADOS, EU PRECISO ADICIONAR ELE À UMA VARIÁVEL (OU FAZER A IMPRESSÃO DELES DIRETAMENTE)
                                            //DENTRO DOS PARÊNTESES QUAIS NÚMEROS EU IREI SOMAR.

        int n1 = somarVariosNumeros(2,5,10,15); //ESTE MÉTODO EU POSSO PASSAR QUANDO NÚMEROS EU QUIZER, 
                                                //NESTE EXEMPLO, OU UTILIZEI DE 4 NUMEROS, MAS PODEMOS VER NO EXEMPLO 
                                                //ABAIXO QUE PARA O MESMO MÉSMO MÉTODO EU UTILIZEI OUTRA QUANTIDADE DE PARAMETROS

        int n2 = somarVariosNumeros(5,7,20,30,15,8);

        System.out.println("Método somarNumeros: " + n);
        System.out.println("Método somarVariosNumeros: " + n1);
        System.out.println("Método somarVariosNumeros: " + n2);
    }
}

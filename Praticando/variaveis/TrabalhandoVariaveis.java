package variaveis;

public class TrabalhandoVariaveis{
    public static void main(String[] args){
        int v1 = 10;
        String texto = "Pedro";
        float real = 15.6f;

        real = real + v1;

        v1 = (int)real; //nesse caso o java vai arredondar o  numero

        System.out.println(real);
        System.out.println(v1);
        System.out.println(texto);
    }
}
package desafios.estacionamento;

public class Carro{

    private String cor;
    private String nome;
    private String placa;
    private int velMax;

    public Carro(String cor, String nome, String placa, int velMax){
        this.cor = cor;
        this.nome = nome;
        this.placa = placa;
        this.velMax = velMax;
    }

    public String getCor(){
        return cor;
    }

    public String getNome(){
        return nome;
    }

    public String getPlaca(){
        return placa;
    }

    public int getVelMax(){
        return velMax;
    }
}
package desafios.estacionamento;

public class Estacionamento{
    public static void main(String[] args){

        Carro c1 = new Carro("verde", "c1","MUX0133", 140);
        Carro c2 = new Carro("Branco", "c2", "ALZ4525", 160);
        Carro c3 = new Carro("Azul", "c3", "APE1478", 140);
        Carro c4 = new Carro("Preto", "c4", "MDF7855", 220);
        Carro c5 = new Carro("Branco", "c5", "MDK5522", 180);
        Carro c6 = new Carro("Vermelho", "c6", "VWY2322", 200);
        Carro c7 = new Carro("Cinza", "c7", "WFG6554", 160);
        Carro c8 = new Carro("Azul", "c8", "ABC8521", 260);
        Carro c9 = new Carro("Preto", "c9", "WHJ4413", 220);
        Carro c10 = new Carro("Prata", "c10", "YHD3225", 140);

        Carro[] carrosEstacionados = {c1, c2, c3, c4, c5, c6, c7};

        System.out.println("Carros estacionados");
        for(int i = 0; i < carrosEstacionados.length; i++){
            System.out.printf("\nCarro %s\nCor: %s\nPlaca: %s\nValocidade Max: %s\n", carrosEstacionados[i].getNome(), carrosEstacionados[i].getCor(), carrosEstacionados[i].getPlaca(), carrosEstacionados[i].getVelMax());
        }
        System.out.println("\nTotalizando " + carrosEstacionados.length + " veículos estacionados.");
    }
}
package models;

public class Carro extends Veiculo {
    public String modelo;
    public int ano;
    public String cor;

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }

    // Conceito de Herança:
    // - Permite que uma classe herde atributos e métodos de outra.
    @Override
    public void Mover(){
        System.out.println("O Carro está se movendo!!!");
    }
}

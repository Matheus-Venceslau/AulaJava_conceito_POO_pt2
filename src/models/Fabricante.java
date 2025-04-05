package models;

public class Fabricante extends ModelosAno{
    public Long Id;

    public String modelo;
    public int ano;
    public String cor;

    // Conceito de polimorfismo
    // - Permite que um método tenha comportamentos diferentes dependendo da classe.
    //- Permite criar novas classes baseadas em uma classe existente.
    //- A classe filha herda os atributos e métodos da classe pai.

    @Override
    public void VeiculoDoAno(){
        System.out.println("Polimorfismo aplicado");
    }
}

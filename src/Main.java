import models.Carro;
import models.ContaBancaria;
import models.Fabricante;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "Toyota Corolla";
        carro.ano = 2022;
        carro.cor = "Preto";

        carro.exibirInfo();
        System.out.println();
        carro.Mover();

        Fabricante fabricante = new Fabricante();

        fabricante.VeiculoDoAno();

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.getSaldo();
    }
}

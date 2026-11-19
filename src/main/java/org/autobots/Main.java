package org.autobots;


public class Main {
    public static void main(String[] args) {
        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);

        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);

        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

        Autobot mirage = new Autobot("Mirage", 0.0, 7);

        Autobot car = new Autobot("car", 0.0, 1);


        gerenciador.adicionar(optimus);
        gerenciador.adicionar(bumblebee);
        gerenciador.adicionar(ratchet);
        gerenciador.adicionar(mirage);
        gerenciador.adicionar(car);


        System.out.println("Energon total: " + gerenciador.calcularEnergonTotal());

        Autobot encontrado = gerenciador.buscar("Bumblebee");

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Autobot nao encontrado");
        }
        gerenciador.reparar(ratchet);
        System.out.println("Energon do Ratchet: " + ratchet.getEnergon());
        System.out.println("Classificacao: " + gerenciador.classificar(ratchet));


        System.out.println("Autobots com energon 0 ou negativo;");
        for (Autobot a : gerenciador.listarIndisponiveis()) {
            System.out.println("Nome: "+ a.getNome());
        }

    }
}


package org.autobots;

// nomes das variaveis alterados para boas práticas de leitura de código e variaveis passadas para private
// para seguir encapsulamento
public class Autobot {

    private String nome;
    private double energon;
    private int nivel;


    public Autobot( String nome,double energon, int nivel) {

        if(nivel < 1 || nivel > 10){
            throw new IllegalArgumentException("O nível do Autobot deve estar entre 1 e 10");
        }

        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    //Getters e setter criados para seguir as boas práticas de encapsulamento de POO
    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

